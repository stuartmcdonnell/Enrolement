package enrolement;

public class main {
    
    public static void main(String[] args) {
        Enrolement e = new Enrolement();
        Menu m = new Menu();
        Course c = new Course();
        c.readCourse();
        e.readFile();
        m.startMenu();
    }
}
