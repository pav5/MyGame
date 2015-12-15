
public class MageAttackClass 
{
	public static int Hprobability;
	public static boolean Mattack = true;

		
	public static void HAttack()
	{
		if (Mattack == true)
		{
			Hprobability = (int) Math.random()*5 + 1;
			if (Hprobability == 1 || Hprobability == 1 || Hprobability == 3 || Hprobability == 4)
			{
				MEnemyClass.MEHealth = MEnemyClass.MEHealth - (MageClass.MStrength*1);
			}
			if (Hprobability == 5)
			{
				MEnemyClass.MEHealth = MEnemyClass.MEHealth - (MageClass.MStrength*2);
			}
			//System.out.println(WarriorClass.WHealth);
			System.out.println(WarriorClass.name+ " does " + MageClass.MStrength*Hprobability + " damage.");
			
			if (MEnemyClass.MEHealth < 0)
			{
				System.out.println("The enemy has died.");
				MageClass.MHealth = MageClass.MMaxHealth;
				System.out.println("Your health has been replenished.");
				System.out.println("");
				MageLevelClass.level();
				RunClass.i = 1;
			}
			else
			{
				System.out.println("Your enemy has " + MEnemyClass.MEHealth + " health.");
				
			}
			Mattack = false;
		}
	}
}

