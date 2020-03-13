public class Grades{
  public static void main(String [] args){
     int grade = Integer.parseInt(args[0]);
     if(grade >= 0){
       if(grade < 50){
        System.out.println("F");
       }else if(grade < 60){
        System.out.println("E");
       }else if(grade < 70){
        System.out.println("D");
       }else if(grade < 80){
        System.out.println("C");
       }else if(grade < 90){
        System.out.println("B");
       }else if(grade <= 100){
        System.out.println("A");
       }else {
        System.out.println("Invalid number");
       }
     }else{
        System.out.println("Invalid number");
     }
     
  }


public static void nestedIf(int grade){
if(grade >= 50){
        if(grade >= 90){
           System.out.println("You did excellent!");
        }else{
           System.out.println("You did well!");
        }
        System.out.println("You passed");
     } else {
        System.out.println("You failed");
     }
}
}