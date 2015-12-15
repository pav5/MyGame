import java.util.Scanner;


public class MageLevelClass 
{
	public static int Mlevel = 0;
	
	public static void level()
	{
		

		
			Mlevel++;
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
				MageClass.MStrength = MageClass.MStrength + 5;
				MageClass.MMaxStrength = MageClass.MStrength;
				System.out.println("Your strength is now " + MageClass.MStrength);
				System.out.println("");
			}
			if(Upgrades == 2)
			{
				MageClass.MHealth = MageClass.MHealth + 10;
				MageClass.MMaxHealth = MageClass.MHealth;
				System.out.println("Your health is now " + MageClass.MHealth);
				System.out.println("");
			}
		
	}
	
	
}