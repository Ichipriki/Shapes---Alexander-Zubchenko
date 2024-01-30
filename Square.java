public class Square extends Rectangle{

    public Square(int length, String color, boolean filled) {
        super(length, length, color, filled);
    }
    public int getSide(){
        return (int)super.getLength();
    }










}
