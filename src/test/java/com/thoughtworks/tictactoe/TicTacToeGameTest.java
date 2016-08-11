package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TicTacToeGameTest {

    private PrintStream printStream;
    private TicTacToeGame tTTGame;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        tTTGame = new TicTacToeGame(printStream);
    }

    @Test
    public void shouldPrintANumberWhenGameStarts() {
        tTTGame.start();
        verify(printStream).println(contains("1"));
    }

    @Test
    public void shouldPrintAnotherNumberBetween1and9WhenGameStarts() {

    }
}