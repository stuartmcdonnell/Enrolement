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
        
        if(this.name.equals("") || this.name.length()<2 || this.name.startsWith(" ")){
            System.out.println("------------------");
            System.out.println("Invalid Name!");
            System.out.println("------------------");
        }
        else if(this.dob.equals("")|| this.name.length()<2 || this.name.startsWith(" ")){
            System.out.println("------------------");
            System.out.println("Invalid Date of Birth!");
            System.out.println("------------------");
        }
        else if(!this.gender.equalsIgnoreCase("Male")&&!this.gender.equalsIgnoreCase("Female")){
            System.out.println("------------------");
            System.out.println("Invalid Gender");
            System.out.println("------------------");
        }
        else if(this.addr.equals("")|| this.name.length()<2 || this.name.startsWith(" ")){
            System.out.println("------------------");
            System.out.println("Invalid Address");
            System.out.println("------------------");
        }
        else{
            break;
        }
    }
        return this;
    }
    
}


