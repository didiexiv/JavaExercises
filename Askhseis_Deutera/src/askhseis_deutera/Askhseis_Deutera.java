package askhseis_deutera;

import java.util.Scanner;

public class Askhseis_Deutera {

    public static void main(String[] args) {
//         What class in school are you going according to age;
//         Use an if-else-if.
//         For example: 5-12 dimotiko,
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me your age");
        int age = input.nextInt();

        if (age < 5) {
            System.out.println("nipio");
        } else if (age >= 5 && age < 13) {
            System.out.println("dimotiko");
        } else if (age >= 13 && age <= 15) {
            System.out.println("gymnasio");
        } else if (age >= 15 && age <= 18) {
            System.out.println("lukeio");
        } else if (age > 18) {
            System.out.println("Telos to sxoleio gia esas");
        }
//      Can you use a switch statement?
//      Μπορούμε να χρησιμοποιήσουμε το Switch αλλά δεν θέλουμε καθώς θα έπρεπε 
//      να γράψουμε κάθε περίπτωση ηλικίας που δεχόμαστε σαν ένα case και όχι διαστήματα.

//     What to do every day (switch). Monday-Friday: go to work. Sat-Sun: relaxing
        System.out.println("Please tell me what day is today between 1-7");
        int day = input.nextInt();

        switch (day) {

            case 1:
                System.out.println("Today is Monday so you have to go to work");
                break;
            case 2:
                System.out.println("Today is Tuesday so you have to go to work");
                break;
            case 3:
                System.out.println("Today is Wednesday so you have to go to work");
                break;
            case 4:
                System.out.println("Today is Thursday so you have to go to work");
                break;
            case 5:
                System.out.println("Today is Friday so you have to go to work");
                break;
            case 6:
                System.out.println("Today is Saturday so you can Relax");
                break;
            case 7:
                System.out.println("Today is Sunday so you can Relax");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        
        
        //      Print the number of days each month has. Use switch.
        System.out.println("Please give me a month, choose between 1-12");
        int month = input.nextInt();
        int days;
        switch (month) {
            case 1:
                System.out.println("January with 31 days");
                break;

            case 2:
                System.out.println("February with 28 days and once every 4 years with 29");
                break;

            case 3:
                System.out.println("March with 31 days");
                break;

            case 4:
                System.out.println("April with 30 days");
                break;

            case 5:
                System.out.println("May with 31 days");
                break;

            case 6:
                System.out.println("June with 30 days");
                break;

            case 7:
                System.out.println("July with 31 days");
                break;

            case 8:
                System.out.println("August with 31 days");
                break;

            case 9:
                System.out.println("September with 30 days");
                break;

            case 10:
                System.out.println("Octomber with 31 days");
                break;

            case 11:
                System.out.println("November with 30 days");
                break;

            case 12:
                System.out.println("December with 31 days");
                break;

            default:
                System.out.println("Invalid number");
                break;
        }
        
        
        
//        Program should ask your weight and planet. Compute your weight on the planet based on the table below:
        System.out.println("Please give me your current Earth weight: ");
        int earthWeight = input.nextInt();
        
        System.out.println("Please choose the Planet you want to calculate your weight bye choosing the number 1-6");
        System.out.println("1. Venus");
        System.out.println("2. Mars");
        System.out.println("3. Jupiter");
        System.out.println("4. Saturn");
        System.out.println("5. Uranus");
        System.out.println("6. Neptune");
        int planetChoose = input.nextInt();
        int newWeight = 0;
        if (planetChoose == 1) {
            System.out.println("Your weight in Venus is: " + earthWeight * 0.78);
        } else if (planetChoose == 2) {
            System.out.println("Your weight in Mars is: " + earthWeight * 0.39);

        } else if (planetChoose == 3) {
            System.out.println("Your weight in Jupiter is: " + earthWeight * 2.65);

        } else if (planetChoose == 4) {
            System.out.println("Your weight in Saturn is: " + earthWeight * 1.17);

        } else if (planetChoose == 5) {
            System.out.println("Your weight in Uranus is: " + earthWeight * 1.05);

        } else if (planetChoose == 6) {
            System.out.println("Your weight in Neptune is: " + earthWeight * 1.23);

        }
    }
    
}
