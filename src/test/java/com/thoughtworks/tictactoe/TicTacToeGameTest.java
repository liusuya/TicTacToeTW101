package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class TicTacToeGameTest {

    private PrintStream printStream;
    private BufferedReader reader;
    private TicTacToeGame tTTGame;
    private List<String> cells;
    private Player player1;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        cells = Arrays.asList("1","2","3","4","5","6","7","8","9");
        player1 = mock(Player.class);
        tTTGame = new TicTacToeGame(printStream, reader, cells, player1, player1);
    }

    @Test
    public void shouldPrintNumbersOnBoardWhenGameStarts() throws IOException{
        when(reader.readLine()).thenReturn("1");
        tTTGame.start();
        verify(printStream).println(contains(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9\n"));
    }

    @Test
    public void shouldBeAbleToChangeTheBoardWhenAStateChanges(){
        cells = Arrays.asList("a","b","c","d","e","f","g","h","i");
        tTTGame = new TicTacToeGame(printStream, reader, cells, player1, player1);
        tTTGame.drawBoard();
        verify(printStream).println(
                "a|b|c\n" +
                "-----\n" +
                "d|e|f\n" +
                "-----\n" +
                "g|h|i\n");

    }

    @Test
    public void shouldGetInputFromUserWhenPromptUserCalled() throws Exception {
        when(reader.readLine()).thenReturn("1");
        tTTGame.promptUser();
        verify(reader).readLine();
    }

    @Test
    public void shouldMarkXInFirstSpot() {
        when(player1.getSymbol()).thenReturn("X");
        tTTGame.mark("1", player1);
        assertThat(cells.get(0), is("X"));
    }

    @Test
    public void shouldMarkXInAnyIndicatedSpot()  {
        when(player1.getSymbol()).thenReturn("X");

        tTTGame.mark("5", player1);
        assertThat(cells.get(4), is("X"));

    }

    @Test
    public void shouldMarkOInAnyIndicatedSpot(){
        when(player1.getSymbol()).thenReturn("O");
        tTTGame.mark("1", player1);
        assertThat(cells.get(0), is("O"));

    }
}