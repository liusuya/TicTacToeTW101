package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        TicTacToeGame tTTGame = new TicTacToeGame(printStream);
        tTTGame.start();
    }
}
