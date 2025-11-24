public class StaticAtm {
    public static String pincheck(int pin){
        if(pin>=1000 && pin<=9999)
            return "vaild";
        else
            return "invalid";
    }
    public static void main(String[] args){
        int pin1=5768;
        int pin2=57689;
        System.out.println(pincheck(pin1));
        System.out.println(pincheck(pin2));
    }
}


