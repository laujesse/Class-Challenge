
/**
 * Write a description of class LOL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LOL
{
    // instance variables - replace the example below with your own
    private String flavour;
    private int weight;
    private String color;
    private String ingredient; 
    /**
     * Constructor for objects of class LOL
     */
    public LOL()
    {
        // initialise instance variables
        flavour = "salty";
        weight = 50;
        color = "red";
        ingredient = "blood";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getFlavour()
    {
        // put your code here
        return this.flavour;
    }
    public void setFlavour(String newFlavour)
    {
        // put your code here
        this.flavour = newFlavour;
    }
    public int getWeight()
    {
        // put your code here
        return this.weight;
    }
    public void setWeight(int newWeight)
    {
        this.weight = newWeight;
    }
}
