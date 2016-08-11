package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class TicTacToeGameTest {

    private PrintStream printStream;
    private BufferedReader reader;
    private TicTacToeGame tTTGame;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        tTTGame = new TicTacToeGame(printStream, reader);
    }

    @Test
    public void shouldPrintNumbersOnBoardWhenGameStarts(){
        tTTGame.start();
        verify(printStream).println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9\n");
    }

    @Test
    public void shouldGetInputFromUserWhenPromptUserCalled() throws Exception {
        tTTGame.promptUser();
        verify(reader).readLine();

    }
}