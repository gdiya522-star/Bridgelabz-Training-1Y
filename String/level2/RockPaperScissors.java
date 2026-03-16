package com.gla.String.level2;

import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);

        if(choice == 0)
            return "Rock";
        else if(choice == 1)
            return "Paper";
        else
            return "Scissors";
    }
    public static String findWinner(String user, String computer) {

        if(user.equalsIgnoreCase(computer))
            return "Draw";

        if(user.equalsIgnoreCase("Rock") && computer.equals("Scissors") ||
                user.equalsIgnoreCase("Paper") && computer.equals("Rock") ||
                user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))
            return "Player";
        else
            return "Computer";
    }
    public static String[][] statistics(int playerWins, int computerWins, int totalGames) {

        String[][] stats = new String[3][3];

        double playerPercent = (playerWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", playerPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerPercent);

        stats[2][0] = "Total Games";
        stats[2][1] = String.valueOf(totalGames);
        stats[2][2] = "100%";

        return stats;
    }
    public static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\tComputer\tWinner");

        for(int i=0;i<gameResults.length;i++){
            System.out.println((i+1) + "\t" + gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("Player\tWins\tPercentage");

        for(int i=0;i<stats.length;i++){
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] gameResults = new String[games][3];

        int playerWins = 0;
        int computerWins = 0;

        for(int i=0;i<games;i++){

            System.out.print("Enter choice (Rock/Paper/Scissors): ");
            String user = sc.nextLine();

            String computer = computerChoice();

            String winner = findWinner(user, computer);

            if(winner.equals("Player"))
                playerWins++;
            else if(winner.equals("Computer"))
                computerWins++;

            gameResults[i][0] = user;
            gameResults[i][1] = computer;
            gameResults[i][2] = winner;
        }

        String[][] stats = statistics(playerWins, computerWins, games);

        displayResults(gameResults, stats);

        sc.close();
    }
}
