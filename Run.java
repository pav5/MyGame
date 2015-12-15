import java.util.Scanner;

public class Run {
	public static int enemyEncounter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Character cha = new Character ((int)(Math.random() * 10)+10, (int)
		// (Math.random() * 20) + 10);

		Map.initArrayValues("x");

		// Map.printArrayValues();

		// for (int i = 0; i < Map.LENGTH; i++)

		// {

		// Map.printArrayValues();

		// }

		// System.out.println(("Your Strength and Health are: ") +
		// (cha.Strength) +(" ")+ (cha.Health));

		Scanner in = new Scanner(System.in);

		for (int i = 1; i > enemyEncounter; i++) {
			System.out.print("Enter move options {n,s,e,w}: ");
			String n = in.nextLine();

			if (n.equalsIgnoreCase("n")) {
				Map.initArrayValues("n");
			}

			if (n.equalsIgnoreCase("e")) {
				Map.initArrayValues("e");
			}

			if (n.equalsIgnoreCase("s")) {
				Map.initArrayValues("s");
			}

			if (n.equalsIgnoreCase("w")) {
				Map.initArrayValues("w");
			}
		}
	}
}