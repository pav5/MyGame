import java.util.Scanner;

public class WarriorMenuClass 
{	
	public static int Swordtier = 0;
	public static int Armourteir = 0;

	public static void Inventory()
	{
		//System.out.println("Name: " + name);
		
		System.out.println("Name: " + WarriorClass.name);
		System.out.println("Level: " + WarriorLevelClass.Wlevel);
		System.out.println("Health: " + WarriorClass.WHealth);
		System.out.println("Strength: " + WarriorClass.WStrength);
		System.out.println("Weapon: Sword " + Swordtier);
		System.out.println("Armour: " + Armourteir);
		System.out.println("Sheild: " + ShieldClass.ShieldTeir);
		System.out.println("");
		System.out.println("");
		System.out.println("ENEMY:");
		System.out.println("Health: " + WEnemyClass.WEHealth);
		System.out.println("Strength: " + WEnemyClass.WEStrength);
		System.out.println("");
		System.out.println("");
	}
}
	

