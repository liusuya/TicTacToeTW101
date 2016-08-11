package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class TicTacToeGame {

    private PrintStream printStream;
    private final BufferedReader reader;

    public TicTacToeGame(PrintStream printStream, BufferedReader reader) {
        this.printStream = printStream;
        this.reader = reader;
    }


    public void start() {
        printStream.println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9\n");

    }

    public void promptUser() {
        String input;
        printStream.println("Please Enter A Number to Place Your Mark");
        try {
            input = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeIOException(e);
        }
    }
}
