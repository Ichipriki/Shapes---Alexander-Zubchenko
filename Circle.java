public class Circle extends Shape{

    private double radius;

    public Circle(){
        this.radius = 0;
    }
    public Circle(int radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public int calculatePerimeter(){
        return (int)(2*Math.PI*radius);
    }

    public int calculateArea(){
        return (int)(Math.PI*radius*radius);
    }

}
