
public class MEnemyClass 
{
	public static int MEprobability;
	
	public static int MEStrength;

	public static int MEHealth;

	public MEnemyClass(int S1, int H1)

	{

		MEStrength = S1;

		MEHealth = H1;
		
		
	}


	
	public static void EAttack()
	{
		if (MageAttackClass.Mattack == false)
		{
			MEprobability = (int) Math.random()*5 + 1;
			if (MEprobability == 1 || MEprobability == 1 || MEprobability == 3 || MEprobability == 4)
			{
				MageClass.MHealth = MageClass.MHealth - (MEStrength*MEprobability);
			}
			
			if (MEprobability == 5)
			{
				MEprobability = MEprobability + 3;
				MageClass.MHealth = MageClass.MHealth - (MEStrength*MEprobability);
			}
			
			System.out.println("The enemy does " + MEStrength*MEprobability + " damage.");
			if (MageClass.MHealth <= 0)
			{
				System.out.println("You have died.");
				RunClass.i = 1;
			}
			else
			{
				System.out.println("You have " + MageClass.MHealth + " health.");
			}
			MageAttackClass.Mattack = true;
		}
	}
	
	public static void EnemyUpgrade()
	{
		if (MageLevelClass.Mlevel > 1)
		{
			MEStrength = (MEStrength + (MageLevelClass.Mlevel * 10));
			Math.round(MEStrength);
			MEHealth = (MEHealth + (MageLevelClass.Mlevel * 10));
			Math.round(MEHealth);
		}
	}
}