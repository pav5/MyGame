import java.util.Scanner;

public class Run {
	public static int enemyEncounter = 0;

	public static void main(String[] args) {
		String left = "a";
		String right = "d";
		String up = "w";
		String down = "s";
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
			System.out.print("Enter move options:\n" + "left = [" + left + "], right = [" + right + "], up = [" + up
					+ "], down = [" + down + "].\tTo Exit press [q]:\n");
			String n = in.nextLine();

			if (n.equalsIgnoreCase("q")) {
				in.close();
				System.exit(0);
			}

			if (n.equalsIgnoreCase("d")) {
				Map.initArrayValues("d");
			}

			if (n.equalsIgnoreCase("s")) {
				Map.initArrayValues("s");
			}

			if (n.equalsIgnoreCase("a")) {
				Map.initArrayValues("a");
			}
		}
	}
}