package geo;
public class Geometrics {
    private static double x = 10.0;
    private static double y = 5.0;
    private static double z = 3.0;
    private static int x1 = 8;
    private static int y1 = 7;
    private static int z1 = 10;
    private static int x2 = 100;
    private static int y2 = 57;
    private static int z2 = 129;
    private static int x3 = 45;
    private static int y3 = 89;
    private static int z3 = 69;

    public static void main(String[] args) {
        SquareArea(x );
        SquarePerimeter(y);
        RectangleArea(x, y);
        RectanglePerimeter(x, y);
        
        // area ... Fläche
        System.out.println("Square area");
        System.out.println(SquareArea(10.0 ));
        System.out.println(SquareArea(8));
        System.out.println(SquareArea(100));
        System.out.println(SquareArea(5.0));

        // perimeter ... Umfang
        System.out.println("Square perimeter");
        System.out.println(SquarePerimeter(10.0));
        System.out.println(SquarePerimeter(8));
        System.out.println(SquarePerimeter(100));
        System.out.println(SquarePerimeter(5.0));

        System.out.println("Rectangle area");
        System.out.println(RectangleArea(10.0, 5.0));
        System.out.println(RectangleArea(8, 7));
        System.out.println(RectangleArea(57, 57));
        System.out.println(RectangleArea(45, 89));

        System.out.println("Rectangle perimeter");
        System.out.println(RectanglePerimeter(10.0, 5.0));
        System.out.println(RectanglePerimeter(8, 7));
        System.out.println(RectanglePerimeter(100, 57));
        System.out.println(RectanglePerimeter(45, 89));

        System.out.println("We can also calculate some volumes");
        /*
            z is our height
            y is our radius
         */
        System.out.println("Zone of a sphere");
        double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
        System.out.println(v);

        System.out.println("Sphere with cylinder");
        System.out.println(Math.PI * Math.pow(z, 3) / 6);

        System.out.println("Ungula");
        System.out.println((double) (2 * x3 * z3) / 3);
    }
    public static double SquareArea (double x) {
        return x*x;        
    }
    public static double SquarePerimeter(double y) {
        return 4*y;
    }
    public static double RectangleArea(double x, double y) {
        return x*y;
    }
    public static double RectanglePerimeter(double x, double y) {
        return x+y;
    }
}
