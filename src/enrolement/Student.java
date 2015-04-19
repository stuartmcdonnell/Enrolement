/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrolement;

import java.util.Scanner;

public class Student {String name; String dob; String gender; String addr;

    Enrolement e = new Enrolement();

    public Student createStudent(){
   
    int running=1;    
        
    while(running ==1){
        
        Scanner scn = new Scanner(System.in);
    
        System.out.println("Input Name: ");
        this.name = scn.nextLine();
        
        
        System.out.println("Input DOB: ");
        this.dob = scn.nextLine();
        
        
        System.out.println("Input Gender: ");
        this.gender = scn.nextLine();
        
        
        System.out.println("Input Address: ");
        this.addr = scn.nextLine();
        
        if(this.name.equals("")){
            System.out.println("Invalid Name!");
        }
        else if(this.dob.equals("")){
            System.out.println("Invalid Date of Birth!");
        }
        else if(!this.gender.equalsIgnoreCase("Male")&&!this.gender.equalsIgnoreCase("Female")){
            System.out.println("Invalid Gender");
        }
        else if(this.addr.equals("")){
            System.out.println("Invalid Address");
        }
        else{
            break;
        }
    }
        return this;
    }
    
    
    
    
    
}


