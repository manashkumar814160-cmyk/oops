import java.util.Scanner;
class Complexnumber {
    private double real;
    private double imag;

    public void getDetails(double r, double i) {
        real = r;
        imag = i;
    }

    public Complexnumber add(Complexnumber c) {
        Complexnumber result = new Complexnumber();
        result.real = this.real + c.real;
        result.imag = this.imag + c.imag;
        return result;
    }

    public Complexnumber subtract(Complexnumber c) {
        Complexnumber result = new Complexnumber();
        result.real = this.real - c.real;
        result.imag = this.imag - c.imag;
        return result;
    }

    public void display() {
        System.out.println("Complex Number: " + real + " + " + imag + "i");
    }
}
public class ComplexNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary parts of first complex number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        System.out.print("Enter real and imaginary parts of second complex number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        Complexnumber c1 = new Complexnumber();
        c1.getDetails(r1, i1);

        Complexnumber c2 = new Complexnumber();
        c2.getDetails(r2, i2);

        Complexnumber sum = c1.add(c2);
        Complexnumber difference = c1.subtract(c2);

        System.out.println("First Complex Number:");
        c1.display();

        System.out.println("Second Complex Number:");
        c2.display();

        System.out.println("Sum of Complex Numbers:");
        sum.display();

        System.out.println("Difference of Complex Numbers:");
        difference.display();

        sc.close();
    }

}






