public class Pentagon extends Shape {
    private double side;

    public Pentagon(String color, boolean filled, int side) {
        super(color, filled);
        this.side = side;
    }

    public int calculateArea() {
        return (int)(Math.sqrt(5*(5+2*Math.sqrt(5)))*side*side*0.25);
    }

    public int calculatePerimeter() {
        return (int)(5.0*side);
    }

    public double getSide() {
        return side;
    }






}
