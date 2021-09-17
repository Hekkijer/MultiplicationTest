/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtest;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MultiplicationTest {
    
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mark = 0;
        for (int i = 1; i <= 5; i++) {
            Random random = new Random();
            int num1 = random.nextInt(10 - 1 + 1) + 1;
            int num2 = random.nextInt(10 - 1 + 1) + 1;
            
            Scanner in = new Scanner(System.in);
            System.out.println("Solve this: "+num1+" x "+num2);
            System.out.println("Type your answer: ");
            int answer = in.nextInt();
            
            if (answer == num1*num2) {
                System.out.println(ANSI_GREEN + "Yes! Congratulations!" + ANSI_RESET);
                mark++;
            } else {
                System.out.println(ANSI_RED + "No, :( " + ANSI_RESET);
            }
        }
        
        if (mark == 5) {
            System.out.println("Молодец.");
        }
        if (mark == 4 || mark == 3) {
            System.out.println("Надо бы еще поучить.");
        }
        if (mark == 2 || mark < 2) {
            System.out.println("Срочно нужно учить таблицу умножения.");
        }
        
    }
    
}
