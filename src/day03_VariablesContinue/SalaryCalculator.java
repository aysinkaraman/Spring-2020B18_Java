package day03_VariablesContinue;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte totalWeeks = 52;

        // salary = hourlyRate * weeklyHours * 52
        double salary = hourlyRate * weeklyHours * totalWeeks;
        //stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;
        //federalTax = salary * federaltaxRate;
        double federalTax = salary * federalTaxRate;
        //salaryAfterTax = salary - stateTax - federalTax
        double salaryAfterTax = salary - stateTax - federalTax;
        System.out.println("Your salary is: " + salary);

    }
}
