public class ArcherMenuClass {
	public static int Swordtier = 0;
	public static int Armourteir = 0;

	public static void Inventory() {
		System.out.println("Name: " + WarriorClass.name);
		System.out.println("Level: " + ArcherLevelClass.Alevel);
		System.out.println("Health: " + ArcherClass.AHealth);
		System.out.println("Strength: " + ArcherClass.AStrength);
		// System.out.println(Weapon Sword + Swordtier);
		// System.out.println(Armour Chestpiece + Armourteir);
		System.out.println();
		System.out.println();
		System.out.println("ENEMY:");
		System.out.println("Health: " + AEnemyClass.AEHealth);
		System.out.println("Strength: " + AEnemyClass.AEStrength);
		System.out.println();
		System.out.println();
	}
}
