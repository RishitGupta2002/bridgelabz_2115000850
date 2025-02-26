import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.csv.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IplCensorAnalyzer {

    public static void main(String[] args) {
        String jsonInputPath = "src/main/resources/ipl_matches.json";
        String csvInputPath = "src/main/resources/ipl_matches.csv";
        String jsonOutputPath = "src/main/resources/censored_ipl_matches.json";
        String csvOutputPath = "src/main/resources/censored_ipl_matches.csv";

        try {
     
            processJson(jsonInputPath, jsonOutputPath);

          
            processCsv(csvInputPath, csvOutputPath);

            System.out.println("✅ Censorship completed! Check the output files.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processJson(String inputPath, String outputPath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode matches = objectMapper.readTree(new File(inputPath));

        for (JsonNode match : matches) {
          
            String team1 = match.get("team1").asText();
            String team2 = match.get("team2").asText();
            ((com.fasterxml.jackson.databind.node.ObjectNode) match).put("team1", maskTeamName(team1));
            ((com.fasterxml.jackson.databind.node.ObjectNode) match).put("team2", maskTeamName(team2));

          
            ((com.fasterxml.jackson.databind.node.ObjectNode) match).put("player_of_match", "REDACTED");
        }

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputPath), matches);
    }

    private static void processCsv(String inputPath, String outputPath) throws IOException {
        try (Reader reader = Files.newBufferedReader(Paths.get(inputPath));
    	        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.builder().setHeader().setSkipHeaderRecord(true).build());
    	        BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath));
    	        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.builder()
    	                .setHeader("match_id", "team1", "team2", "score_team1", "score_team2", "winner", "player_of_match")
    	                .build())
    	    ) {
        	
            for (CSVRecord record : csvParser) {
                List<String> censoredRow = new ArrayList<>();
                censoredRow.add(record.get("match_id"));
                censoredRow.add(maskTeamName(record.get("team1")));
                censoredRow.add(maskTeamName(record.get("team2")));
                censoredRow.add(record.get("score_team1"));
                censoredRow.add(record.get("score_team2"));
                censoredRow.add(maskTeamName(record.get("winner")));
                censoredRow.add("REDACTED");

                csvPrinter.printRecord(censoredRow);
            }
        }
    }

    private static String maskTeamName(String teamName) {
        String[] words = teamName.split(" ");
        if (words.length > 1) {
            return words[0] + " ***";
        }
        return teamName;
    }
}
