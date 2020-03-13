package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        ArrayList<String> daysOfTheWeek = new ArrayList();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");
        //for-traditional
//        for(int i=5;i<daysOfTheWeek.size();i++){
//            System.out.println(i+1+". "+daysOfTheWeek.get(i));
//        }

        //for enhanced
//        for(String day: daysOfTheWeek){//prints every day of the list
//            System.out.println(day);
//        }
        int[] array = {4, 2, 6, 10};
//        for(int number: array){
//            System.out.print(number+" ");
//        }
        //use a for-traditional to print numbers of the array but not 4
        System.out.println("*****Print all numbers except 4*******");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                continue;//go to the next iteration
            }
            System.out.print(array[i] + " ");

        }
        //if array contains number 2 stop printing the array
        System.out.println("\n*****If 2 is found, stop printing*****");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                break;//
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\n****Using do...while loop****");
        int i = 10;
        do {//will always execute at least one time
            System.out.print(i + " ");
            System.out.println("Entered do...while loop");
            i += 2;
        } while (i < 0);
        System.out.println("\ni=" + i);
        System.out.println("*********Printing while loop********");
        i = 15;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
    }

}
