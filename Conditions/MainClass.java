package mypackage;

/**
 *
 * @author user
 */
public class MainClass {

    public static void main(String[] args) {
        int numberOfDay = 25;
        String message;
//        if(numberOfDay<=15){
//            message = "First half of month";
//            //System.out.println("First half of month");
//        }else{
//            message = "Second half of month";
//            //System.out.println("Second half of month");
//        }
//        System.out.println(message);
        //Ternary operation
                        //condition       ? true                : false
        message = (numberOfDay<=15)?"First half of month":"Second half of month";
        
        System.out.println(message);
        System.out.println("*******Switch statement***********");
//        if(bathmos == 'A'){
//            System.out.println("Excellent");
//        }else if(bathmos == 'B'){
//            System.out.println("Well Done");
//        }else if(bathmos == 'C'){
//            System.out.println("Very Good");
//        }else if(bathmos == 'D'){
//            System.out.println("Good");
//        }else if(bathmos == 'E'){
//            System.out.println("Pass");
//        }else if(bathmos == 'F'){
//            System.out.println("Fail");
//        }
        char bathmos = 'C';
        final char value = 'B';//cannot change value because it is final
        switch(bathmos){//Switch accepts byte, short, integer, char, String 
            case 'A'://Every case statement must be able to be assigned into the variable
                System.out.println("Excellent");
                break;
            case value://only constants (final) variables
                System.out.println("Well Done");
                break;
            case 'C':
                System.out.println("Very Good");
                break;
            case 'D':
                System.out.println("Good");
                break;
            case 'E':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

}
