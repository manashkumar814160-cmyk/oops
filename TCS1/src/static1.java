package blockstatic;
class lmstest{
    static{
        System.out.println("lmstest Application is startetd!\n wifi configuration details");
        System.out.println("lmstest Application is startetd!");
    }
    public void startTest(){
        System.out.println("Attempt test");
    }
}

public class static1 {
    public static void main(String[] args){
        System.out.println("welcome to safe exam browser");
        lmstest obj = new lmstest();
        System.out.println("wait!!!!!!!!!checking!!!!!!!");
        obj.startTest();
    }


}