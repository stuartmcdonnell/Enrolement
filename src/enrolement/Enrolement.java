package enrolement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Enrolement
{
  static ArrayList<Student> sarray = new ArrayList(20);
  static String writeLine;
  static ArrayList arrayListRead = new ArrayList();
  static int writeIndex = 0;
  static int storeIndex = 0;
  
  public static void exit()
  {
    System.out.println("------------------");
    System.out.println("Saving...");
    saveFile();
    System.out.println("Saved!");
    System.out.println("------------------");
    System.out.println("Goodbye!");
    System.out.println("------------------");
  }
  
  public static void saveFile()
  {
    try
    {
      PrintWriter spr = new PrintWriter("StudentDetails.txt");
      int arrayIndex = 0;
      for (int tempindex = 0; tempindex < 20; tempindex++)
      {
        writeLine = ((Student)sarray.get(tempindex)).name + "," + ((Student)sarray.get(tempindex)).dob + "," + ((Student)sarray.get(tempindex)).gender + "," + ((Student)sarray.get(tempindex)).addr + ",";
        spr.println(writeLine);
        arrayIndex++;
        if (arrayIndex == sarray.size()) {
          spr.close();
        }
      }
    }
    catch (Exception localException) {}
  }
  
  public static void createStudent()
  {
    if (sarray.size() < 20)
    {
      Student s = new Student();
      
      sarray.add(s.createStudent());
      StringBuilder sb = new StringBuilder();
      
      storeIndex += 1;
    }
    else
    {
      System.out.println("System Full, Cannot Add Student!");
    }
  }
  
  public static void readFile()
  {
    BufferedReader fileReader;
    int mainCount;
    try
    {
      fileReader = new BufferedReader(new FileReader("StudentDetails.txt"));
      for (mainCount = 0; mainCount <= sarray.size();)
      {
        String line = fileReader.readLine();
        String[] section = line.split(",");
        int inCount = 0;
        while (inCount < 1)
        {
          Student s = new Student();
          s.name = section[0];
          s.dob = section[1];
          s.gender = section[2];
          s.addr = section[3];
          
          sarray.add(mainCount, s);
          
          inCount++;
        }
        mainCount++;
      }
    }
    catch (Exception localException) {}
  }
  
  public static int searchStudent(String name)
  {
    int foundIndex = 100;
    for (int i = 0; i < sarray.size(); i++)
    {
      String tempName = ((Student)sarray.get(i)).name;
      if (tempName.equals(name))
      {
        foundIndex = i;
        break;
      }
    }
    return foundIndex;
  }
  
  public static int userSearch()
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter Student Name To Search: ");
    return searchStudent(scn.nextLine());
  }
  
  public static void feedbackSearch()
  {
    int inputIndex = userSearch();
    System.out.println("Name: " + ((Student)sarray.get(inputIndex)).name);
    System.out.println("Date of Birth: " + ((Student)sarray.get(inputIndex)).dob);
    System.out.println("Gender: " + ((Student)sarray.get(inputIndex)).gender);
    System.out.println("Address: " + ((Student)sarray.get(inputIndex)).addr);
  }
  
  public static void deleteStudent()
  {
    Scanner scn = new Scanner(System.in);
    
    System.out.println("Enter Student ID to Delete or Press enter S to search!");
    String input = scn.nextLine();
    if (input.equals("S"))
    {
      int searchResult = userSearch();
      System.out.println("Search Result: " + searchResult);
      sarray.remove(searchResult);
      System.out.println("Search Result has Been Deleted!");
    }
    else if (!input.equals("S"))
    {
      int temp = Integer.parseInt(input);
      sarray.remove(temp);
      System.out.println("Student ID: " + input + " has Been Deleted!");
    }
  }
}
