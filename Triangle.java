public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle (int side1, int side2, int side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }

    public int calculatePerimeter(){
        return (int)(side1+side2+side3);
    }

    public int calculateArea(){
        double s = (side1+side2+side3)/2;
        return (int)Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}
