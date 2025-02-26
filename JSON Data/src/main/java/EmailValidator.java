import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileInputStream;

public class EmailValidator {
    public static void main(String[] args) {
        String schemaPath = "src/main/resources/schema.json";
        String dataPath = "src/main/resources/email.json";

        try {
            FileInputStream schemaStream = new FileInputStream(new File(schemaPath));
            JSONObject rawSchema = new JSONObject(new JSONTokener(schemaStream));
            Schema schema = SchemaLoader.load(rawSchema);

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonData = objectMapper.readTree(new File(dataPath));
            JSONObject jsonObject = new JSONObject(jsonData.toString());

            schema.validate(jsonObject);
            System.out.println(" Email validation successful!");
        } catch (Exception e) {
            System.err.println(" Email validation failed: " + e.getMessage());
        }
    }
}
