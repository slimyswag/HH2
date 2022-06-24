
/**
 * Write a description of class Pollution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pollution
{
    // instance variables - replace the example below with your own
    private int health;
    private String name;

    /**
     * Constructor for objects of class Pollution
     */
    public Pollution(int h, String n)
    {
        health = h;
        name = n;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
    
    public String toString()
    {
        return name + " has " + health + " health";
    }
}
