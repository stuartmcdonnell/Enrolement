package enrolement;

import java.io.PrintStream;
import java.util.Scanner;

public class Menu
{
  Scanner scn = new Scanner(System.in);
  Enrolement e = new Enrolement();
  Course c = new Course();
  public int startMenu()
  {
    Menu m = new Menu();  
    
    System.out.println("------------------");
    System.out.println("1. Add Student");
    System.out.println("2. Remove Student");
    System.out.println("3. Search Student");
    System.out.println("4. Course Report");
    System.out.println("5. Exit");
    System.out.println("------------------");
    System.out.println("Input Selection(Numbers Only): ");
    int selection = Integer.parseInt(this.scn.nextLine());
    if (selection == 1) {
      e.createStudent();
      m.startMenu();
    } else if (selection == 2) {
      e.deleteStudent();
      m.startMenu();
    } else if (selection == 3) {
      e.feedbackSearch();
      m.startMenu();
    } else if (selection == 4) {
      c.courseReport();
      m.startMenu();
    }else if(selection ==5){
      e.exit();
    }
    
    return selection;
  }
}
