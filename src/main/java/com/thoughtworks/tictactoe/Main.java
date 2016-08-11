package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> cells = new ArrayList<String>() ;
        cells = Arrays.asList("1","2","3","4","5","6","7","8","9");
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        TicTacToeGame tTTGame = new TicTacToeGame(printStream, reader, cells, player1, player2);
        tTTGame.start();
    }
}
