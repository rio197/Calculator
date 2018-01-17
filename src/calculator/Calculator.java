/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author rio197
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1;
        double num2;
        int operationnum;
               
        System.out.println("Calculator");
        System.out.println("Operation List");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        System.out.println("Enter the first number");
        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextDouble();
        
        System.out.println("Enter the second number");
        Scanner scanner2 = new Scanner(System.in);
        num2 = scanner2.nextDouble();
        
        System.out.println("Select the operation to be performed");
        Scanner scanner3 = new Scanner(System.in);
        operationnum = scanner3.nextInt();
        
        if (operationnum == 1) {
            System.out.println("Result is");
            System.out.println(num1 + num2);
        }
        
        else if (operationnum == 2) {
            System.out.println("Result is");
            System.out.println(num1 - num2);
        }
        
        else if (operationnum == 3) {
            System.out.println("Result is");
            System.out.println(num1 * num2);
        }
        
        else if (operationnum == 4) {
            System.out.println("Result is");
            System.out.println(num1 / num2);
        }
        
        else {
            System.out.println("Wrong Input. Select a number from the operation list");
        }
    }
}
