/*
Scott Cromling
COMP167
MP1
 */

import java.util.Scanner;


public class RosterGenerator {

    public static void main(String args[]) {
        int[] jerseyNumber = new int[5];
        int[] rating = new int[5];

        int temp;
        int i;
        char menuChar = 'b';

        Scanner read = new Scanner(System.in);

        for (i = 1; i <= 5; i++) {
            System.out.print("\nEnter player " + i + "'s jersey number: ");
            temp = read.nextInt();

            jerseyNumber[i - 1] = temp;
            System.out.print("Enter player " + i + "'s rating: ");

            temp = read.nextInt();
            rating[i - 1] = temp;
        }

        while (menuChar != 'q') {

            System.out.println("MENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            System.out.println("");
            System.out.println("Choose an option:");

            menuChar = read.next().charAt(0);


            switch (menuChar) {

                case 'o':

                    if (menuChar == 'o') {

                        System.out.println("ROSTER");

                        for (i = 0; i < 5; ++i) {
                            System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNumber[i] + ", Rating: " + rating[i]);
                        }
                    }

                    break;
            }
        }
    }
}
