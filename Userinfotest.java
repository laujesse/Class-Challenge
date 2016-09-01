
/**
 * Write a description of class Userinfotest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Userinfotest
{
   public static void main(String args[])
   {
        Userinfo student = new Userinfo();
        System.out.println(student.getFirstname());
        Userinfo studenttwo = new Userinfo();
        studenttwo.setFirstname("Frank");
        System.out.println(studenttwo.getFirstname());
        Userinfo studentthree = new Userinfo();
        System.out.println(studentthree.getUserid());
   }
}
