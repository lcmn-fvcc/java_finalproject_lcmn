/*
Laura Mills Nelson
Final Project -- FVCCStudent Class
05/14/18
 */
package finalproject_millsnelson;

/**
 *
 * @author adnfr
 */
public class FVCCStudent
{
    //private members
    private String fname;
    private String lname;
    private String major;
    private double GPA;

    //blank or default constructor
    public FVCCStudent()
    {
    }
      
    
    //constructor with all private members
    public FVCCStudent(String fname, String lname, String major, double GPA)
    {
        this.fname = fname;
        this.lname = lname;
        this.major = major;
        this.GPA = GPA;
    }
    
    
    //setters and getters for all private members
    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public double getGPA()
    {
        return GPA;
    }

    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }
    
    
    //function to show student's information
    public String StudentInfo()
    {
        return "Name: " + fname + " " + lname + "\nMajor: " + major
                + "\nGPA: " + GPA;
        
        
    }
    
    
    
}
