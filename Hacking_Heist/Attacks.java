import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Attacks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Attacks
{
    /**
     * Attacks on pollution ideas: Recycling, use less power, use filters
     * on fireplaces, plant a tree, use public transportation
     */
    private String title;
    private int dmg;
    /**
     * private int cooldown;
    private int current;
     */
    

    
    /**
     * Constructor for objects of class Attacks
     */
    public Attacks(String t, int d)
    {
        title = t;
        dmg = d;
        //cooldown = c;
    }

    public int getDMG()
    {
        return dmg;
    }
    
    public String getName()
    {
        return title;
    }
    
    public String toString()
    {
        return title + ": " + dmg + " damage";
    }
    
    /**
     * public void cooldown()
    {
        
    }
     */
    
    
    
}
