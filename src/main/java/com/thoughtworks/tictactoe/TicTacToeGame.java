package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class TicTacToeGame {

    private PrintStream printStream;

    public TicTacToeGame(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void start() {

        for (int num = 1; num <= 9; num++)
            printStream.println(Integer.toString(num));
    }
}
