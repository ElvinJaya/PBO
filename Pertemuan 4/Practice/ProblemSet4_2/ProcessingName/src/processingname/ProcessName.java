/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processingname;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class ProcessName {
    
 
    
public static void main(String[] args) {
    String totWord = JOptionPane.showInputDialog(null,"Number of word in your name");
    int totWordConvert = Integer.parseInt(totWord);
    if (totWordConvert == 2){
        String Name;
        Scanner Fullname = new Scanner(System.in);
        System.out.println("Type your Fullname : ");
        Name = Fullname.nextLine();
        int totIdx = Name.length();
        int firstDashIdx = Name.indexOf(" ");
        String firstName = Name.substring(0, firstDashIdx);
        char firstLetter = firstName.charAt(0);
        
        firstDashIdx = firstDashIdx + 1;
        String secondName = Name.substring(firstDashIdx,totIdx);
        System.out.println("your name is : "+ secondName+ ","+ firstLetter);
        }
     else if (totWordConvert == 3){
    String Name;
    Scanner Fullname = new Scanner(System.in);
        System.out.println("type your Full name : ");
        Name = Fullname.nextLine();
        Name = Fullname.nextLine();
        int totIdx = Name.length();
        int firstDashIdx = Name.indexOf(" ");
        int secondDashIdx = Name.indexOf(" ", firstDashIdx+1);
        
        String firstName = Name.substring(0, firstDashIdx);
        char firstLetter = firstName.charAt(0);
        
        firstDashIdx = firstDashIdx + 1;
        secondDashIdx = secondDashIdx +1;
        
        String secondName = Name.substring(firstDashIdx,secondDashIdx);
        String lastName = Name.substring(secondDashIdx, totIdx);
   
        System.out.print("Enter your name: ");
        
        // your code goes here
        
        
    }
}
}


   