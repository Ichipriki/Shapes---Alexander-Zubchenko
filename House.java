public class House extends Shape{
    private Square body;
    private Triangle roof;
    public House(String color, boolean filled, int length) {
        super(color, filled);
        body = new Square(length, color, filled);
        roof = new Triangle(length, length, length, color, filled);
    }

    public int calculateArea() {
        return body.calculateArea() + roof.calculateArea();
    }
    public int calculatePerimeter() {
        int a = roof.calculatePerimeter();
        int b = body.calculatePerimeter();
        return (a + b);
    }

    public double getSize() {
        return body.getLength();
    }

    public void setSize(int size) {
        body = new Square(size, getColor(), isFilled());
        roof = new Triangle(size, size, size, getColor(), isFilled());
    }

}
