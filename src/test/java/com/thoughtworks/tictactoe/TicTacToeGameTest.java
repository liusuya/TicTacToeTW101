package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class TicTacToeGameTest {

    @Test
    public void shouldPrintBoardWhenGameStarts(){
        PrintStream printStream = mock(PrintStream.class);
        BufferedReader reader = mock(BufferedReader.class);
        TicTacToeGame tTTGame = new TicTacToeGame(printStream, reader);
        tTTGame.start();
        verify(printStream).println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9\n");
    }
}