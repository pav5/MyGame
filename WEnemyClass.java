
public class WEnemyClass 
{
	public static int WEprobability;
	
	public static int WEStrength;

	public static int WEHealth;

	public WEnemyClass(int S1, int H1)

	{

		WEStrength = S1;

		WEHealth = H1;
		
		
	}


	
	public static void EAttack()
	{
		if (WarriorAttackClass.Wattack == false)
		{
			WEprobability = (int) Math.random()*5 + 1;
			if (WEprobability == 1 || WEprobability == 1 || WEprobability == 3 || WEprobability == 4)
			{
				if(WarriorAttackClass.BlockChance == 1)
				{
					WarriorClass.WHealth = WarriorClass.WHealth - ((WEStrength) - ShieldClass.ShieldHealth);
					System.out.println("The enemy does " + WEStrength + " damage.");
					System.out.println("You blocked " + ShieldClass.ShieldHealth);
				}
				else
				{
					WarriorClass.WHealth = WarriorClass.WHealth - (WEStrength);
					System.out.println("The enemy does " + WEStrength + " damage.");
				}
			}
			
			if (WEprobability == 5)
			{
				if(WarriorAttackClass.BlockChance == 1)
				{
					WarriorClass.WHealth = WarriorClass.WHealth - ((WEStrength + 10) - ShieldClass.ShieldHealth);
					System.out.println("The enemy does " + (WEStrength + 10) + " damage. He got a critical hit.");
					System.out.println("Your blocked " + ShieldClass.ShieldHealth);
				}
				else
				{
					WarriorClass.WHealth = WarriorClass.WHealth - (WEStrength + 10);
					System.out.println("The enemy does " + (WEStrength + 10) + " damage.");
				}
			}
			
			if (WarriorClass.WHealth <= 0)
			{
				System.out.println("You have died.");
				RunClass.i = 1;
			}
			else
			{
				System.out.println("You have " + WarriorClass.WHealth + " health.");
			}
			WarriorAttackClass.Wattack = true;
		}
	}
	
	public static void EnemyUpgrade()
	{
		if (WarriorLevelClass.Wlevel > 1)
		{
			WEStrength = (WEStrength + (WarriorLevelClass.Wlevel * 10));
			Math.round(WEStrength);
			WEHealth = (WEHealth + (WarriorLevelClass.Wlevel * 10));
			Math.round(WEHealth);
		}
	}
}