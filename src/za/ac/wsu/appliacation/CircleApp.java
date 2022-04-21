package za.ac.wsu.appliacation;
import za.ac.wsu.s220128251.Circle;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {

        double r1,r2,r3;
        int x1,y1,x2,y2,x3,y3;
        boolean isNotGreaterThanZero = true;
        Scanner input = new Scanner(System.in);
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        do {
            System.out.print("Enter a radius for 1st Circle >> ");
            r1 = input.nextDouble();
            input.nextLine();
            if (r1 >= 0) {
                circle1.setRadius(r1);
                isNotGreaterThanZero = false;
            } else {
                System.out.println("Please enter a positive radius!!!!");
            }
        }while (isNotGreaterThanZero);
        isNotGreaterThanZero = true;

        System.out.print("Enter a x co-ordinate for 1st Circle >> ");
        x1 = input.nextInt();
        input.nextLine();
        System.out.print("Enter a y co-ordinate for 1st Circle >> ");
        y1 = input.nextInt();

        circle1.setX(x1);
        circle1.setY(y1);
        circle1.setRadius(r1);
        System.out.println("Circle of " + circle1.getRadius() + "cm radius centered at (" + circle1.getX() +
                ',' + circle1.getY() + ") have area of " + circle1.calculateArea() + "cm^2, Circumference of "
                + circle1.calculateCircumference() + "cm and diameter of " + circle1.calculateDiameter() + "cm.");

        do {
            System.out.print("Enter a radius for 2nd Circle >> ");
            r2 = input.nextDouble();
            input.nextLine();
            if (r2 >= 0) {
                circle2.setRadius(r2);
                isNotGreaterThanZero = false;
            } else {
                System.out.println("Please enter a positive radius!!!!");
            }
        }while (isNotGreaterThanZero);
        isNotGreaterThanZero = true;

        System.out.print("Enter a x co-ordinate for 2nd Circle >> ");
        x2 = input.nextInt();
        input.nextLine();
        System.out.print("Enter a y co-ordinate for 2nd Circle >> ");
        y2 = input.nextInt();

        circle2.setX(x2);
        circle2.setY(y2);
        circle2.setRadius(r2);
        System.out.println("Circle of " + circle2.getRadius() + "cm radius centered at (" + circle2.getX() +
                ',' + circle2.getY() + ") has area of " + circle2.calculateArea() + "cm^2, Circumference of "
                + circle2.calculateCircumference() + "cm and diameter of " + circle2.calculateDiameter() + "cm.");

        do {
            System.out.print("Enter a radius for 3rd Circle >> ");
            r3 = input.nextDouble();
            input.nextLine();
            if (r3 >= 0) {
                circle3.setRadius(r3);
                isNotGreaterThanZero = false;
            } else {
                System.out.println("Please enter a positive radius!!!!");
            }
        }while (isNotGreaterThanZero);
        isNotGreaterThanZero = true;

        System.out.print("Enter a x co-ordinate for 3rd Circle >> ");
        x3 = input.nextInt();
        input.nextLine();
        System.out.print("Enter a y co-ordinate for 3rd Circle >> ");
        y3 = input.nextInt();

        circle3.setX(x3);
        circle3.setY(y3);
        circle3.setRadius(r3);
        System.out.println("Circle of " + circle3.getRadius() + "cm radius centered at (" + circle3.getX() +
                ',' + circle3.getY() + ") have area of " + circle3.calculateArea() + "cm^2, Circumference of "
                + circle3.calculateCircumference() + "cm and diameter of " + circle3.calculateDiameter() + "cm.");
    }
}