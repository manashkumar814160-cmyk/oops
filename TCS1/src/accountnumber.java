import java.util.*;
class detail{
    long acno;
    double balance;
    double interestrate=5;
    String actype;

    public void withdraw(int x){
        if(x>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance=balance-x;
            System.out.println("Withdrawn");
            System.out.println("Withdrawn balance is"+x);
            System.out.println("Current balace is"+balance);
        }
    }
    public void accdet(long x,double y,double bal,String act){
        acno=x;
        balance=y;
        interestrate=bal;
        actype=act;

    }
    public void deposit(int x){
        balance+=x;
        System.out.println("Deposited");
        System.out.println("Deposited balance is"+balance);
    }
    public void interset(){
        if(actype.equals("Saving")) {
            double p = (balance * 1 * interestrate) / 100;
            System.out.println("Interest given is " + p);
        }
        else{
            System.out.println("NOT APPLICABLE");
        }
    }
    public void getdetail(){
        System.out.println("acno:"+acno);
        System.out.println("balance:"+balance);
        System.out.println("interestrate:"+interestrate);
        System.out.println("actype:"+actype);
    }


}
public class accountnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        detail g=new detail();
        g.accdet(344354,2343,5,"Saving");
        detail g2=new detail();
        g2.accdet(3525252,2345685,5,"Saving");
        detail g3=new detail();
        g3.accdet(35252521,2345385,5,"Current");
        System.out.println("Enter acno");
        long accs=sc.nextLong();
        System.out.println("Enter 1 to Withdraw Balance");
        System.out.println("Enter 2 to Deposit");
        System.out.println("Enter 3 to Calculate interest rate");
        System.out.println("Enter 4 to Display account details");
        int y=sc.nextInt();
        if(y==1){
            System.out.println("Enter the money to be withdraw");
            int a=sc.nextInt();
            if(accs==44354)
                g.withdraw(a);
            else if(accs==3525252)
                g2.withdraw(a);
            else if(accs==5252521)
                g3.withdraw(a);
        }
        else if(y==2){
            System.out.println("Enter the money to be deposited");
            int a=sc.nextInt();
            if(accs==44354)
                g.deposit(a);
            else if(accs==3525252)
                g2.deposit(a);
            else if(accs==5252521)
                g3.deposit(a);
        }
        else if(y==3){
            if(accs==44354)
                g.interset();
            else if(accs==3525252)
                g2.interset();
            else if(accs==5252521)
                g3.interset();
        }
        else if(y==4){
            if(accs==44354)
                g.getdetail();
            else if(accs==3525252)
                g2.getdetail();
            else if(accs==5252521)
                g3.getdetail();

        }

    }

}