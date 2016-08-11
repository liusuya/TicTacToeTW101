package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class TicTacToeGame {

    private PrintStream printStream;
    private  BufferedReader reader;
    private List<String> cells;

    public TicTacToeGame(PrintStream printStream, BufferedReader reader, List<String> cells) {
        this.printStream = printStream;
        this.reader = reader;
        this.cells = cells;
    }


    public void start() {
        drawBoard();
        promptUser();

    }

    public void drawBoard() {

        String board = String.format("%s|%s|%s\n" +
                        "-----\n" +
                        "%s|%s|%s\n" +
                        "-----\n" +
                        "%s|%s|%s\n", cells.toArray());

        printStream.println(board);
    }

    public void promptUser() {
        String input;
        printStream.println("Please Enter A Number to Place Your mark");
        try {
            input = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeIOException(e);
        }
    }

    public void mark(String input) {
        int cellIndex = Integer.parseInt(input) - 1;
        cells.set(cellIndex, "X");


    }
}
