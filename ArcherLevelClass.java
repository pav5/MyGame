import java.util.Scanner;


public class ArcherLevelClass 
{
	public static int Alevel = 0;
	
	public static void level()
	{
		

		
			Alevel++;
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
				ArcherClass.AStrength = ArcherClass.AStrength + 5;
				ArcherClass.AMaxStrength = ArcherClass.AStrength;
				System.out.println("Your strength is now " + ArcherClass.AStrength);
				System.out.println("");
			}
			if(Upgrades == 2)
			{
				ArcherClass.AHealth = ArcherClass.AHealth + 10;
				ArcherClass.AMaxHealth = ArcherClass.AHealth;
				System.out.println("Your health is now " + ArcherClass.AHealth);
				System.out.println("");
			}
		
	}
	
	
}