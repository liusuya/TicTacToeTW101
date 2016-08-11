package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
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
        verify(printStream).print(contains("1"));
    }

    @Test
    public void shouldPrintAnotherNumberBetween1and9WhenGameStarts() {
        tTTGame.start();
        verify(printStream).print(contains("9"));
    }

    @Test
    public void shouldPrintANumberBTW1and9whenGameStarts(){
        tTTGame.start();
        verify(printStream).print(contains("5"));
    }

    @Test
    public void shouldPrintNewLineBetween3and4And6and7WhenGameStartsForGameBoard() {
        tTTGame.start();
        verify(printStream,times(2)).print(contains("\n"));
    }

    @Test
    public void shouldPrintDashesAfterNewlinesWhenBoardIsCreated() throws Exception {
        tTTGame.start();
        verify(printStream,times(2)).print(contains("\n-"));
    }
}