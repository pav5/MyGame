import java.util.Scanner;

public class RunClass {
	public static int i = 0;
	public static int s = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your name?");
		Scanner name1 = new Scanner(System.in);
		WarriorClass.name = name1.nextLine();

		System.out.println("What class would you like to be.");
		System.out.println(
				"For Warrior class, press 1. Warrior's have more health than the other class. the weapons are a sword, with a shield.");
		System.out.println(
				"For Archer class, press 2. Archer's have higher attack than warriors with their bow and can attack at close range with a knife. The nife is weaker than the sword.");
		System.out.println(
				"For Mage class, press 3. Mage's have low health but the highest attack of all three classes. They can also heal and attack in the same turn.");
		System.out.println("");
		System.out.println("");
		Scanner scan2 = new Scanner(System.in);
		int ClassSelector = scan2.nextInt();

		if (ClassSelector == 1) {
			WarriorClass Warrior = new WarriorClass(WarriorClass.name, (int) (Math.random() * 10) + 10,
					(int) (Math.random() * 10) + 40);
			WEnemyClass Enemy = new WEnemyClass((int) (Math.random() * 5) + 10, (int) (Math.random() * 40) + 50);

			WEnemyClass.EnemyUpgrade();
			System.out.println(WarriorClass.name + " your Strength is " + Warrior.WStrength + " and your Health is "
					+ Warrior.WHealth);
			System.out.println("Enemy Strength is " + Enemy.WEStrength + " and its Health is " + Enemy.WEHealth);
			// Scanner in = new Scanner(System.in);
			System.out.println("");
			System.out.println("");
			// System.out.print("Enter move options: ");

			// int n = in.nextInt();

			while (i == 0) {
				System.out.println("What would you like to do?");
				System.out.println("To run, press 1.");
				System.out.println("To attack, press 2.");
				System.out.println("To heal, press 3.");
				System.out.println("To view your stats, press 4.");
				System.out.println("");
				System.out.println("");
				Scanner scan1 = new Scanner(System.in);
				int Options = scan1.nextInt();

				if (Options == 1) {
					// MapClass.flee();
					i = 1;
				}

				if (Options == 2) {
					if (WarriorClass.WHealth >= 0 && WEnemyClass.WEHealth >= 0) {
						System.out.println("It is " + WarriorClass.name + "'s turn to attack");
						WarriorAttackClass.HAttack();
						System.out.println("");

						if (WEnemyClass.WEHealth >= 0) {
							System.out.println("It is the enemy's turn to attack");
							WEnemyClass.EAttack();
							System.out.println("");
						}
					}
				}

				if (Options == 3) {
					PotionClass.WarriorHeal();
					System.out.println("It is the enemy's turn to attack");
					WarriorAttackClass.Wattack = false;
					WEnemyClass.EAttack();
					System.out.println("");
				}

				if (Options == 4) {
					WarriorMenuClass.Inventory();
				}
			}
		}

		if (ClassSelector == 2) {
			ArcherClass Archer = new ArcherClass(WarriorClass.name, (int) (Math.random() * 10) + 10,
					(int) (Math.random() * 10) + 40);
			AEnemyClass Enemy = new AEnemyClass((int) (Math.random() * 5) + 10, (int) (Math.random() * 40) + 40);

			AEnemyClass.EnemyUpgrade();
			System.out.println(WarriorClass.name + " your Strength is " + ArcherClass.AStrength + " and your Health is "
					+ ArcherClass.AHealth);
			System.out.println("Enemy Strength is " + Enemy.AEStrength + " and its Health is " + Enemy.AEHealth);
			// Scanner in = new Scanner(System.in);
			System.out.println("");
			System.out.println("");
			// System.out.print("Enter move options: ");

			// int n = in.nextInt();

			while (i == 0) {
				System.out.println("What would you like to do?");
				System.out.println("To run, press 1.");
				System.out.println("To attack, press 2.");
				System.out.println("To heal, press 3. If you heal you will lose one of your two shots with the bow.");
				System.out.println("To view your stats, press 4.");
				System.out.println("");
				System.out.println("");
				Scanner scan1 = new Scanner(System.in);
				int Options = scan1.nextInt();

				if (Options == 1) {
					// MapClass.flee();
					i = 1;
				}

				if (Options == 2) {
					if (WarriorClass.WHealth >= 0 && AEnemyClass.AEHealth >= 0) {
						while (s < 2) {
							System.out.println("It is " + WarriorClass.name + "'s turn to attack");
							ArcherAttackClass.HAttack();
							System.out.println("");
							ArcherAttackClass.Aattack = true;
							s++;
						}

						if (s > 1) {
							System.out.println("It is " + WarriorClass.name + "'s turn to attack");
							ArcherAttackClass.HAttack();
							System.out.println("");
						}

						if (AEnemyClass.AEHealth >= 0) {
							ArcherAttackClass.Aattack = false;
							System.out.println("It is the enemy's turn to attack");
							AEnemyClass.EAttack();
							System.out.println("");
						}
					}
				}

				if (Options == 3) {
					PotionClass.ArcherHeal();
					s++;
					System.out.println("");
					if (s > 1) {
						System.out.println("It is the enemy's turn to attack");
						ArcherAttackClass.Aattack = false;
						AEnemyClass.EAttack();
						System.out.println("");
					}
				}

				if (Options == 4) {
					ArcherMenuClass.Inventory();
				}
			}
		}

		if (ClassSelector == 3) {
			MageClass Mage = new MageClass(WarriorClass.name, (int) (Math.random() * 10) + 10,
					(int) (Math.random() * 10) + 40);
			MEnemyClass Enemy = new MEnemyClass((int) (Math.random() * 5) + 10, (int) (Math.random() * 40) + 10);

			MEnemyClass.EnemyUpgrade();
			System.out.println(WarriorClass.name + " your Strength is " + MageClass.MStrength + " and your Health is "
					+ MageClass.MHealth);
			System.out.println("Enemy Strength is " + Enemy.MEStrength + " and its Health is " + Enemy.MEHealth);
			// Scanner in = new Scanner(System.in);
			System.out.println("");
			System.out.println("");
			// System.out.print("Enter move options: ");

			// int n = in.nextInt();

			while (i == 0) {
				System.out.println("What would you like to do?");
				System.out.println("To run, press 1.");
				System.out.println("To attack, press 2.");
				System.out.println("To heal, press 3.");
				System.out.println("To view your stats, press 4.");
				System.out.println("");
				System.out.println("");
				Scanner scan1 = new Scanner(System.in);
				int Options = scan1.nextInt();

				if (Options == 1) {
					// MapClass.flee();
					i = 1;
				}

				if (Options == 2) {
					if (MageClass.MHealth >= 0 && MEnemyClass.MEHealth >= 0) {
						System.out.println("It is " + WarriorClass.name + "'s turn to attack");
						MageAttackClass.HAttack();
						System.out.println("");

						if (MEnemyClass.MEHealth >= 0) {
							System.out.println("It is the enemy's turn to attack");
							MEnemyClass.EAttack();
							System.out.println("");
						}

					}
				}

				if (Options == 3) {
					StaffClass.Heal();
					MageAttackClass.HAttack();
					System.out.println("");
					System.out.println("");
					MEnemyClass.EAttack();
					System.out.println("");
					System.out.println("");
				}

				if (Options == 4) {
					MageMenuClass.Inventory();
				}
			}
		}
	}
}
