package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class TicTacToeGame {

    private PrintStream printStream;
    private  BufferedReader reader;
    private List<String> cells;
    private Player player1;
    private Player player2;
    private Boolean isPlayer1 = true;

    public TicTacToeGame(PrintStream printStream, BufferedReader reader, List<String> cells, Player player1, Player player2) {
        this.printStream = printStream;
        this.reader = reader;
        this.cells = cells;
        this.player1 = player1;
        this.player2 = player2;
    }


    public void start() {
        drawBoard();
        promptUser();
        drawBoard();

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
            mark(input, currentPlayer());
        } catch (IOException e) {
            throw new RuntimeIOException(e);
        }
    }

    private Player currentPlayer() {
        if (isPlayer1) {
            return player1;
        }else {
            isPlayer1 = (!isPlayer1);
            return player2;
        }
    }

    public void mark(String input, Player player) {
        int cellIndex = Integer.parseInt(input) - 1;
        cells.set(cellIndex, player.getSymbol());


    }
}
