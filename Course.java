/**
@description: This is a Course Class. It has four attributes: CourseID, CourseName, CourseLeader and Duration.
               It has accessor method for each attribute.
               The main use of this class is to set the course leader to a new name and display the CourseID, CourseName, CourseLeader 
               and Duration. 
            
@author: Binayak Maharjan
 */

public class Course                                                                     
{   
    //Declaration of given attributes with suitable data types with all having private access modifier
    private String CourseID;       
    private String CourseName;    
    private String CourseLeader;  
    private int Duration;         
    
    /*
     parameter: CourseID, CourseName as String and Duration as int
     return: 
     description: This is a constructor of Course class which has public access modifier. 
                   It takes CourseID, CourseName and Duration as parameters and initializes them by using this keyword. 
                   CourseLeader is initialized as empty string.
     */
    public Course(String CourseID, String CourseName, int Duration)      
    {                                                              
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.Duration = Duration;
        CourseLeader = "";           //Assign courseLeader with empty string. 
    }
    
    // Creating accessor method for CourseID that returns CourseID in String data type.
    public String getCourseID()                 
    {
        return CourseID;
    }
    
    // Creating accessor method for CourseName that returns CourseName in String data type    
    public String getCourseName()               
    {
        return CourseName;
    }
    
    // Creating accessor method for CourseLeader that returns CourseLeader in String data type
    public String getCourseLeader()
    {
        return CourseLeader;
    }
    
     //Create accessor method of duration that returns Duration in int form
    public int getDuration()                   
    {
        return Duration;
    }
    
    /* 
     parameter: newCourseLeader with String data type
     return:
     description: This is a setter method that sets the CourseLeader to to a newCourseLeader 
                   by accepting the newCourseLeader as a parameter
    */  
    public void setCourseLeader(String newCourseLeader)           //Create mutator method of courseLeader
    {
         this.CourseLeader = newCourseLeader;
    }
    
     /* 
     parameter: None
     return: CourseID, CourseName and CourseLeader as String and Duration as int 
     description: This is a display method that prints the CourseID, CourseName and Duration as output
                   If the CourseLeader is not empty it prints the CourseLeader too. All the outputs are suitably annotated 
    */  
    public void display()                                 
    {
        System.out.println("Course ID: " + CourseID);
        System.out.println("Course Name: " + CourseName);
        System.out.println("Duration: " + Duration);
        
            if(CourseLeader!="")       //Condition to check if the CourseLeader is empty
            {
                System.out.println("Course Leader: "+ CourseLeader);
            }
    }
}