//BRANCH - WORKING READ

package enrolement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class Enrolement {
    
    //public static Student sarray[] = new Student[20];
    static ArrayList<Student> sarray = new ArrayList<Student>(20);
    
    static String writeLine;
    static ArrayList arrayListRead = new ArrayList( );
    static int writeIndex = 0;
    static int storeIndex = 0;
    

    public static void main(String[] args) {
       readFile();
       
       //deleteStudent();
       //feedbackSearch();
       createStudent();
       saveFile();
    }
    
    public static void exit(){
        saveFile();
    }

    public static void saveFile() {
        try {
          
            PrintWriter spr = new PrintWriter("StudentDetails.txt");
            
            int arrayIndex = 0;
            
            for(int tempindex = 0; tempindex < 20; tempindex++){
                
                writeLine = (sarray.get(tempindex).name+","+sarray.get(tempindex).dob+","+sarray.get(tempindex).gender+","+sarray.get(tempindex).addr+",");
                //writeLine = (sarray[tempindex].name + "," + sarray[tempindex].dob + "," + sarray[tempindex].gender + "," + sarray[tempindex].addr + "," + sarray[tempindex].courseID);
                //System.out.println("Writing: "+writeLine);
                spr.println(writeLine);
                arrayIndex++;
               // System.out.println("Size: "+sarray.size());
                //System.out.println("Temp Index: "+sarray.size());
                
                if(arrayIndex == sarray.size()){
                spr.close();
                //System.out.println("Closed");
                
                }
                
            }
            

            
        } catch (Exception e) {
        }
    }

    public static void createStudent() {
        Student s = new Student();
        
        sarray.add(s.createStudent());
        StringBuilder sb = new StringBuilder();
        
        sb.append(sarray.get(writeIndex).name);
        sb.append(sarray.get(writeIndex).dob);
        sb.append(sarray.get(writeIndex).gender);
        sb.append(sarray.get(writeIndex).addr);
        
       // System.out.println("INPUT: "+sb.toString());
        storeIndex++;
        //System.out.println("Store Index: "+storeIndex);
    }

    public static void readFile() {
        try {

            BufferedReader fileReader = new BufferedReader(new FileReader("StudentDetails.txt"));
            
            for(int mainCount=0;mainCount<=sarray.size();){

            //System.out.println(mainCount);
            String line = fileReader.readLine();    
            String section[] = line.split(",");
            int inCount=0; 
            
            while(inCount<1){
                
                Student s = new Student();
                s.name = (section[0]);
                s.dob = (section[1]);
                s.gender = (section[2]);
                s.addr = (section[3]);
            
                sarray.add(mainCount, s);
                //System.out.println(s.name+","+s.dob+","+s.gender+","+s.addr);
                inCount++;
                }
            
                //System.out.println(sarray.get(mainCount).name);
                mainCount++;
                 
            }

        } 
        catch (Exception e) {
        } 
    
        } 
    
    
    public static int searchStudent(String name){
       int foundIndex=100;
       
       
      //System.out.println(sarray.size());
      //System.out.println(name);
        
        for(int i=0;i<sarray.size();i++){
        
         String tempName=sarray.get(i).name;
         if(tempName.equals(name)){
             //System.out.println(tempName);
             //System.out.println("MATCH FOUND");
             foundIndex=i;
             break;
         }
         else{
             //System.out.println("No Match Found!");
         }
         
        }
        return foundIndex;
    }
    
    public static int userSearch(){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter Student Name To Search: ");
    return searchStudent(scn.nextLine());
    }
    
    public static void feedbackSearch(){
        int inputIndex=userSearch();
        System.out.println("Name: "+sarray.get(inputIndex).name);
        System.out.println("Date of Birth:"+sarray.get(inputIndex).dob);
        System.out.println("Gender: "+sarray.get(inputIndex).gender);
        System.out.println("Address:"+sarray.get(inputIndex).addr);
    }
    
    public static void deleteStudent(){
        Scanner scn = new Scanner(System.in);
        int searchResult=100;
        System.out.println("Enter Student ID to Delete or Press enter S to search!");
        String input = scn.nextLine();
        if(input.equals("S")){
            searchResult=userSearch();
            System.out.println("Search Result: "+searchResult);
            sarray.remove(searchResult);
            System.out.println("Search Result has Been Deleted!");
        }
        else if(!input.equals("S")){
            int temp = Integer.parseInt(input);
           sarray.remove(temp);
            System.out.println("Student ID: "+input+" has Been Deleted!");
        }
    }
}
