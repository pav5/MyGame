
public class PotionClass 
{
	public static int WPotionHealth = 5;
	public static int APotionHealth = 10;

	public static void WarriorHeal()
	{
		WarriorClass.WHealth = WarriorClass.WHealth + WPotionHealth;
		if (WarriorClass.WHealth > WarriorClass.WMaxHealth)
		{
			WarriorClass.WHealth = WarriorClass.WMaxHealth;
			System.out.println("Your health is " + WarriorClass.WHealth);
		}
		else
		{
			System.out.println("Your health is " + WarriorClass.WHealth);
		}
		WarriorAttackClass.BlockChance = 0;
	}
	
	public static void ArcherHeal()
	{
		ArcherClass.AHealth = ArcherClass.AHealth + APotionHealth;
		if (ArcherClass.AHealth > ArcherClass.AMaxHealth)
		{
			ArcherClass.AHealth = ArcherClass.AMaxHealth;
			System.out.println("Your health is " + ArcherClass.AHealth);
		}
		else
		{
			System.out.println("Your health is " + ArcherClass.AHealth);
		}
	}
}
	

