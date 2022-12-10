package uc3displayboard;

import java.util.Scanner;

public class TicTacToe {
    static char[] board = new char[10];
    static char player, computer;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Initialize the object
        TicTacToe obj = new TicTacToe();

        //Initialize board
        obj.initialize();

        //Checking for player choice
        chooseOption();

        //Showing board
        showBoard();

    }

    //Initialization of game
    public void initialize()
    {
        for (int i = 1; i < 10; i++)
        {
            board[i] = ' ';
        }
    }

    //Allow player to choose X or O
    public static void chooseOption()
    {
        System.out.println("Please Select Your Choice Letter : \nProvide 'X' or 'O'");
        char choice = scan.next().charAt(0);
        if (choice == 'X' || choice == 'x')
        {
            player = 'X';
            computer = 'O';
        }
        else if (choice == 'O' || choice == 'o')
        {
            player = 'O';
            computer = 'X';
        }
        System.out.println("Player choosing option : "+player);
    }

    //To see board
    public static void showBoard()
    {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);

    }
}
