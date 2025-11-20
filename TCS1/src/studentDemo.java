class student{
    int roll;
    String name;
    String Dept;
    int mar;
    //methods
    public void getdetails(int roll,String name,String Dept,int mar){
        this.roll=roll;
        this.name=name;
        this.Dept=Dept;
        this.mar=mar;
    }
    public void printdetails(){
        System.out.println("Roll no.: "+this.roll);
        System.out.println("Name.: "+this.name);
        System.out.println("Dept.: "+this.Dept);
        System.out.println("Mar.: "+this.mar);
    }


}


public class studentDemo {
    public static void main(String[] args){
        student s=new student();
        s.getdetails(121,"Manash kumar","ECE",99);
        s.printdetails();
        s.getdetails(77,"Bhavesh kumar","CSE",99);
        s.printdetails();
        s.getdetails(71,"Faizu Kumar","CSE",99);
        s.printdetails();

    }

}

