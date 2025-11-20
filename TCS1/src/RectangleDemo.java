import java.util.Scanner;
class Rectangle{
    private double length;
    private double width;
    public void getdeatils(double l,double b){
        length=l;
        width=b;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    public void display(){
        System.out.println("Area of Rectangle: "+area());
        System.out.println("Perimeter of Rectangle: "+perimeter());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        double l=sc.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double b=sc.nextDouble();
        Rectangle r=new Rectangle();
        r.getdeatils(l,b);
        r.display();
        sc.close();
    }
}


