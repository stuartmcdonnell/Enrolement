/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrolement;

import java.util.Scanner;

public class Student {String name; String dob; String gender; String addr;


    public Student createStudent(){
        
        Scanner scn = new Scanner(System.in);
    
        System.out.println("Input Name: ");
        this.name = scn.nextLine();
        
        System.out.println("Input DOB: ");
        this.dob = scn.nextLine();
        
        System.out.println("Input Gender: ");
        
        this.gender = scn.nextLine();
        
        System.out.println("Input Address: ");
        this.addr = scn.nextLine();
        
        
    return this;
    }
    
    
    
    
    
}


