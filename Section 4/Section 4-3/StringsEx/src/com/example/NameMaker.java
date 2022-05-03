/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.swing.JOptionPane;


public class NameMaker {
    
    public static void main(String args[])
    {
        String custName = "Steve Smith";
        String middleName,lastName;
        
        int spaceIdx = custName.indexOf(" ");
        System.out.println("Index of space character is " +spaceIdx);
        
        String firstName = custName.substring(0,5);
        System.out.println("My first name is"+ firstName);
        
        firstName = JOptionPane.showInputDialog(null, "Your first name");
        middleName = JOptionPane.showInputDialog(null, "Your midlle name");
        lastName = JOptionPane.showInputDialog(null, "Your last name");
        
    }
    
}
