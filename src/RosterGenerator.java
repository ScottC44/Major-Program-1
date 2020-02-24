/*
Scott Cromling
COMP167
MP1
 */

import java.util.Scanner;


public class RosterGenerator {

    public static void main(String args[])
    {
        int[] jerseyNumber = new int[5];
        int[] rating = new int[5];

        int temp;
        int i;

        Scanner read = new Scanner(System.in);

        for(i = 1; i <= 5; i++)
        {
            System.out.print("\nEnter player " + i + "'s jersey number: ");
            temp = read.nextInt();

            jerseyNumber[i-1] = temp;
            System.out.print("Enter player " +i+"'s rating: ");

            temp = read.nextInt();
            rating[i-1] = temp;
        }
    }
}
