/**
@description: This is AcademicCourse class which is the child class of Course class.
               It has seven attributes: LecturerName, Level, Credit, StartDate, CompletionDate, AssignmentNo, isRegistered 
               It has accessor method for each attribute.
               The main use of this class is to set the LecturerName and AssessmentNo as changes occur, register any particular academic
               course and display the details of the academic course.
            
@author: Binayak Maharjan
 */

public class AcademicCourse extends Course
{
    //Declaration of given attributes with suitable data types with all having private access modifier
    private String LecturerName;      
    private String Level;
    private String Credit;
    private String StartDate;
    private String CompletionDate;
    private int No_of_Assessment;
    private boolean isRegistered;
    /**
     parameter: CourseID, CourseName, Level, Credit as String. Duration and AssessmentNo as int
     return: 
     description: This is a constructor of AcademicCourse class which has public access modifier. 
                   It takes CourseID, CourseName, Duration, Level, Credit and AssessmentNo as parameters.
                   It calls the constructor in parent class. It also initializes Level, Credit and AssessmentNo by using this keyword. 
                   StartDate, CompletionDate and Lecturername are initialized as empty string.
                   isRegistered is intialized to false
    */
    public AcademicCourse(String CourseID, String CourseName, int Duration,String Level,String Credit, int No_of_Assessment)
    {
        super(CourseID,CourseName,Duration);  //Call made to Course class with CourseID, CourseName and Duration as parameters
        this.Level = Level;
        this.Credit = Credit;
        this.No_of_Assessment = No_of_Assessment;
        this.StartDate = "";
        this.CompletionDate = "";
        this.LecturerName = "";
        this.isRegistered = false;
    }
    
    // Creating accessor method for LecturerName that returns LecturerName in String data type.
    public String getLecturerName()
    {
        return LecturerName;
    }
    
    // Creating accessor method for Level that returns Level in String data type.
    public String getLevel()
    {
        return Level;
    }
    
    // Creating accessor method for Credit that returns Credit in String data type.
    public String getCredit()
    {
        return Credit;
    }
    
    // Creating accessor method for StartDate that returns StartDate in String data type.
    public String getStartDate()
    {
        return StartDate;
    }
    
    // Creating accessor method for CompletionDate that returns CompletionDate in String data type.
    public String getCompletionDate()
    {
        return CompletionDate;
    }
    
    // Creating accessor method for AssessmentNo that returns AssessmentNo in int data type.
    public int getNo_of_Assessment()
    {
        return No_of_Assessment;
    }
    
    //Creatinf accessor method for isRegistered that returns isRegistered in boolean data type
    public boolean getisRegistered()
    {
        return isRegistered;
    }
    
     /** 
     parameter: newLecturerName with String data type
     return:No return type
     description: This is a setter method that assigns the newLecturerName to LecturerName 
                   by accepting the newCourseLeader as a parameter
    */  
    public void setLecturerName(String newLecturerName)
    {
        this.LecturerName = newLecturerName;    
    }
      
     /* 
     parameter: newNoAssessment with int data type
     return:
     description: This is a setter method that assigns the newAssessmentNo to to AssessmentNo 
                   by accepting the newCourseLeader as a parameter
    */  
    public void setNo_of_AssessmentNo(int newNo_of_Assessment)
    {
        this.No_of_Assessment = newNo_of_Assessment;
    }
    
     /** 
     parameter: CourseLeader, LecturerName, StartDate, CompletionDate as String
     return: LecturerName, StartDate and CompletionDate
     description: This is a register method of AcademicCourse class that registers the academic course if it has not been registered yet.
                   If the academic course has been registered it prints a suitable message along with LecturerName, StartDate 
                   and CompletionDate. Else the setCourseLeader method in Course Class is called. 
                   The LecturerName, StartDate and CompletionDate are updated and isRegistered is initialized to false.
    */  
    public void register(String CourseLeader, String LecturerName, String StartDate, String CompletionDate)
    {
        if(isRegistered == true){
                System.out.println("Academic Course Registered!");
                System.out.println("Lecturer Name: "+LecturerName);
                System.out.println("Start Date: "+StartDate);
                System.out.println("Completion Date: "+CompletionDate);
            }
        else{
                super.setCourseLeader(CourseLeader);   //Call made to setCourseLeader method in Course Class with CourseLeader as parameter
                this.LecturerName = LecturerName;
                this.StartDate = StartDate;
                this.CompletionDate = CompletionDate;
                this.isRegistered = true;
            }
    }
    
     /** 
     parameter: None
     return: CourseID, CourseName,CourseLeader, LecturerName, Level, StartDate, CompletionDate as String. 
             Duration and AssessmentNo as int
     description: This is a display method of AcademicCourse class that calls the display method in Course class to display the 
                   Course ID, CourseName, Duration and CourseLeader. It prints the LecturerName, Level, StartDate,
                   CompletionDate and AssessmentNo as output if the academic course is registered.
                   The outputs are suitably annotated.  
    */
    public void display()
    {
        super.display();  //Call made to the display method in Course class
        if(isRegistered==true){
            System.out.println("Level: "+Level);
            System.out.println("Credit: "+Credit);
            System.out.println("Number of Assessments: "+No_of_Assessment);
            System.out.println("Lecturer Name: "+LecturerName);
            System.out.println("Starting Date: "+StartDate);
            System.out.println("Completion Date: "+CompletionDate);
        }                
        else{
            System.out.println("The Course has not been registered!");
        }
    }
}