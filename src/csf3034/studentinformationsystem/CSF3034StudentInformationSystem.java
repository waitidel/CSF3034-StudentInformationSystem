/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csf3034.studentinformationsystem;
import java.util.Scanner;/**
 *
 * @author MP1
 */
public class CSF3034StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine(); 
        System.out.print("Enter your ID: ");
        String id = scanner.nextLine(); 
        
        System.out.print("Enter your marks 1: ");
        int mark1 = scanner.nextInt(); 
        System.out.print("Enter your marks 2: ");
        int mark2 = scanner.nextInt(); 
        
        //calculate total marks
        int totalmark = mark1 + mark2;
        
        System.out.println("Total marks is :" + totalmark);
        
        if (totalmark >= 175){
            System.out.println("Excellent");
                    }
        else if (totalmark >= 150){
            System.out.println("Good");
        }
        else {
            System.out.println("Needs Improvement");
        }
    }
    
}
