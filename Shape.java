public class Shape {
    private String color;
    private Boolean filled;

    public Shape(){
        color = "";
        filled = false;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public Boolean isFilled(){
        return filled;
    }

    public int calculateArea(){
        return 0;
    }
    public int calculatePerimeter(){
        return 0;
    }
    public void displayInfo(){
        System.out.println("Color: "+color+" Filled: "+filled);
    }

}
