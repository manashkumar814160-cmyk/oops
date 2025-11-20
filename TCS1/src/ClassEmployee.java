class  Employee{
    long empid;
    String empname;
    String desig;
    double Sala;
    // methods
    public void getdetail(long e,String n,String d,double s){
        empid=e;
        empname=n;
        desig=d;
        Sala=s;
    }
    public void printdetails(){
        System.out.println("Employee details:");
        System.out.println("Employee id: "+empid);
        System.out.println("Employee name: "+empname);
        System.out.println("Employee desig: "+desig);
        System.out.println("Employee Sala: "+Sala);
    }

}


public class ClassEmployee {
   public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getdetail(1L,"Manash","Softare engineer",100033.0);
        emp.printdetails();
        emp.getdetail(2L,"bhavesh","Softare engineer",100463000.0);
        emp.printdetails();
        emp.getdetail(3L,"Faizu","Business man",1006732.0);
        emp.printdetails();
    }
}