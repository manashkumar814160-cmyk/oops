import java.util.Scanner;
public class sumoftwointegers {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num");
    int num = sc.nextInt();
    System.out.print("Enter the second num");
    int second = sc.nextInt();
    int sum = num + second;
    System.out.println("sum="+sum);
}
}
