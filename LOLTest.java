
/**
 * Write a description of class LOLTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LOLTest
{
    public static void main(String args[])
    {
        LOL hotdog = new LOL();
        System.out.println(hotdog.getFlavour());
        LOL maddog = new LOL();
        maddog.setFlavour("bitter");
        System.out.println(maddog.getFlavour());
    }
}
