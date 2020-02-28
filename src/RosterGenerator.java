/*Scott Cromling
COMP167
MP1
 */

import java.util.*;

public class RosterGenerator {

    public static void main(String[] args) {

        int count = 5; //count variable for number of players
        int i = 1;
        int jerseyNumber[] = new int[100]; //array of all possible jersey numbers
        for (int j = 0; j < jerseyNumber.length; j++) {
            jerseyNumber[j] = 0;
        }

        Player[] arr = new Player[5]; //array of player objects

        Scanner read = new Scanner(System.in);

        //while loop to read in user data for players using scanners
        while (count > 0) {
            System.out.println("Enter Player " + i + "'s jersey number:");
            int n = read.nextInt();
            System.out.println("Enter Player " + i + "'s rating number");
            int rn = read.nextInt();

            //if-else statement to check if a jersey is already taken
            if (jerseyNumber[n] == 0) {
                Player p1 = new Player(n, rn);
                arr[i - 1] = p1;
                jerseyNumber[n] = jerseyNumber[n] + 1;
                i++;
                count--;
            } else {
                System.out.println("This Jersey Number already taken. Please try another");
            }

        }
        //the while(true) displays the menu after entering the data and after calling a method
        while (true) {

            System.out.println("MENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            read.hasNextLine();

            String response = read.nextLine();

            //if the user enters q exit the program
            if (response.equals("q")) {
                break;
            }
            //if the user enters u go to the update player method
            else if (response.equals("u")) {
                updatePlayer(arr);
            }
            //if the user enters a go to the output above rating method
            else if (response.equals("a")) {
                outputPlayerAboveRating(arr);
            }
            //if the user enters r go to the replace player method
            else if (response.equals("r")) {
                replacePlayer(arr);
            }
            //if the user enters o go to the output player method
            else if (response.equals("o")) {
                outputRoster(arr);
            }
        }
    }

    //The outputPlayerAboveRating method takes in user input for a minimum rating and outputs all
    //players above the rating
    private static void outputPlayerAboveRating(Player[] arr) {

        //scanner to ask user for minimum rating
        System.out.println("Enter a rating");
        Scanner read = new Scanner(System.in);
        int rating = read.nextInt();
        System.out.println("ABOVE" + rating);

        //for loop to iterate through the array and output elements above the rating
        for (int i = 0; i < 5; i++) {
            if (arr[i].getPlayerRanking() > rating) {
                System.out.println(arr[i]);
            }
        }
    }

    //the replacePlayer method takes user input of an existing jersey number and replaces the element
    //in the array with a new player
    private static void replacePlayer(Player[] arr) {

        //scanner for user input
        System.out.println("Enter a Jersey Number");
        Scanner read = new Scanner(System.in);
        int jerseyNumber = read.nextInt();

        //for loop to scan through the array and find the player to replace
        for (int i = 0; i < 5; i++) {
            if (arr[i].getPlayerJerseyNumber() == jerseyNumber) {
                System.out.println("Enter Player new jersey Number");
                int jn = read.nextInt();
                System.out.println("Enter Player new rating Number");
                int rating = read.nextInt();
                //nested if statements check if user input is within the correct bounds
                if (rating > 0 && rating < 10) {
                    if (jn > 0 && jn < 100) {
                        arr[i].setPlayerRanking(rating);
                        arr[i].setPlayerJerseyNumber(jn);
                    }
                    //if the user inputs an invalid number, tell them they did so
                    else {
                        System.out.println("Enter an appropriate jersey number or rating");
                        break;
                    }
                }
            }
        }
    }
        //The updatePlayer method takes in user input for a jersey number and changes the associated rating
        private static void updatePlayer (Player[]arr){

            System.out.println("Enter a Jersey Number");
            Scanner read = new Scanner(System.in);
            int jerseyNumber = read.nextInt();

            //iterate through the array and find the given jersey number and change the rating
            for (int i = 0; i < 5; i++) {
                if (arr[i].getPlayerJerseyNumber() == jerseyNumber) {
                    System.out.println("Enter Player new rating Number");
                    int rating = read.nextInt();
                    arr[i].setPlayerRanking(rating);


                }
            }

        }

        //The outputRoster method simply prints the elements of the array of players
        private static void outputRoster (Player[]arr){

        //iterate through the array and print teach element on a new line
            for (int i = 0; i < 5; i++) {
                System.out.println(arr[i]);
            }
        }
    }

