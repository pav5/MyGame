import java.util.Scanner;


public class WarriorAttackClass 
{
	public static int WHprobability;
	public static int BlockChance;
	public static boolean Wattack = true;

		
	public static void HAttack()
	{
		if (Wattack == true)
		{
			System.out.println("How would you like to attack?");
			System.out.println("To attack with sword, press 1");
			System.out.println("To bash with sheild press, press 2. If you bash there is a chance that you can block some of the enemy's damage.");
			System.out.println("");
			System.out.println("");
			Scanner scan2 = new Scanner(System.in);
			int AttackOptions = scan2.nextInt();
			
			if(AttackOptions == 1)
			{
				WHprobability = (int) ((Math.random()*5) + 1);
				if (WHprobability == 1 || WHprobability == 1 || WHprobability == 3 || WHprobability == 4)
				{
					WEnemyClass.WEHealth = WEnemyClass.WEHealth - (WarriorClass.WStrength + (SwordClass.SwordStrength));
					System.out.println(WarriorClass.name+ " does " + (WarriorClass.WStrength + SwordClass.SwordStrength) + " damage.");
				}
				if (WHprobability == 5)
				{
					WEnemyClass.WEHealth = WEnemyClass.WEHealth - (WarriorClass.WStrength + (SwordClass.SwordStrength * 2));
					System.out.println(WarriorClass.name+ " does " + (WarriorClass.WStrength + (SwordClass.SwordStrength * 2)) + " damage. You got a critical hit.");
				}
				
				if (WEnemyClass.WEHealth < 0)
				{
					System.out.println("The enemy has died.");
					WarriorClass.WHealth = WarriorClass.WMaxHealth;
					System.out.println("Your health has been replenished.");
					System.out.println("");
					WarriorLevelClass.level();
					RunClass.i = 1;
				}
				else
				{
					System.out.println("Your enemy has " + WEnemyClass.WEHealth + " health.");
				
				}
				Wattack = false;
			}
			
			if(AttackOptions == 2)
			{
				BlockChance = (int) (Math.random()*2);
				
				WHprobability = (int) ((Math.random()*5) + 1);
				if (WHprobability == 1 || WHprobability == 1 || WHprobability == 3 || WHprobability == 4)
				{
					WEnemyClass.WEHealth = WEnemyClass.WEHealth - (WarriorClass.WStrength + ShieldClass.ShieldStrength);
					System.out.println(WarriorClass.name+ " does " + (WarriorClass.WStrength + ShieldClass.ShieldStrength) + " damage.");
				}
				if (WHprobability == 5)
				{
					WEnemyClass.WEHealth = WEnemyClass.WEHealth - (WarriorClass.WStrength + (ShieldClass.ShieldStrength * 2));
					System.out.println(WarriorClass.name+ " does " + (WarriorClass.WStrength + (ShieldClass.ShieldStrength * 2)) + " damage. You got a critical hit.");
				}
				
				if (WEnemyClass.WEHealth < 0)
				{
					System.out.println("The enemy has died.");
					WarriorClass.WHealth = WarriorClass.WMaxHealth;
					System.out.println("Your health has been replenished.");
					System.out.println("");
					WarriorLevelClass.level();
					RunClass.i = 1;
				}
				else
				{
					System.out.println("Your enemy has " + WEnemyClass.WEHealth + " health.");
				}
				
				Wattack = false;
			}
				
		}
	}
}

