import java.util.*;

 class Box {

    private double length;
    private double  width;
    private double  height;
    Box()   //default constructor
    {
        length = 10;
        width = 20;
        height = 15;
    }
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
    }
    Box(Box b)
    {
 length =  b.length;
 width = b.width;
 height= b.height;
    }
    public double volume()
    {
        double vol = length*width*height;
        return vol;
    }
}
public class Boxdemo{
    public static void main(String[] args) {
        Box B1 = new Box();
        Box B2 = new Box(20,12,34);
        Box b3 = new Box (B1);
    System .out.println("Box 1 volume :" +B1.volume());
    System .out.println("Box 1 volume :" +B2.volume());
    System .out.println("Box 1 volume :" +b3.volume());
    }
}

