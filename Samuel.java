/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samuel;

import java.util.Scanner;

/**
 *
 * @author laila
 */
public class Samuel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Enter your name:");

       Scanner scanner = new Scanner(System.in);

       String name = scanner.nextLine();

       System.out.println("Enter your age:");

       int age = scanner.nextInt();

       System.out.println("Enter your gradelevel:");

       int gradelevel = scanner.nextInt();
  
       scanner.close();

    }
    
}
