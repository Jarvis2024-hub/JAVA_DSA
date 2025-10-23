package DAY6;

import java.util.Scanner;

public class bmi_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your weight(in kilograms): ");
        double weight=sc.nextDouble();
        System.out.println("Enter your height(in metres): ");
        double height=sc.nextDouble();sc.close();
        double bmi=weight/(height*height);
        System.out.println("Your BMI is: "+bmi);
        System.out.println(bmi<18.5?"You're Underweight":bmi>=18.5 && bmi<25?"You're Normal":bmi>=25 && bmi<30?"You're Overweight":"You're Obese");
    }
}
