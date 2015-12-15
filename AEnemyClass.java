public class AEnemyClass 
{
	public static int AEprobability;
	public static int AEStrength;
	public static int AEHealth;
	static int EDodgeChance;

	public AEnemyClass(int S1, int H1)

	{

		AEStrength = S1;

		AEHealth = H1;
		
		
	}


	
	public static void EAttack()
	{
		if (ArcherAttackClass.Aattack == false)
		{
			EDodgeChance = (int) ((Math.random()*3) + 1);
			if (EDodgeChance == 1 || EDodgeChance == 2)
			{
				AEprobability = (int) Math.random()*5 + 1;
				if (AEprobability == 1 || AEprobability == 1 || AEprobability == 3 || AEprobability == 4)
				{
					ArcherClass.AHealth = ArcherClass.AHealth - (AEStrength);
					System.out.println("The enemy does " + AEStrength + " damage.");
				}
			
				if (AEprobability == 5)
				{
					AEprobability = AEprobability + 3;
					ArcherClass.AHealth = ArcherClass.AHealth - (AEStrength + 20);
					System.out.println("The enemy does " + AEStrength*AEprobability + " damage.");
				}
			
				if (ArcherClass.AHealth <= 0)
				{
					System.out.println("You have died.");
					RunClass.i = 1;
				}
				else
				{
					System.out.println("You have " + ArcherClass.AHealth + " health.");
				}
				ArcherAttackClass.Aattack = true;
			}
			
			if(EDodgeChance == 3)
			{
				System.out.println(WarriorClass.name + " has dodged the enemy's weapon.");
				ArcherAttackClass.Aattack = true;
			}
		}
	}
	
	public static void EnemyUpgrade()
	{
		if (ArcherLevelClass.Alevel > 1)
		{
			AEStrength = (AEStrength + (ArcherLevelClass.Alevel * 10));
			Math.round(AEStrength);
			AEHealth = (AEHealth + (ArcherLevelClass.Alevel * 10));
			Math.round(AEHealth);
		}
	}
}