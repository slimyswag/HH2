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
        Pollution factory = new Pollution(70, "Factory");
        Pollution powerP = new Pollution(100, "Power Plant");
        
        Attacks conserveP = new Attacks(25, "Conserve Power");
        Attacks filter = new Attacks(10, "Fireplace Filters");
        Attacks tree = new Attacks(50, "Plant a Tree");
        Attacks publicT = new Attacks(30, "Use Public Transport");
     */
    public static void main(String args[])
    {
        System.out.println("Pollution is attacking!");
        ArrayList<Attacks> attackL = attackList();
        Scanner input = new Scanner(System.in);
        //round1();
        System.out.println("Round 1 has begun");
        System.out.println("Enemies: ");
        Pollution fireP = new Pollution(10, "Fireplace");
        System.out.println(fireP);
        System.out.println("");
        int num = 0;
        int turns = 0;
        String target = "";
        while (fireP.getHealth() > 0)
        {
            System.out.println("Possible Attacks: ");
            for (int i = 0; i < attackL.size(); i++)
            {
                System.out.println(attackL.get(i));
            }
            System.out.println("Choose an attack (Enter 1, 2, 3, or 4): ");
            num = input.nextInt();
            if (num == 1)
            {
                fireP.setHealth(fireP.getHealth() - 25);
            }
            if (num == 2)
            {
                fireP.setHealth(fireP.getHealth() - 10);
            }
            if (num == 3)
            {
                fireP.setHealth(fireP.getHealth() - 50);
            }
            if (num == 4)
            {
                fireP.setHealth(fireP.getHealth() - 30);
            }
            turns++;
        }
        System.out.println("Fireplace has been defeated");
        System.out.println("Round 1 is over");
        System.out.println("");
        //Round 2
        System.out.println("Round 2 has begun");
        System.out.println("Enemies: ");
        Pollution fireP2 = new Pollution(10, "Fireplace");
        Pollution car = new Pollution(20, "Car");
        System.out.println(fireP2);
        System.out.println(car);
        System.out.println("");
        num = 0;
        while ((fireP2.getHealth() > 0) || (car.getHealth() > 0))
        {
            System.out.println("Possible Attacks: ");
            for (int i = 0; i < attackL.size(); i++)
            {
                System.out.println(attackL.get(i));
            }
            System.out.println("Choose a target for attack: ");
            target = input.next();
            System.out.println("Choose an attack (Enter 1, 2, 3, or 4): ");
            num = input.nextInt();
            
            if (target.equals("Fireplace"))
            {
                if (num == 1)
                {
                    fireP2.setHealth(fireP2.getHealth() - 25);
                }
                if (num == 2)
                {
                    fireP2.setHealth(fireP2.getHealth() - 10);
                }
                if (num == 3)
                {
                    fireP2.setHealth(fireP2.getHealth() - 50);
                }
                if (num == 4)
                {
                    fireP2.setHealth(fireP2.getHealth() - 30);
                }
            }
            if (target.equals("Car"))
            {
                if (num == 1)
                {
                    car.setHealth(car.getHealth() - 25);
                }
                if (num == 2)
                {
                    car.setHealth(car.getHealth() - 10);
                }
                if (num == 3)
                {
                    car.setHealth(car.getHealth() - 50);
                }
                if (num == 4)
                {
                    car.setHealth(car.getHealth() - 30);
                }
            }
            turns++;
            if((fireP2.getHealth() <= 0) && (car.getHealth() <= 0))
            {
                System.out.println("Fireplace and Car have been Defeated");
            }
            else if(fireP2.getHealth() <= 0)
            {
                System.out.println("Enemies: ");
                System.out.println("Fireplace: Defeated");
                System.out.println(car);
                System.out.println("");
            }
            else if(car.getHealth() <= 0)
            {
                System.out.println("Enemies: ");
                System.out.println(fireP2);
                System.out.println("Car: Defeated");
                System.out.println("");
            }
            else
            {
                System.out.println("Enemies: ");
                System.out.println(fireP2);
                System.out.println(car);
                System.out.println("");
            }
            
        }
        System.out.println("Round 2 is over");
        System.out.println("");
        //Round 3
        System.out.println("Round 3 has begun");
        System.out.println("Enemies: ");
        Pollution car2 = new Pollution(20, "Car");
        Pollution plane = new Pollution(40, "Plane");
        System.out.println(car2);
        System.out.println(plane);
        num = 0;
        System.out.println("");
        while ((car2.getHealth() > 0) || (plane.getHealth() > 0))
        {
            System.out.println("Possible Attacks: ");
            for (int i = 0; i < attackL.size(); i++)
            {
                System.out.println(attackL.get(i));
            }
            System.out.println("Choose a target for attack: ");
            target = input.next();
            System.out.println("Choose an attack (Enter 1, 2, 3, or 4): ");
            num = input.nextInt();
            
            if (target.equals("Plane"))
            {
                if (num == 1)
                {
                    plane.setHealth(plane.getHealth() - 25);
                }
                if (num == 2)
                {
                    plane.setHealth(plane.getHealth() - 10);
                }
                if (num == 3)
                {
                    plane.setHealth(plane.getHealth() - 50);
                }
                if (num == 4)
                {
                    plane.setHealth(plane.getHealth() - 30);
                }
            }
            if (target.equals("Car"))
            {
                if (num == 1)
                {
                    car2.setHealth(car2.getHealth() - 25);
                }
                if (num == 2)
                {
                    car2.setHealth(car2.getHealth() - 10);
                }
                if (num == 3)
                {
                    car2.setHealth(car2.getHealth() - 50);
                }
                if (num == 4)
                {
                    car2.setHealth(car2.getHealth() - 30);
                }
            }
            turns++;
            if((car2.getHealth() <= 0) && (plane.getHealth() <= 0))
            {
                System.out.println("Car and Plane have been Defeated");
            }
            else if(car2.getHealth() <= 0)
            {
                System.out.println("Enemies: ");
                System.out.println("Car: Defeated");
                System.out.println(plane);
                System.out.println("");
            }
            else if(plane.getHealth() <= 0)
            {
                System.out.println("Enemies: ");
                System.out.println(car2);
                System.out.println("Plane: Defeated");
                System.out.println("");
            }
            else
            {
                System.out.println("Enemies: ");
                System.out.println(car2);
                System.out.println(plane);
                System.out.println("");
            }
            
        }
        System.out.println("Round 3 is over");
        System.out.println("");
        //Round 4
        System.out.println("Round 4 has begun");
        System.out.println("Enemies: ");
        Pollution fireP3 = new Pollution(10, "Fireplace");
        Pollution forestF = new Pollution(60, "Forest Fire");
        System.out.println(fireP3);
        System.out.println(forestF);
        System.out.println("");
        num = 0;
        while ((fireP3.getHealth() > 0) || (forestF.getHealth() > 0))
        {
            System.out.println("Possible Attacks: ");
            for (int i = 0; i < attackL.size(); i++)
            {
                System.out.println(attackL.get(i));
            }
            System.out.println("Choose a target for attack: ");
            target = input.next();
            System.out.println("Choose an attack (Enter 1, 2, 3, or 4): ");
            num = input.nextInt();
            
            if (target.equals("Fireplace"))
            {
                if (num == 1)
                {
                    fireP3.setHealth(fireP3.getHealth() - 25);
                }
                if (num == 2)
                {
                    fireP3.setHealth(fireP3.getHealth() - 10);
                }
                if (num == 3)
                {
                    fireP3.setHealth(fireP3.getHealth() - 50);
                }
                if (num == 4)
                {
                    fireP3.setHealth(fireP3.getHealth() - 30);
                }
            }
            if (target.equals("ForestFire"))
            {
                if (num == 1)
                {
                    forestF.setHealth(forestF.getHealth() - 25);
                }
                if (num == 2)
                {
                    forestF.setHealth(forestF.getHealth() - 10);
                }
                if (num == 3)
                {
                    forestF.setHealth(forestF.getHealth() - 50);
                }
                if (num == 4)
                {
                    forestF.setHealth(forestF.getHealth() - 30);
                }
            }
            turns++;
            if((fireP3.getHealth() <= 0) && (forestF.getHealth() <= 0))
            {
                System.out.println("Fireplace and Forest Fire have been Defeated");
            }
            else if(fireP3.getHealth() <= 0)
            {
                System.out.println("Enemies: ");
                System.out.println("Fireplace: Defeated");
                System.out.println(forestF);
                System.out.println("");
            }
            else if(forestF.getHealth() <= 0)
            {
                System.out.println("Enemies: ");
                System.out.println(fireP3);
                System.out.println("Forest Fire: Defeated");
                System.out.println("");
            }
            else
            {
                System.out.println("Enemies: ");
                System.out.println(fireP3);
                System.out.println(forestF);
                System.out.println("");
            }
            
        }
        System.out.println("Round 4 is over");
        System.out.println("");
        //Round 5
        System.out.println("Round 5 has begun");
        System.out.println("Enemies: ");
        Pollution car3 = new Pollution(20, "Car");
        Pollution factory = new Pollution(70, "Factory");
        System.out.println(car3);
        System.out.println(factory);
        System.out.println("");
        num = 0;
        while ((car3.getHealth() > 0) || (factory.getHealth() > 0))
        {
            System.out.println("Possible Attacks: ");
            for (int i = 0; i < attackL.size(); i++)
            {
                System.out.println(attackL.get(i));
            }
            System.out.println("Choose a target for attack: ");
            target = input.next();
            System.out.println("Choose an attack (Enter 1, 2, 3, or 4): ");
            num = input.nextInt();
            
            if (target.equals("Car"))
            {
                if (num == 1)
                {
                    car3.setHealth(car3.getHealth() - 25);
                }
                if (num == 2)
                {
                    car3.setHealth(car3.getHealth() - 10);
                }
                if (num == 3)
                {
                    car3.setHealth(car3.getHealth() - 50);
                }
                if (num == 4)
                {
                    car3.setHealth(car3.getHealth() - 30);
                }
            }
            if (target.equals("Factory"))
            {
                if (num == 1)
                {
                    factory.setHealth(factory.getHealth() - 25);
                }
                if (num == 2)
                {
                    factory.setHealth(factory.getHealth() - 10);
                }
                if (num == 3)
                {
                    factory.setHealth(factory.getHealth() - 50);
                }
                if (num == 4)
                {
                    factory.setHealth(factory.getHealth() - 30);
                }
            }
            turns++;
            if((car3.getHealth() <= 0) && (factory.getHealth() <= 0))
            {
                System.out.println("Car and Factory have been Defeated");
            }
            else if(car3.getHealth() <= 0)
            {
                System.out.println("Enemies: ");
                System.out.println("Car: Defeated");
                System.out.println(factory);
                System.out.println("");
            }
            else if(factory.getHealth() <= 0)
            {
                System.out.println("Enemies: ");
                System.out.println(car3);
                System.out.println("Factory: Defeated");
                System.out.println("");
            }
            else
            {
                System.out.println("Enemies: ");
                System.out.println(car3);
                System.out.println(factory);
                System.out.println("");
            }
            
        }
        System.out.println("Round 5 is over");
        System.out.println("");
        //Round 6
        System.out.println("Round 6 has begun");
        System.out.println("Enemies: ");
        Pollution powerP = new Pollution(110, "Power Plant");
        System.out.println(powerP);
        System.out.println("");
        num = 0;
        while (powerP.getHealth() > 0)
        {
            System.out.println("Possible Attacks: ");
            for (int i = 0; i < attackL.size(); i++)
            {
                System.out.println(attackL.get(i));
            }
            System.out.println("Choose an attack (Enter 1, 2, 3, or 4): ");
            num = input.nextInt();
            if (num == 1)
            {
                System.out.println("Critical Strike");
                powerP.setHealth(powerP.getHealth() - 40);
            }
            if (num == 2)
            {
                powerP.setHealth(powerP.getHealth() - 10);
            }
            if (num == 3)
            {
                powerP.setHealth(powerP.getHealth() - 50);
            }
            if (num == 4)
            {
                powerP.setHealth(powerP.getHealth() - 30);
            }
            turns++;
            if(powerP.getHealth() <= 0)
            {
                System.out.println("Power Plant has been Defeated");
            }
            else
            {
                System.out.println("Enemies: ");
                System.out.println(powerP);
                System.out.println("");
            }
        }
        System.out.println("Round 6 is over");
        System.out.println("");
        System.out.println("Congrats! You won against the pollution in " + turns  + " turns!");
    }
     
    public static ArrayList<Attacks> attackList()
    {
        ArrayList<Attacks> aList = new ArrayList<Attacks>();
        Attacks conserveP = new Attacks("1 - Conserve Power", 25);
        Attacks filter = new Attacks("2 - Fireplace Filters", 10);
        Attacks tree = new Attacks("3 - Plant a Tree", 50);
        Attacks publicT = new Attacks("4 - Use Public Transport", 30);
        aList.add(conserveP);
        aList.add(filter);
        aList.add(tree);
        aList.add(publicT);
        return aList;
    }
}
