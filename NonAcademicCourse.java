/**
@description: This is NonAcademicCourse class which is the child class of Course class.
It has seven attributes: InstructorName, Duration, StartDate, CompletionDate, ExamDate, Prerequisite, isRegistered
and isRemoved.
It has accessor method for each attribute.
The main use of this class is to set the InstructorName as changes occur,
register any particular non-academic course,
remove a non-academic course when no longer required
and display the details of the non-academic course.

@author: Binayak Maharjan
 */
public class NonAcademicCourse extends Course
{
    //Declaration of given attributes with suitable data types with all having private access modifier
    private String InstructorName;
    private String StartDate;
    private String CompletionDate;
    private String ExamDate;
    private String Prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;

    /**
    parameter: CourseID, CourseName, Prerequisite as String and Duration as int
    return: 
    description: This is a constructor of NonAcademicCourse class which has public access modifier. 
    It takes CourseID, CourseName, Duration and Prerequisite as parameters.
    It calls the constructor in parent class. It also initializes Prerequisite by using this keyword. 
    StartDate, CompletionDate and ExamDate are initialized as empty string.
    isRegistered and isRemoved is intialized to false.
     */
    public NonAcademicCourse(String CourseID, String CourseName, int Duration, String Prerequisite)
    {
        super(CourseID, CourseName, Duration);    //Call made to Course class with CourseID, CourseName and Duration as parameters
        this.Prerequisite = Prerequisite;
        StartDate = "";
        CompletionDate = "";
        ExamDate = "";
        isRegistered = false;
        isRemoved = false;
    }

    // Creating accessor method for LecturerName that returns LecturerName in String data type.
    public String getInsturctorName()       
    {
        return InstructorName;
    }

    // Creating accessor method for Level that returns Level in String data type.
    public String getStartDate()        
    {
        return StartDate;
    }

    // Creating accessor method for Credit that returns Credit in String data type.
    public String getCompletionDate()     
    {
        return CompletionDate;
    }

    // Creating accessor method for Credit that returns Credit in String data type.
    public String getExamDate()          
    {
        return ExamDate;
    }

    // Creating accessor method for Credit that returns Credit in String data type.
    public String getPrerequisite()     
    {
        return Prerequisite;
    }

    // Creating accessor method for Credit that returns Credit in String data type.
    public boolean getisRegistered()     
    {
        return isRegistered;
    }

    // Creating accessor method for Credit that returns Credit in String data type.
    public boolean getisRemoved()       
    {
        return isRemoved;
    }

    /** 
    parameter: InstructorName with String data type
    return:
    description: This is a setter method that accepts newInstructorName as parameter and sets the InstructorName 
    to a newInstructorName if the course has not been registered yet. 
    If the course is already registered a suitable message is displayed.
     */  
    public void setInstructorName(String newInstructorName)
    {

        if(this.isRegistered == false){
            InstructorName = newInstructorName;
        }
        else{
            System.out.println("Instructor name is not possible.");
        }   
    }

    /* 
    parameter: CourseLeader, InstructorName, StartDate, CompletionDate, ExamDate with String data type
    return:No return type
    description: This is a register method of NonAcademicCourse class that registers the non-academic course
    if it has not been registered yet by calling the method to setCourseLeader in Course class. 
    The method to setInstructorName is called with InstructorName as parameter. isRegistered status is set to true.
    The StartDate, CompletionDate and ExamDate are updated.
    If the non-academic course has been registered it prints a suitable message to indicate the course has been registered.
     */  
    public void Register(String CourseLeader, String InstructorName, String StartDate,
    String CompletionDate, String ExamDate)
    {
        if(this.isRegistered == false)
        {
            super.setCourseLeader(CourseLeader);  //Call made to setCourseLeader method in CourseClass with CourseLeader as parameter
            setInstructorName(InstructorName);   //Call made to setInstructor method with InstructorName as parameter
            isRegistered = true;
            this.StartDate = StartDate;
            this.CompletionDate = CompletionDate;
            this.ExamDate = ExamDate;
        }
        else
        {
            System.out.print("The course has already been registered. Thank you!");
        }
    }

    /** 
    parameter: None
    return: A message is returned to indicate that the NonAcademic Course has been removed.
    description: If the NonAcademic Course is removed then a suitable message is displayed.
    Else the NonAcademic Course is not removed yet, a call is made to setCourseLeader method in CourseClass with "" as 
    parameter. The instructor name, StartDate, CompletionDate and ExamDate are initialized to ""
    isRegistered is set to false and isRemoved is set to true. 
     */  
    public void Remove()
    {
        if(isRemoved == true)
        {
            System.out.println("The non-academic course has been removed.");
        }
        else
        {      
            super.setCourseLeader("");  //Call made to method setCourseLeader in Course Class
            InstructorName = "";
            StartDate = "";
            CompletionDate = "";
            ExamDate = "";
            isRegistered= false;
            isRemoved = true;
        }
    }

    /** 
    parameter: None
    return: CourseID, CourseName,InstructorName, StartDate, CompletionDate and ExamDate as String.Duration as int. 
    description: This is a display method of NonAcademicCourse class that calls the display method in Course class to display the 
    Course ID, CourseName, Duration. It prints the InstructorName, StartDate,
    CompletionDate and ExamDate as output if the nonacademic course is registered.
    The outputs are suitably annotated.  
     */
    public void display()
    {    super.display();
        if(isRegistered==true){
            System.out.println("Prerequisite: "+Prerequisite);
            System.out.println("Instructor Name: "+ InstructorName);
            System.out.println("Start Date: "+ StartDate);
            System.out.println("Completion Date: "+ CompletionDate);
            System.out.println("Exam Date: "+ ExamDate);      
        }
    }
}