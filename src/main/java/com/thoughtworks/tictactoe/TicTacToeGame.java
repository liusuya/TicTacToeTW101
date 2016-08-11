package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class TicTacToeGame {

    private PrintStream printStream;

    public TicTacToeGame(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void start() {

        for (int num = 1; num <= 9; num++) {
            printStream.print(Integer.toString(num));
            if (num == 3 || num == 6)
                printStream.print("\n-----\n");
            else
                printStream.print("|");
        }
    }
}
