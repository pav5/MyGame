
public class StaffClass 
{
	public static int StaffStrength = 30;
	public static int HealSpell = 7;
	
	public static void Heal()
	{
		MageClass.MHealth = MageClass.MHealth + HealSpell;
		if (MageClass.MHealth > MageClass.MMaxHealth)
		{
			MageClass.MHealth = MageClass.MMaxHealth;
		}
		System.out.println("Your health is now " + MageClass.MHealth);
	}
}
