package com.maruthi.project;

import java.util.Scanner;

class CricketPlayer {
    int playerId;
    String playerName;
    int matches;
    int runs;

    // Constructor
    CricketPlayer(int playerId, String playerName, int matches, int runs) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.matches = matches;
        this.runs = runs;
    }

    // Display player details
    void displayPlayer() {
        System.out.println("Player ID: " + playerId);
        System.out.println("Player Name: " + playerName);
        System.out.println("Matches: " + matches);
        System.out.println("Runs: " + runs);
        System.out.println("Batting Average: " + getAverage());
        System.out.println("------------------------");
    }

    // Calculate average
    double getAverage() {
        if (matches == 0)
            return 0;
        return (double) runs / matches;
    }
}

public class CricketManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CricketPlayer[] players = new CricketPlayer[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== CRICKET PLAYER MANAGEMENT =====");
            System.out.println("1. Add Player");
            System.out.println("2. Display Players");
            System.out.println("3. Search Player");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Player ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Player Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Matches Played: ");
                    int matches = sc.nextInt();

                    System.out.print("Enter Total Runs: ");
                    int runs = sc.nextInt();

                    players[count] = new CricketPlayer(id, name, matches, runs);
                    count++;

                    System.out.println("Player Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Players Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            players[i].displayPlayer();
                        }
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Player Name to Search: ");
                    String searchName = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (players[i].playerName.equalsIgnoreCase(searchName)) {
                            players[i].displayPlayer();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Player Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}