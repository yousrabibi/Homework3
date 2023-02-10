/**
 * @class: Triangle
 * @author: Yousra bibi
 * @course: ITEC 2140 -05, 2023
 * @version: 1.0
 * @date: 02/09/2023
 * @description: this program will calculate the perimeter of a triangle.
 */
import java.util.Scanner;

    public class Triangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of edges: ");
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();
            if(side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2 )
            {
                double perimeter = side1 + side2 + side3;
                System.out.println("Perimeter: " + perimeter);
            }
            else {
                System.out.println("Invalid inputs");
            }
        }
    }

