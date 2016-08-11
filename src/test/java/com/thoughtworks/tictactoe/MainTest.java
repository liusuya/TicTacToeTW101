package com.thoughtworks.tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainTest {

    @Test
    public void shouldPrintANumberWhenGameStarts() {
        PrintStream printStream = mock(PrintStream.class);
        TicTacToeGame tTTGame = new TicTacToeGame(printStream);
        tTTGame.start();
        verify(printStream).println(contains("1"));
    }

}