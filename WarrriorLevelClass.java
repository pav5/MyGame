import java.util.Scanner;


public class WarriorLevelClass 
{
	public static int Wlevel = 0;
	
	public static void level()
	{
		

		
			Wlevel++;
			System.out.println(WarriorClass.name + ", you have leveled up and gained points to increase your stats.");
			System.out.println("What would you like to upgrade?");
			System.out.println("To upgrade attack by 5, press 1.");
			System.out.println("To upgrade health by 10, press 2.");
			System.out.println("");
			System.out.println("");
			Scanner up = new Scanner(System.in);
			int Upgrades = up.nextInt();
			
			if(Upgrades == 1)
			{
				WarriorClass.WStrength = WarriorClass.WStrength + 5;
				WarriorClass.WMaxStrength = WarriorClass.WStrength;
				System.out.println("Your strength is now " + WarriorClass.WStrength);
				System.out.println("");
			}
			if(Upgrades == 2)
			{
				WarriorClass.WHealth = WarriorClass.WHealth + 10;
				WarriorClass.WMaxHealth = WarriorClass.WHealth;
				System.out.println("Your health is now " + WarriorClass.WHealth);
				System.out.println("");
			}
		
	}
	
	
}