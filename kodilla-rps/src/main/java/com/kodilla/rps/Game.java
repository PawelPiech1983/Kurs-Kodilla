package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    String separateLine = "----------------------------------------------";
    String name = "";
    Integer wins;

    public void StartGame() {
        if(name.isEmpty()) {
            System.out.println(separateLine);
            System.out.println("Welcome in RPS game!");
            System.out.println(separateLine);
            name = GetName();
        }
        System.out.println("Hello " + name + ", \n pleas enter number of required wins (minimal 1, maximal 5)");
        wins = GetnumberOfWins();
        GameRules();
        RpsGame();
    }

    public String GetName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name: ");
        name = scanner.nextLine();
        while (name.isEmpty()) {
            System.out.println(separateLine);
            System.out.println("Please enter correct Name. ");
            System.out.println(separateLine);
            scanner = new Scanner(System.in);
            name = scanner.nextLine();
        }
        return name;
    }


    public Integer GetnumberOfWins() {
        Scanner scannerWins = new Scanner(System.in);
        wins = scannerWins.nextInt();
        while (wins > 5 || wins <= 0 || !(wins instanceof Integer)) {
            System.out.println(separateLine);
            System.out.println("Please enter correct Number of wins (minimal 1, maximal 5). ");
            System.out.println(separateLine);
            scannerWins = new Scanner(System.in);
            wins = scannerWins.nextInt();
        }
        System.out.println("Selected number: " + wins);
        return wins;
    }

    public void GameRules() {
        System.out.println(separateLine);
        System.out.println(separateLine);
        System.out.println("Game rules:");
        System.out.println("To win you must beat computer " + wins + " times! \n" +
                "Press 1 for paper \n" +
                "press 2 for rock \n" +
                "press 3 for scissors \n" +
                "press n for new game \n" +
                "press r for rules \n" +
                "press q for quit.");
    }

    public void RpsGame() {
        boolean end = false;
        int userWins = 0;
        int computerWins = 0;
        int round = 0;
        String NextStep;
        while(!end) {
            System.out.println(separateLine);
            if(round > 0) {
                System.out.println("Status: Round: " + round + "\n" +
                        name + " wins " + userWins + " round(s) \n" +
                        "Computer wins " + computerWins + " round(s)");
            }


            if(userWins != wins && computerWins != wins) {
                Scanner scannerNextStep = new Scanner(System.in);
                NextStep = scannerNextStep.nextLine();
                if(NextStep.equals("1") || NextStep.equals("2") || NextStep.equals("3")) {
                    int battle = Battle(Integer.parseInt(NextStep));
                    if(battle == 0) {
                        userWins++;
                        round++;

                    }
                    else if(battle == 1) {
                        computerWins++;
                        round++;
                    }
                    else if(battle == 2) {
                        System.out.println("Draw round.");
                    }

                }
                else if(NextStep.equals("q")) {
                    System.out.println(separateLine);
                    System.out.println("Do you realy " + name + " want to quit? y/n");
                    Scanner scannerQuit = new Scanner(System.in);
                    String quit = scannerQuit.nextLine();
                    if(quit.equals("y")) {
                        end = true;
                    }
                    else if(quit.equals("n")) {
                        GameRules();
                    }
                    else {
                        System.out.println("Bad Input");
                        GameRules();
                    }
                }
                else if(NextStep.equals("r")) {
                    GameRules();
                }
                else if(NextStep.equals("n")) {
                    System.out.println("Do you realy " + name + " want to start new game? y/n");
                    Scanner scannerNewGame = new Scanner(System.in);
                    String newGameStart = scannerNewGame.nextLine();
                    if(newGameStart.equals("y")) {
                        StartGame();
                        end = true;
                    }
                    else if(newGameStart.equals("n")) {
                        GameRules();
                    }
                    else {
                        System.out.println("Bad Input");
                        GameRules();
                    }
                }
                else {
                    System.out.println("Bad Input");
                    GameRules();
                }


            }
            else {
                EndOfGame(userWins, computerWins);
                end = true;
            }



        }
    }

    public int Battle(int userMovement) {
            Random computerRandom = new Random();
            int computerMovement = computerRandom.ints(1, 1, 4).findFirst().getAsInt();
            System.out.println("Computer movement: " + computerMovement + "\n" +
                name + " movement: " + userMovement);
            if(userMovement == computerMovement) {
                return 2;
            }
            else if((userMovement == 1 && computerMovement == 2) || (userMovement == 2 && computerMovement == 3) || (userMovement == 3 && computerMovement == 1)) {
                return 0;
            }
            else {
                return 1;
            }
    }
    public void EndOfGame(int userWins, int computerWins) {
        if(userWins != 0 || computerWins != 0) {
            if(userWins > computerWins) {
                System.out.println(separateLine);
                System.out.println("CONGRATULATIONS! You have won with computer " + userWins + " to " + computerWins + " round(s)");
                System.out.println(separateLine);
            }
            else {
                System.out.println(separateLine);
                System.out.println("You have lost with computer " + userWins + " to " + computerWins + " round(s)");
                System.out.println(separateLine);
            }
        }
        System.out.println("press n for new game \n" +
                "press q for quit.");
        Scanner scannerOnEnd = new Scanner(System.in);
        String EndOrNewGame = scannerOnEnd.nextLine();
        if(EndOrNewGame.equals("n")) {
            StartGame();
        }
        else if(EndOrNewGame.equals("q")) {
            System.out.println("Thank you for playing. Till next time!");
        }
        else {
            System.out.println("Bad Input");
            EndOfGame(0, 0);
        }
    }
}
