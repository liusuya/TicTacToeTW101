package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> cells = new ArrayList<String>() ;
        TicTacToeGame tTTGame = new TicTacToeGame(printStream, reader, cells);
        tTTGame.start();
    }
}
