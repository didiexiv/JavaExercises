public class RelationalOperators{

   public static void main(String [] args){
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      System.out.printf("Numbers entered :%d,%d, %d\n",a,b,c);
      System.out.println(a + "!=" + b+":"+ (a!=b));
      System.out.println(a + "<" + b+":"+ (a<b));
      System.out.println(a + ">" + b+":"+ (a>b));
      System.out.println(a + "<=" + b+":"+ (a<=b));
      System.out.println(a + ">=" + b+":"+ (a>=b));
      System.out.println("****Printing Logical Operators****");
      System.out.printf("Are %d and %d bigger than %d:%b\n",a,b,c,((a>c)&&(b>c)));
      System.out.printf("Is one of the numbers %d, %d bigger than %d:%b\n",a,b,c,((a>c)||(b>c)));
      System.out.printf("Are all numbers %d, %d, %d positive:%b\n",a,b,c, !(a<0 || b<0 || c<0) );
							//3,7,-10	   false||false||true
   }

}