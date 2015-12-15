import java.util.Scanner;

public class MageMenuClass 
{	
	public static int Swordtier = 0;
	public static int Armourteir = 0;

	public static void Inventory()
	{
		//System.out.println("Name: " + name);
		
		System.out.println("Name: " + WarriorClass.name);
		System.out.println("Level: " + MageLevelClass.Mlevel);
		System.out.println("Health: " + MageClass.MHealth);
		System.out.println("Strength: " + MageClass.MStrength);
		//System.out.println("Weapon: Sword " + Swordtier);
		//System.out.println("Armour: Chestpiece " + Armourteir);
		System.out.println("");
		System.out.println("");
		System.out.println("ENEMY:");
		System.out.println("Health: " + MEnemyClass.MEHealth);
		System.out.println("Strength: " + MEnemyClass.MEStrength);
		System.out.println("");
		System.out.println("");
	}
}
	

