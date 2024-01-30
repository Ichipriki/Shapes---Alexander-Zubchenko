public class Main {
    public static void main(String[] args) {

        Shape a = new Circle(9, "red", true);
        System.out.println(a.calculateArea());

        Shape[] Shapes = new Shape[2];
        Shapes[0] = new Triangle(3, 6, 1, "red", true);
        Shapes[1] = new Rectangle(15, 10, "black", true);
        for (int i = 0; i<Shapes.length; i++){
            System.out.println(Shapes[i].calculatePerimeter());
        }
    }
}
