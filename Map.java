public class Map {
	// make map
	// make mobs
	// make items
	public static int defaultX = 20;
	public static int defaultY = 20;
	public static int posY = 0;
	public static int posX = 0;
	public static int CHARACTER = 1;
	public static int OBJECT = 3;
	public static int x;
	public static int y;

	public static void initArrayValues(String movement) {
		// Create new 2-dimensional array.
		String direction = movement;
		int[][] values = new int[defaultY][defaultX];
		y = 1;
		x = defaultX - 2;

		while (y < defaultY && x >= 0) {
			values[y][x] = OBJECT;
			y++;
			x--;
		}

		// values[defaultY/2][defaultX/2] = OBJECT;

		if (direction.equals("w")) {
			// checks to see the next spot north to see what's up
			if (posY != 0 && values[posY - 1][posX] != OBJECT) {
				posY = posY - 1;
			} else {
				// checks to see if there is an object in the way, if there
				// isn't
				// then it assumes there is a wall
				if (posY != 0 && values[posY - 1][posX] == OBJECT) {
					System.out.println("Cannot move farther, there is an object in the way, pick again");
				} else {
					System.out.println("Cannot move farther north, pick again");
				}
			}
		}

		if (direction.equals("s")) {
			// checks to see the next spot north to see what's up
			if (posY != defaultY - 1 && values[posY + 1][posX] != OBJECT) {
				posY = posY + 1;
			} else {
				// checks to see if there is an object in the way, if there
				// isn't
				// then it assumes there is a wall
				if (posY != defaultY - 1 && values[posY + 1][posX] == OBJECT) {
					System.out.println("Cannot move farther, there is an object in the way, pick again");
				} else {
					System.out.println("Cannot move farther south, pick again");
				}
			}
		}

		if (direction.equals("d")) {
			// checks to see the next spot north to see what's up
			if (posX != defaultX - 1 && values[posY][posX + 1] != OBJECT) {
				posX = posX + 1;
			} else {
				// checks to see if there is an object in the way, if there
				// isn't
				// then it assumes there is a wall
				if (posX != defaultX - 1 && values[posY][posX + 1] == OBJECT) {
					System.out.println("Cannot move farther, there is an object in the way, pick again");
				} else {
					System.out.println("Cannot move farther east, pick again");
				}
			}
		}

		if (direction.equals("a")) {
			// checks to see the next spot north to see what's up
			if (posX != 0 && values[posY][posX - 1] != OBJECT) {
				posX = posX - 1;
			} else {
				// checks to see if there is an object in the way, if there
				// isn't
				// then it assumes there is a wall
				if (posX != 0 && values[posY][posX - 1] == OBJECT) {
					System.out.println("Cannot move farther, there is an object in the way, pick again");
				} else {
					System.out.println("Cannot move farther west, pick again");
				}
			}
		}

		// Loop over top-level arrays.
		// Assign character position
		values[posY][posX] = CHARACTER;

		for (int y = 0; y < values.length; y++) {
			// Loop and display sub-arrays.
			int[] sub = values[y];

			for (int x = 0; x < sub.length; x++) {
				System.out.print(sub[x] + " ");
			}

			System.out.println();
		}
	}
}