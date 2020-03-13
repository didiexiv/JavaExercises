package mypackage;

public class MainClass {

    public static void main(String[] args) {
        /*
        double number = 3.45;
        What is the result of ceil, floor, round, abs of Math class?
        What are the results of the above if number = -3.45?
         */
        double number = -3.45;
        double a = Math.ceil(number);
        double b = Math.floor(number);
        long c = Math.round(number);
        double d = Math.abs(number);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }

}
