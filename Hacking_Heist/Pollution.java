import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Pollution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pollution
{
    /**
     * Pollution example ideas: fireplaces, forest fires, cars, planes,
     * factories, power plants
     * 
     */
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
    
    public void setHealth(int newH)
    {
        health = newH;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return name + ": " + health + " health";
    }
}
