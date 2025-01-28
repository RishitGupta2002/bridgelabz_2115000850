import java.util.Scanner;
public class CollinearPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        boolean bySlope = collinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean byArea = collinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println(bySlope);
        System.out.println(byArea);
        sc.close();
    }

    public static boolean collinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slope1 = (double) (y2 - y1) / (x2 - x1);
        double slope2 = (double) (y3 - y2) / (x3 - x2);
        double slope3 = (double) (y3 - y1) / (x3 - x1);
        return slope1 == slope2 && slope2 == slope3;
    }

    public static boolean collinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
