
/**
 * Write a description of class Userinfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Userinfo
{
     // instance variables - replace the example below with your own
    private String firstname;
    private int userid;
    private String lastname; 
    /**
     * Constructor for objects of class LOL
     */
    public Userinfo()
    {
        // initialise instance variables
        firstname = "jesse";
        userid = 170717;
        lastname = "lau";
    }

    public String getFirstname()
    {
        // put your code here
        return this.firstname;
    }
    public void setFirstname(String newFirstname)
    {
        // put your code here
        this.firstname = newFirstname;
    }
    public int getUserid()
    {
        // put your code here
        return this.userid;
    }
    public void setUserid(int newUserid)
    {
        this.userid = newUserid;
    }
}
