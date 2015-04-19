package enrolement;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stuartmcdonnell
 */
public class Menu {

    Scanner scn = new Scanner(System.in);
    
    public int startMenu(){  
    int selection;    
    System.out.println("------------------");
    System.out.println("1. Add Student");
    System.out.println("2. Remove Student");
    System.out.println("3. Search Student");
    System.out.println("4. Course Report");
    System.out.println("------------------");
    System.out.println("Input Selection(Numbers Only): ");
    selection=Integer.parseInt(scn.nextLine());
        return selection;
    }
    
}
