package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class TicTacToeGame {

    private PrintStream printStream;

    public TicTacToeGame(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void start() {
        printStream.println("1");
    }
}
