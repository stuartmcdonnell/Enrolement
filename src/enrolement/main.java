package enrolement;

public class main {
    
    public static void main(String[] args) {
       Enrolement e = new Enrolement();
       Menu m = new Menu();
       
      e.readFile();
      m.startMenu();
      e.saveFile();
    }
}
