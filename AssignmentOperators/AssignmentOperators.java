public class AssignmentOperators{

   public static void main(String [] args){
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       a *= 2;//no space between
       a += 5;
       a *= 50;
       a += 1769;
       a -= b;
       System.out.println("The magic number is:"+a);
   }



}