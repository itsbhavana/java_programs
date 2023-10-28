import java.util.*;


class EmiCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Loan Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter the interest rate per annum : ");
        double interest_rate_per_year = sc.nextDouble();
        System.out.println("Enter the Loan Tenure in months : ");
        double months = sc.nextDouble();
        double interest_per_month = interest_rate_per_year/12/100;

        double emi = amount*interest_per_month*(Math.pow(1+interest_per_month,months) / (Math.pow(1+interest_per_month,months)-1));
        System.out.println("Your monthly emi will be: " + Math.round(emi));
    }


}