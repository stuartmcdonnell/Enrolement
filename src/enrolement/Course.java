package enrolement;

import java.io.PrintWriter;

public class Course {
    
Enrolement e = new Enrolement();
    
String name="Software Engineering";
String lecturer="Dr George Wilkie";;
int totalStudents;
int maleFemale;
    

public String returnName(){
    return this.name;
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
    int percentage=0;
    percentage=(countMale()/e.sarray.size()*100);
    return percentage;
}

public int femalePercentage(){
    int percentage=0;
    percentage=(countFemale()/e.sarray.size()*100);
    return percentage;
}

public String returnLecturer(){
    return this.lecturer;
}

public int totalStudents(){
    totalStudents = e.sarray.size();
    return totalStudents;
}

public void courseReport(){
    try{    
      PrintWriter spr = new PrintWriter("CourseDetails.txt");
      spr.println("Course Name: "+this.name);
      spr.println("Course Lecturer: "+this.lecturer);
      spr.println("Total Students: "+totalStudents());
      spr.println("Male Percentage: "+malePercentage()+"%");
      spr.println("Female Percentage: "+femalePercentage()+"%");
      spr.close();
      System.out.println("------------------");
      System.out.println("Report Generated");
      
    }
    catch (Exception localException){
    }
    
}


}
