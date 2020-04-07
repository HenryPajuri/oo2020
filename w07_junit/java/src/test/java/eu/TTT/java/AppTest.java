package eu.TTT.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple Tic Tac Toe App.
 */
public class AppTest {

    private static App app;
    private static String name;

    /**
     * Rigorous Test :-)
     */

    @Before
    public void initiateApp() {
        name = "App";
        app = new App(name);
        App.column = 3;
        App.row = 3;
        // app.Play();
    }

    @Test
    public void appHasCorrectName() {
        assertTrue("App name is App", app.getName() == name);
    }

    @Test
    public void getMaxValueofBoard() {
        assertEquals("Get max value of board lenght", 3, app.maxValue(App.row, App.column));
    }


    @Test

    public void turnVariableHasValue(){
        assertNotNull(App.turn);
    }
    @Test
    public void BoardlenghtEqualsWidth() {
        assertEquals("The board is as long as it is wide", App.row, App.column);
    }

    @Test
    public void BoardRowLenghtIs3() {
        assertEquals(3, App.column);
    }

}
