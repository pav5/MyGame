import java.util.Scanner;


public class ArcherAttackClass 
{
	public static int AHprobability;
	public static boolean Aattack = true;
	static int ADodgeChance;


	public static void HAttack()
	{
		if (Aattack == true && RunClass.s < 2)
		{
			System.out.println("You are going to shoot with your bow. There is a chance that the enemy will dodge.");
			ADodgeChance = (int) ((Math.random()*3) + 1);
			if (ADodgeChance == 1 || ADodgeChance == 2)
			{
				AHprobability = (int) ((Math.random()*5) + 1);
				if (AHprobability == 1 || AHprobability == 1 || AHprobability == 3 || AHprobability == 4)
				{
					AEnemyClass.AEHealth = AEnemyClass.AEHealth - (ArcherClass.AStrength + BowClass.BowStrength);
					System.out.println(WarriorClass.name+ " does " + (ArcherClass.AStrength + BowClass.BowStrength) + " damage.");
				}
				if (AHprobability == 5)
				{
					AEnemyClass.AEHealth = AEnemyClass.AEHealth - (ArcherClass.AStrength + (BowClass.BowStrength * 2));
					System.out.println(WarriorClass.name+ " does " + (ArcherClass.AStrength + (BowClass.BowStrength * 2)) + " damage. You got a critical hit.");
				}
			
				if (AEnemyClass.AEHealth < 0)
				{
					System.out.println("The enemy has died.");
					ArcherClass.AHealth = ArcherClass.AMaxHealth;
					System.out.println("Your health has been replenished.");
					System.out.println("");
					ArcherLevelClass.level();
					RunClass.i = 1;
				}
			
				else
				{
					System.out.println("Your enemy has " + AEnemyClass.AEHealth + " health.");
				
				}
				Aattack = false;
			}
			
			if(ADodgeChance == 3)
			{
				System.out.println("The enemy dodged the arrow.");
			}
		}
		
		if (Aattack == true && RunClass.s > 1)
		{
			System.out.println("The enemy is to close use your bow. You pull out your knife to attack. There is a chance for you and the enemy to dodge each others weapons.");
			ADodgeChance = (int) ((Math.random()*3) + 1);
			if (ADodgeChance == 1 || ADodgeChance == 2)
			{
				AHprobability = (int) ((Math.random()*5) + 1);
				if (AHprobability == 1 || AHprobability == 1 || AHprobability == 3 || AHprobability == 4)
				{
					AEnemyClass.AEHealth = AEnemyClass.AEHealth - (ArcherClass.AStrength + KnifeClass.KnifeStrength);
					System.out.println(WarriorClass.name+ " does " + (ArcherClass.AStrength + KnifeClass.KnifeStrength) + " damage.");
				}
				if (AHprobability == 5)
				{
					AEnemyClass.AEHealth = AEnemyClass.AEHealth - (ArcherClass.AStrength + (KnifeClass.KnifeStrength));
					System.out.println(WarriorClass.name+ " does " + (ArcherClass.AStrength + (KnifeClass.KnifeStrength)) + " damage. You got a critical hit.");
				}
			
				if (AEnemyClass.AEHealth < 0)
				{
					System.out.println("The enemy has died.");
					ArcherClass.AHealth = ArcherClass.AMaxHealth;
					System.out.println("Your health has been replenished.");
					System.out.println("");
					ArcherLevelClass.level();
					RunClass.i = 1;
				}
			
				else
				{
					System.out.println("Your enemy has " + AEnemyClass.AEHealth + " health.");
				
				}
				Aattack = false;
			}
			
			if(ADodgeChance == 3)
			{
				System.out.println("The enemy dodged the knife.");
				Aattack = false;
			}
		
		}
	}
}

