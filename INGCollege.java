/**
@description: This is a INGCollege Class which is a GUI for adding,
            registering AcademicCourse and NonAcademicCourse classes and removing NonAcademicCourse class.
            It has a single frame, four panels within the frame. It uses Buttons to move from AcademicCourse to NonAcademicCourse 
            class. For this, it implements ActionListener class.
*/
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class INGCollege implements ActionListener
{
    private JFrame frame;

    private JPanel panel1, panel2,panel3,panel4;

    private JLabel Title1,Title2, CourseID1, CourseID2, CourseName1, CourseName2, CourseLeader1, CourseLeader2, Duration1, Duration2,
    LecturerName, Level,Credit, StartDate1, CompletionDate1, No_of_Assessment, 
    InstructorName, Prerequisite, StartDate2, CompletionDate2, ExamDate;

    private JTextField txtCourseID1, txtCourseName1, txtCourseLeader1, txtDuration1, txtLecturerName, txtLevel, 
    txtCredit,txtNo_of_Assessment,txtStartDate1,txtCompletionDate1,
    txtCourseID2,txtCourseName2,txtCourseLeader2,txtDuration2,txtInstructorName,txtPrerequisite,txtStartDate2,
    txtCompletionDate2, txtExamDate;

    private JButton btnAcademic, btnNonAcademic, btnAdd1, btnRegister1, btnClear1, btnDisplay1,
    btnAdd2,btnRemove,btnRegister2,btnClear2,btnDisplay2;

    private String aCourseID,aCourseName,aDuration,aLevel,aCredit,aAssessment, 
    registerAID, registerACourseLeader,registerALecturer, registerAStartDate, registerACompletionDate;
                

    private String nCourseID, nCourseName,nDuration, nPrerequisite,
    registerNAID,registerNACourseLeader,registerNAInstructor,registerNAStartDate, registerNACompletionDate,
    registerNAExamDate; 
    
    private int a_duration, a_credit, a_assessment, n_duration;

    private AcademicCourse academic_course;

    private NonAcademicCourse nacademic_course;
    
    //ArrayList object alist that will store Course 
    private ArrayList<Course> alist = new ArrayList<Course>();
    
    
    
    /**
       Constructor of INGCollege class where GUI has been initialized 
       */
    INGCollege()
    {
        //Frame with title 
        frame = new JFrame("Registration Form");

        //Academic Course Panel

        //Panel1 for Academic Course 
        panel1 = new JPanel();
        panel1.setSize(800,700);
        panel1.setLayout(null);
        panel1.setBackground(new Color(145, 210, 255));

        //Panel2 for Academic Course
        panel2 = new JPanel();
        panel2.setBounds(20,100,400,520);
        panel2.setBackground(new Color(255, 170, 145));
        panel2.setLayout(null);

        //Title Label for Academic Course
        Title1 = new JLabel("Academic Course");
        Title1.setBounds(300,40,300,40);
        Font tf = new Font("Times New Roman",Font.BOLD,30);
        Title1.setFont(tf);
        panel1.add(Title1);

        //Panel2 starts

        //CourseID Label for Academic Course
        CourseID1 = new JLabel("Course ID:");
        CourseID1.setBounds(40,40,100,30);
        panel2.add(CourseID1);

        txtCourseID1 = new JTextField();
        txtCourseID1.setBounds(130,40,180,30);
        panel2.add(txtCourseID1);

        //CourseName Label for Academic Course
        CourseName1 = new JLabel("Course Name:");
        CourseName1.setBounds(40,90,100,30);
        panel2.add(CourseName1);

        txtCourseName1 = new JTextField();
        txtCourseName1.setBounds(130,90,180,30);
        panel2.add(txtCourseName1);

        //Duration Label for Academic Course
        Duration1 = new JLabel("Duration:");
        Duration1.setBounds(40,140,100,30);
        panel2.add(Duration1);

        txtDuration1 = new JTextField();
        txtDuration1.setBounds(130,140,180,30);
        panel2.add(txtDuration1);

        //Level Label for Academic Course
        Level = new JLabel("Level:");
        Level.setBounds(40,190,100,30);
        panel2.add(Level);

        txtLevel = new JTextField();
        txtLevel.setBounds(130,190,180,30);
        panel2.add(txtLevel);

        //Credit Level for Academic Course
        Credit = new JLabel("Credit:");
        Credit.setBounds(40,240,100,30);
        panel2.add(Credit);

        txtCredit = new JTextField();
        txtCredit.setBounds(130,240,180,30);
        panel2.add(txtCredit);

        //No of Assessment for Academic Course
        No_of_Assessment = new JLabel("Number of Assessments:");
        No_of_Assessment.setBounds(40,290,180,30);
        panel2.add(No_of_Assessment);

        txtNo_of_Assessment = new JTextField();
        txtNo_of_Assessment.setBounds(200,290,100,30);
        panel2.add(txtNo_of_Assessment);

        //Add button for Academic Course
        btnAdd1 = new JButton("ADD");
        btnAdd1.setBounds(100,420,150,50);
        Font bf1 = new Font("Times New Roman",Font.BOLD,25);
        btnAdd1.setFont(bf1);
        btnAdd1.setBackground(Color.BLUE);
        btnAdd1.setForeground(Color.WHITE);
        panel2.add(btnAdd1);
        btnAdd1.addActionListener(this);

        //Panel1 starts

        //CourseLeader Label for Academic Course
        CourseLeader1 = new JLabel("Course Leader:");
        CourseLeader1.setBounds(450,160,100,30);
        panel1.add(CourseLeader1);

        txtCourseLeader1 = new JTextField();
        txtCourseLeader1.setBounds(550,160,180,30);
        panel1.add(txtCourseLeader1);

        //LecturerName Label for Academic Course
        LecturerName = new JLabel("Lecturer Name:");
        LecturerName.setBounds(450,210,100,30);
        panel1.add(LecturerName);

        txtLecturerName = new JTextField();
        txtLecturerName.setBounds(550,210,180,30);
        panel1.add(txtLecturerName);

        //StartDate Label for Academic Course
        StartDate1 = new JLabel("Start Date:");
        StartDate1.setBounds(450,260,100,30);
        panel1.add(StartDate1);

        txtStartDate1 = new JTextField();
        txtStartDate1.setBounds(550,260,180,30);
        panel1.add(txtStartDate1);

        //CompletionDate Label for Academic Course
        CompletionDate1 = new JLabel("Completion Date:");
        CompletionDate1.setBounds(450,310,150,30);
        panel1.add(CompletionDate1);

        txtCompletionDate1 = new JTextField();
        txtCompletionDate1.setBounds(550,310,180,30);
        panel1.add(txtCompletionDate1);

        //Register Button for Academic Course
        btnRegister1 = new JButton("Register Academic Course");
        btnRegister1.setBounds(450,400,280,40);
        Font bf2 = new Font("Arial",Font.BOLD,14);
        btnRegister1.setFont(bf2);
        btnRegister1.setBackground(new Color(250, 245, 175));
        panel1.add(btnRegister1);
        btnRegister1.addActionListener(this);

        //Display Button for Academic Course
        btnDisplay1 = new JButton("Display Academic Course");
        btnDisplay1.setBounds(450,450,280,40);
        btnDisplay1.setFont(bf2);
        btnDisplay1.setBackground(new Color(250, 245, 175));
        panel1.add(btnDisplay1);
        btnDisplay1.addActionListener(this);

        //Clear Button for Academic Course
        btnClear1 = new JButton("CLEAR");
        btnClear1.setBounds(510,560,150,50);
        btnClear1.setForeground(Color.WHITE);
        btnClear1.setBackground(Color.RED);
        btnClear1.setFont(bf1);
        panel1.add(btnClear1);
        btnClear1.addActionListener(this);

        //NonAcademic Course Panel
        //Panel 3 of NonAcademic Course 
        panel3 = new JPanel();
        panel3.setSize(800,700);
        panel3.setBackground(new Color(145, 210, 255));
        panel3.setLayout(null);

        //Panel 4 of NonAcademic Course
        panel4 = new JPanel();
        panel4.setBounds(20,100,400,520);
        panel4.setBackground(new Color(255, 170, 145));
        panel4.setLayout(null);

        //Title Label for NonAcademic Course
        Title2 = new JLabel("Non-Academic Course");
        Title2.setBounds(300,40,300,40);
        Title2.setFont(tf);
        panel3.add(Title2);

        //Panel4 for NonAcademic Course starts

        //CourseID Label for NonAcademic Course
        CourseID2 = new JLabel("Course ID:");
        CourseID2.setBounds(40,40,100,30);
        panel4.add(CourseID2);

        txtCourseID2 = new JTextField();
        txtCourseID2.setBounds(130,40,180,30);
        panel4.add(txtCourseID2);

        //CourseName Label for NonAcademic Course
        CourseName2 = new JLabel("Course Name:");
        CourseName2.setBounds(40,90,100,30);
        panel4.add(CourseName2);

        txtCourseName2 = new JTextField();
        txtCourseName2.setBounds(130,90,180,30);
        panel4.add(txtCourseName2);

        //Duration Label for NonAcademic Course
        Duration2 = new JLabel("Duration:");
        Duration2.setBounds(40,140,100,30);
        panel4.add(Duration2);

        txtDuration2 = new JTextField();
        txtDuration2.setBounds(130,140,180,30);
        panel4.add(txtDuration2);

        //Prerequisite Label for NonAcademic Course
        Prerequisite = new JLabel("Prerequisite:");
        Prerequisite.setBounds(40,190,100,30);
        panel4.add(Prerequisite);

        txtPrerequisite = new JTextField();
        txtPrerequisite.setBounds(130,190,180,30);
        panel4.add(txtPrerequisite);

        //Add Button for NonAcademic Course
        btnAdd2 = new JButton("ADD");
        btnAdd2.setBounds(100,420,150,50);
        btnAdd2.setFont(bf1);
        btnAdd2.setBackground(Color.BLUE);
        btnAdd2.setForeground(Color.WHITE);
        panel4.add(btnAdd2);
        btnAdd2.addActionListener(this);

        ///Panel 3 of NonAcademic Course 

        //CourseLeader Label for NonAcademic Course
        CourseLeader2 = new JLabel("Course Leader:");
        CourseLeader2.setBounds(450,160,100,30);
        panel3.add(CourseLeader2);

        txtCourseLeader2 = new JTextField();
        txtCourseLeader2.setBounds(550,160,180,30);
        panel3.add(txtCourseLeader2);

        //InstructorName Label for NonAcademic Course
        InstructorName = new JLabel("Instructor Name:");
        InstructorName.setBounds(450,210,100,30);
        panel3.add(InstructorName);

        txtInstructorName = new JTextField();
        txtInstructorName.setBounds(550,210,180,30);
        panel3.add(txtInstructorName);

        //StartDate Label for NonAcademic Course
        StartDate2 = new JLabel("Start Date:");
        StartDate2.setBounds(450,260,100,30);
        panel3.add(StartDate2);

        txtStartDate2 = new JTextField();
        txtStartDate2.setBounds(550,260,180,30);
        panel3.add(txtStartDate2);

        //CompletionDate Label for NonAcademic Course
        CompletionDate2 = new JLabel("Completion Date:");
        CompletionDate2.setBounds(450,310,150,30);
        panel3.add(CompletionDate2);

        txtCompletionDate2 = new JTextField();
        txtCompletionDate2.setBounds(550,310,180,30);
        panel3.add(txtCompletionDate2);

        //ExamDate Label for NonAcademic Course
        ExamDate = new JLabel("Exam Date:");
        ExamDate.setBounds(450,360,100,30);
        ExamDate.setVisible(false);
        panel3.add(ExamDate);

        txtExamDate = new JTextField();
        txtExamDate.setBounds(550,360,180,30);
        txtExamDate.setVisible(false);
        panel3.add(txtExamDate);

        //Register Button for NonAcademic Course
        btnRegister2 = new JButton("Register Non-Academic Course");
        btnRegister2.setBounds(450,400,280,40);
        btnRegister2.setFont(bf2);
        btnRegister2.setBackground(new Color(250, 245, 175));
        panel3.add(btnRegister2);
        btnRegister2.addActionListener(this);

        //Display Button for NonAcademic Course
        btnDisplay2 = new JButton("Display Non-Academic Course");
        btnDisplay2.setBounds(450,450,280,40);
        btnDisplay2.setFont(bf2);
        btnDisplay2.setBackground(new Color(250, 245, 175));
        panel3.add(btnDisplay2);
        btnDisplay2.addActionListener(this);

        //Display Button for NonAcademic Course
        btnRemove = new JButton("Remove Non-Academic Course");
        btnRemove.setBounds(450,500,280,40);
        btnRemove.setFont(bf2);
        btnRemove.setBackground(new Color(250, 245, 175));
        btnRemove.setVisible(false);
        panel3.add(btnRemove);
        btnRemove.addActionListener(this);

        //Clear Button for NonAcademic Course
        btnClear2 = new JButton("CLEAR");
        btnClear2.setBounds(510,560,150,50);
        btnClear2.setForeground(Color.WHITE);
        btnClear2.setBackground(Color.RED);
        btnClear2.setFont(bf1);
        panel3.add(btnClear2);
        btnClear2.addActionListener(this);

        //NonAcademic Course Button for Academic panel
        btnNonAcademic = new JButton("Go to Non Academic Course");
        btnNonAcademic.setBounds(450,100,300,40);
        btnNonAcademic.setFont(bf2);
        btnNonAcademic.setBackground(new Color(250, 245, 175));
        panel1.add(btnNonAcademic);
        btnNonAcademic.addActionListener(this);

        //Academic Course Button for Non Academic panel
        btnAcademic = new JButton("Go to Academic Course");
        btnAcademic.setBounds(450,100,300,40);
        btnAcademic.setFont(bf2);
        btnAcademic.setBackground(new Color(250, 245, 175));
        panel3.add(btnAcademic);
        btnAcademic.addActionListener(this);

        //Adding all the frames to panel
        frame.add(panel2);
        frame.add(panel1);
        
        frame.add(panel4);
        frame.add(panel3);

        //Setting the size, layout, visibility, resizability and default close operation of frame
        frame.setSize(800,700);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
       actionPerformed method that handles all the actions that will be executed when an specific action occurs.
       It has parameter ActionEvent class with name e.
       */
    public void actionPerformed(ActionEvent e)
    {
        //To Switch from NonAcademic to Academic 
        if(e.getSource()==btnNonAcademic){
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(true);
            panel4.setVisible(true);
            ExamDate.setVisible(true);
            txtExamDate.setVisible(true);
            btnRemove.setVisible(true);

        }
        //To Swtich from NonAcademic to Academic 
        else if(e.getSource()==btnAcademic){
            panel1.setVisible(true);
            panel2.setVisible(true);
            panel3.setVisible(false);
            panel4.setVisible(false);
        }
        //For Add button in Academic Course
        else if(e.getSource()==btnAdd1){
            //Set the isAdded status to false
            boolean isAdded = false;
            //Check if any of the fields have been left empty
            if(txtCourseID1.getText().isEmpty()|| txtCourseName1.getText().isEmpty()|| txtDuration1.getText().isEmpty() ||txtLevel.getText().isEmpty() || txtCredit.getText().isEmpty() 
            || txtNo_of_Assessment.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(frame,"Empty Fields found! Please enter again","Alert",JOptionPane.WARNING_MESSAGE);
            }
            //Execute the code below if all the fields have been filled
            else{
                //Store the values entered in textfield into a seperate variable with String data type
                
                aCourseID = txtCourseID1.getText();  

                aCourseName = txtCourseName1.getText();

                aLevel = txtLevel.getText();
                
                //Try block to check for NumberFormatException while parsing the value of Credit into Integer
                try{
                    
                    aCredit = txtCredit.getText();
                    a_credit = Integer.parseInt(aCredit);
                    
                    //Try block to check for NumberFormatException while parsing the value of Duration into Integer
                     try{
                         
                        aDuration = txtDuration1.getText(); 
                        a_duration = Integer.parseInt(aDuration);
                        
                        //Try block to check for NumberFormatException while parsing the value of No. of Assessments into Integer
                        try{
                            
                            aAssessment = txtNo_of_Assessment.getText();
                            a_assessment = Integer.parseInt(aAssessment);
                            
                            //For each Loop to iterate ac object stored in arraylist of Course class
                            for(Course ac: alist){
                                //Check if the CourseID entered is equal to any existing CourseID
                                if(ac.getCourseID().equals(aCourseID)){
                                    //The isAdded status is set to true
                                    isAdded = true;
                                    JOptionPane.showMessageDialog(frame,"Course ID "+aCourseID+" Already Added!","Error",JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                            
                            //Check if the isAdded status is false
                            if(isAdded == false){        
                                
                                //Call constructor of AcademicCourse class to store into academic_course Object
                                academic_course = new AcademicCourse(aCourseID,aCourseName,a_duration,aLevel,aCredit,a_assessment);
                                
                                //Adding the object into alist using add keyword
                                alist.add(academic_course); 
                                
                                JOptionPane.showMessageDialog(frame,"Academic Course Added Successfully!");
                            }

                        }
                        //Catch block for No. of Assessment to catch NumberFormatException while parsing
                        catch(NumberFormatException exc){
                            
                            JOptionPane.showMessageDialog(frame,"Invalid Input in Number of Assessment","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    //Catch block for Duration to catch NumberFormatException while parsing
                    catch(NumberFormatException exc){
                        
                        JOptionPane.showMessageDialog(frame,"Invalid Input in Duration","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                //Catch block for Credit to catch NumberFormatException while parsing
                catch(NumberFormatException exc){
                    
                    JOptionPane.showMessageDialog(frame,"Invalid Input in Credit","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //For Add Button in NonAcademicCourse
        else if(e.getSource()==btnAdd2){
            //Set the isAdded status to false
            boolean isAdded = false;
            
            //Check if any of the fields required to add NonAcademic Course has been left empty
            if(txtCourseID2.getText().isEmpty()|| txtCourseName2.getText().isEmpty() || txtDuration2.getText().isEmpty() || 
            txtPrerequisite.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(frame,"Empty Fields Found! Please enter again","Alert",JOptionPane.WARNING_MESSAGE);
            }
            
            //If all the fields are filled
            else{
                
                //Store all the input values in a seperate variable with String data type
                nCourseID = txtCourseID2.getText();
                
                nCourseName = txtCourseName2.getText();
                
                nPrerequisite = txtPrerequisite.getText();
                
                //Try block for duration to check for NumberFormatException while parsing from String to Integer
                try{
                                        
                    nDuration = txtDuration2.getText(); 
                    n_duration = Integer.parseInt(nDuration);
                    
                    //For each loop to Loop through the arraylist
                    for(Course nc: alist){ 
                        
                        //If the CourseID entered matches the courseID already stored in nc object
                        if(nc.getCourseID().equals(nCourseID)){
                            //Set the isAdded status to true
                            isAdded = true;
                            JOptionPane.showMessageDialog(frame,"CourseID "+nCourseID+" Already Added!","Error",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                    
                    //If the isAdded status is false 
                    if(isAdded == false){
                        //Call constructor of NonAcademicCourse class to store into nacademic_course Object 
                        nacademic_course = new NonAcademicCourse(nCourseID, nCourseName,n_duration,nPrerequisite);
                        
                        //add the object into arraylist 
                        alist.add(nacademic_course);
                        
                        JOptionPane.showMessageDialog(frame,"Non Academic Course Added Successfully!");
                    }
                }
                //Catch block for Duration to catch NumberFormatException while parsing
                catch(NumberFormatException exc){
                    
                    JOptionPane.showMessageDialog(frame,"Invalid Input Found in Duration","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //Register Button for Academic Course
        else if(e.getSource()==btnRegister1){
            registerAID = txtCourseID1.getText(); 

            registerACourseLeader = txtCourseLeader1.getText();   

            registerALecturer = txtLecturerName.getText();

            registerAStartDate = txtStartDate1.getText();

            registerACompletionDate = txtCompletionDate1.getText();
            
            //Checking if any of the fields required to register an AcademicCourse has been left empty
             if( txtCourseLeader1.getText().isEmpty() || txtLecturerName.getText().isEmpty() ||txtStartDate1.getText().isEmpty()||
                txtCompletionDate1.getText().isEmpty() ){

                JOptionPane.showMessageDialog(frame, "Empty Fields found. Please fill the form again","Alert",JOptionPane.WARNING_MESSAGE);

            }
            //If all the text fields are filled
            else{
                for (Course ac: alist){    
                    //Comparision of CourseID
                    if(ac.getCourseID().equals(registerAID)){
                        
                        if(ac instanceof AcademicCourse){
                            //Performing Downcasting for AcademicCourseClass
                            academic_course =(AcademicCourse) ac; 
                            
                            //If the academic course is already registered
                            if(academic_course.getisRegistered()== true){
                                
                                JOptionPane.showMessageDialog(frame,"The Course has already been registered","Alert",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            //If the academic course has not been registered
                            else if(academic_course.getisRegistered()==false){
                                
                                //Calling the register method in AcademicCourse Class
                                academic_course.register(registerACourseLeader,registerALecturer, registerAStartDate, 
                                    registerACompletionDate);
                                    
                                JOptionPane.showMessageDialog(frame,"The Course has been registered!");
                                break;
                            }
                        }
                    }
                }
            } 
        }
        
        //Register Button For NonAcademic Course
        else if(e.getSource()==btnRegister2){
            //Storing the input in text fields into a variable with String data type
            
            registerNAID = txtCourseID2.getText();

            registerNACourseLeader = txtCourseLeader2.getText();

            registerNAInstructor = txtInstructorName.getText();

            registerNAStartDate = txtStartDate2.getText();

            registerNACompletionDate = txtCompletionDate2.getText();

            registerNAExamDate = txtExamDate.getText();
            
            //Check if any of the fields are left empty
            if(registerNAID.isEmpty() || registerNACourseLeader.isEmpty() || registerNAInstructor.isEmpty()||
            registerNAStartDate.isEmpty() || registerNACompletionDate.isEmpty() || registerNAExamDate.isEmpty()){
                
                //An appropriate message displays if any of the text fields are left empty
                JOptionPane.showMessageDialog(frame, "Empty Fields found. Please fill the form again","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                
                //For each loop to iterate through nc object of Course class
                for(Course nc: alist ){
                    //Checking if the CourseID entered matches the CourseID in nc object
                    if(nc.getCourseID().equals(registerNAID)){
                        
                        if(nc instanceof NonAcademicCourse){
                            //Performing downcasting for NonAcademicCourse class  
                            nacademic_course =(NonAcademicCourse) nc;

                            //If the NonAcademic Course is already added
                            if(nacademic_course.getisRegistered()== true){
                                JOptionPane.showMessageDialog(frame,"The Course has already been registered!!","Error",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            //If the Non Academic Course has not been added
                            else if(nacademic_course.getisRegistered()==false){
                                
                                //Calling the register method in NonAcademicCourse class
                                nacademic_course.Register(registerNACourseLeader,registerNAInstructor, registerNAStartDate, 
                                    registerNACompletionDate,registerNAExamDate);
                                
                                JOptionPane.showMessageDialog(frame,"The Course has been registered!");
                                break;
                            }
                        }
                        
                    }
                }
            }
        }
        //Remove Button for NonAcademic Course 
        else if(e.getSource()==btnRemove){
            if(alist.isEmpty()){
                JOptionPane.showMessageDialog(frame," No Course found to remove","Error",JOptionPane.ERROR_MESSAGE);                
            }
            
            //For each loop is used to traverse nc object in Course object
            for(Course nc : alist){
            
                //Checking if the input CourseID matches the CourseID in nc object
                if(nc.getCourseID().equals(txtCourseID2.getText())){
                
                    //Check if the object nc is an instance of NonAcademicCourse
                    if(nc instanceof NonAcademicCourse){
                        
                        //Performing Downcasting for NonAcademicCourse
                        nacademic_course =(NonAcademicCourse) nc;
                        
                        //Check if the isRemoved status object nacademic_course if true
                        if(nacademic_course.getisRemoved()== true){
                            JOptionPane.showMessageDialog(frame," No Course found to remove","Error",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                        
                        //If the Non Academic Course has not been added
                        else if(nacademic_course.getisRemoved()==false){
                            nacademic_course.Remove();
                            JOptionPane.showMessageDialog(frame,"The Course has  been removed!");
                            break;
                        }
                    }
                }
            }
        }
        //Display method for Academic Course
        else if(e.getSource()==btnDisplay1){
            //checking if array list is empty
            if(alist.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Sorry! Nothing to Display","Error",JOptionPane.ERROR_MESSAGE);
            }
            
            else{
                //For each loop
                for(Course academic : alist){
                    //checking if object is an instance of AcademicCourse class 
                    if(academic instanceof AcademicCourse){
                        System.out.println("=============ACADEMIC COURSE=============");
                        
                        //Performing Downcasting for AcademicCourse
                        academic_course = (AcademicCourse) academic; 
                        //Calling the display method from AcademicCourse class
                        academic_course.display();
                    }    
                }
            }
        }
        
        //Display Button for NonAcademic Course
        else if(e.getSource()==btnDisplay2){

            //Check if the list is empty
            if(alist.isEmpty()){
                
                JOptionPane.showMessageDialog(frame,"Sorry! Nothing to Display","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                
                //For each loop to iterate through the arraylist in Course 
                for(Course nacademic : alist){
                    
                    //Check if nacademic object is an instance of NonAcademicCourse class
                    if(nacademic instanceof NonAcademicCourse){
                        
                        System.out.println("==============NON ACADEMIC COURSE==============");
                        //Performing downcasting for NonAcademicCourse
                        nacademic_course = (NonAcademicCourse) nacademic;
                        //Calling the display method in NonAcademicCourse class 
                        nacademic_course.display();
                    }                
                }
            }
        }
        
        //ClearButton for AcademicCourse
        else if(e.getSource()==btnClear1){
            //Set all the text fields in AcademicCourse to ""
            
            txtCourseID1.setText("");
            txtCourseName1.setText("");
            txtCourseLeader1.setText("");
            txtDuration1.setText(""); 
            txtLecturerName.setText("");
            txtLevel.setText("");
            txtCredit.setText("");
            txtNo_of_Assessment.setText("");
            txtStartDate1.setText("");
            txtCompletionDate1.setText("");
        }
        
        //Clear button for NonAcademicCourse
        else if(e.getSource()==btnClear2){
            //Set all the text fields in NonAcademicCourse panel to ""
            
            txtCourseID2.setText("");
            txtCourseName2.setText("");
            txtCourseLeader2.setText("");
            txtDuration2.setText(""); 
            txtInstructorName.setText("");
            txtPrerequisite.setText("");
            txtStartDate2.setText(""); 
            txtCompletionDate2.setText(""); 
            txtExamDate.setText("");
        }
    }
    
    /**
       Main Method to create object of constructor
       */
    public static void main(String[] args)
    {
        new INGCollege();
    }
}