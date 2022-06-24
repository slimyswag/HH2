import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * This is true
 *
 * @author Ethan Cuthrell
 * @version 6/24
 */
public class Main
{
    /**
     * Pollution fireP = new Pollution(10, "Fireplace");
        Pollution forestF = new Pollution(60, "Forest Fire");
        Pollution car = new Pollution(20, "Car");
        Pollution plane = new Pollution(40, "Plane");
        Pollution factory = new Pollution(100, "Factory");
        Pollution powerP = new Pollution(70, "Power Plant");
        
        Attacks conserveP = new Attacks(25, "Conserve Power");
        Attacks filter = new Attacks(10, "Fireplace Filters");
        Attacks tree = new Attacks(50, "Plant a Tree");
        Attacks publicT = new Attacks(30, "Use Public Transport");
     */
    public static void main(String args[])
    {
        System.out.println("Pollution is attacking!");
        round1();
        
    }
    
    public static void round1()
    {
        System.out.println("Round 1 has begun");
        System.out.println("Enemies: ");
        Pollution fireP = new Pollution(10, "Fireplace");
        System.out.println(fireP);
    }
    
    public static void attack1()
    {
        
    }
}
