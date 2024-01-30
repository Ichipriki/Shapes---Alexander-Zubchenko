public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(int length, int width, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public int calculateArea(){
        return (int)(length*width);
    }
    public int calculatePerimeter(){
        return (int)(length*2 + width*2);
    }
}
