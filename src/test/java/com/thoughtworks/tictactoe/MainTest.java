package com.thoughtworks.tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainTest {

    @Test
    public void shouldPrintANumberWhenGameStarts() {
        TicTacToeGame tTTGame = new TicTacToeGame();
        tTTGame.start();
        PrintStream printStream = mock(PrintStream.class);
        verify(printStream).println(contains("1"));
    }

}