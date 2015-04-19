package enrolement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Course {
    
Enrolement e = new Enrolement();
    
static String name;
static String lecturer;
int totalStudents;
int mpercentage=0;
int fpercentage=0;
String[] carray = new String[4];

public String returnName(){
    return this.name;
}

public String returnLecturer(){
    return this.lecturer;
}
    
public int countMale(){
    int male=0;

    for(int i=0;i<e.sarray.size();i++){
    
        if(e.sarray.get(i).gender.equalsIgnoreCase("male")){
            male++;
        }      
    }
    return male;
}

public int countFemale(){
    int female=0;
    for(int i=0;i<e.sarray.size();i++){
    
        if(e.sarray.get(i).gender.equalsIgnoreCase("female")){
            female++;
        }      
    }
    return female;
}

public int malePercentage(){
    mpercentage=(int)((countMale()*100)/totalStudents());
    return mpercentage;
}

public int femalePercentage(){
    fpercentage=(int)((countFemale()*100)/totalStudents());
    return fpercentage;
}

public int totalStudents(){
    totalStudents = e.sarray.size();
    return totalStudents;
}

public void readCourse(){
    BufferedReader fileReader;
    try
    {
        fileReader = new BufferedReader(new FileReader("CourseDetails.txt"));
        this.name=fileReader.readLine();
        this.lecturer=fileReader.readLine(); 
    }
    catch (Exception localException) {}
}

public void courseReport(){
    try{    
      PrintWriter spr = new PrintWriter("CourseDetails.txt");
      spr.println(this.name);
      spr.println(this.lecturer);
      spr.println(totalStudents());
      spr.println(malePercentage());
      spr.println(femalePercentage());
      spr.close();
      System.out.println("------------------");
      System.out.println("Report Generated");
      System.out.println("------------------");
      System.out.println("Course Name: "+this.returnName());
      System.out.println("Lecturer Name: "+this.returnLecturer());
      System.out.println("Total Students: "+totalStudents());
      System.out.println("Male Percentage: "+malePercentage()+"%");
      System.out.println("Female Percentage: "+femalePercentage()+"%");
      System.out.println("------------------");
    }
    catch (Exception localException){
    }
    
}

}
