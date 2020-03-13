package mypackage;

public class MainClass {

    public static void main(String[] args) {
        short monthlySalary = 900;
        byte months = 12;
        short yearlySalary = (short) (monthlySalary * months);//trust me
        int newVar = yearlySalary;
        float govTax = 0.09f;
        //float govInc = (float) (yearlySalary * 0.09);
        float govIncome = yearlySalary * govTax;
        float myIncome = yearlySalary - govIncome;
        //System.out.println("%");
        System.out.printf("Government takes:%.2f\n", govIncome);
        System.out.printf("Me, %s, take :%.0f\n", "Nick", myIncome);
        
    }
    
}
