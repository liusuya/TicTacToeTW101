package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class TicTacToeGameTest {

    private PrintStream printStream;
    private TicTacToeGame tTTGame;
    private BufferedReader reader;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        tTTGame = new TicTacToeGame(printStream, reader);
        reader = mock(BufferedReader.class);
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
    public void shouldPrintNewLineBetween3and4And6and7WhenGameStarts() {
        tTTGame.start();
        verify(printStream,atLeastOnce()).print(contains("\n"));
    }

    @Test
    public void shouldPrintDashesAfterNewlinesWhenGameStarts()  {
        tTTGame.start();
        verify(printStream,atLeastOnce()).print(contains("\n-"));
    }

    @Test
    public void shouldPrintNewlineAfterDashesWhenGameStarts() {
        tTTGame.start();
        verify(printStream,atLeastOnce()).print(contains("-\n"));
    }

    @Test
    public void shouldPrintPipeSymbolBTWAllNumbersNotSeparatedByDashes() {
        tTTGame.start();
        verify(printStream,atLeastOnce()).print(contains("|"));
    }

    @Test
    public void shouldNotPrintPipeSymbolAfter9WhenBoardIsDrawn() {
        tTTGame.start();
        verify(printStream,never()).print(contains("9|"));
    }

    @Test
    public void shouldPromptUserToEnterANumberToPlaceMark(){
        tTTGame.promptUser();
        verify(printStream).println("Please Enter A Number to Place Your Mark");
    }

    @Test
    public void shouldGetInputFromUserWhenPromptUserIsCalled() throws Exception {
        tTTGame.promptUser();
        verify(reader).readLine();

    }
}