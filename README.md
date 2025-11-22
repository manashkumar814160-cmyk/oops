package blockstatic;

import java.util.Scanner;
class offer {
    static double elct=0.10;
    static double fashi=0.20;
//    static {
//        float elct = 0.10;
//        double fashi = 0.20;
//
//    }
}
public class festivaliscount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if product is electronic: ");
        System.out.println("Enter 2 if product is Fashion: ");
        int n=sc.nextInt();
        offer x=new offer();
        int pric1=0;
        double price=0;
        switch(n){
            case 1:
                System.out.println("Enter the price of poduct: ");
                pric1=sc.nextInt();
                price=pric1+(pric1*x.elct);
                break;
            case 2:
                System.out.println("Enter the price of poduct: ");
                pric1=sc.nextInt();
                price=pric1+(pric1*x.fashi);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println("price is  "+price);

    }
}
