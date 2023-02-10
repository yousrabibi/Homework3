/**
 * @class: BMI
 * @author: Yousra bibi
 * @course: ITEC 2140 -05, 2023
 * @version: 1.0
 * @date: 02/09/2023
 * @description: this program will calculate the body mass index based on the height and weight of the person.
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weight = 0.45359237 * sc.nextDouble();
        System.out.println("Enter your height in inches: ");
        double height = 0.0254 * sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("your BMI is: " + BMI);
        if (BMI < 18.5)
        {
            System.out.println("You are underweight");
        }
        else if (BMI > 18.5 && BMI < 25.0)
        {
            System.out.println("You are Normal");
        }
        else if (BMI > 25.0 && BMI < 30.0)
        {
            System.out.println("You are Overweight");
        }
        else
        {
            System.out.println("You are Obese");
        }

    }


}

