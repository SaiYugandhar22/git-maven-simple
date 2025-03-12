package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.MainApp;

public class MainAppTest {
	
	@Test
    public void testAddition() {
        MainApp mainApp = new MainApp();
        int result = mainApp.addition(8, 6);
        assertEquals(14, result);
    }
	
	@Test
    public void testAdditionNegativeNumbers() {
        MainApp mainApp = new MainApp();
        int result = mainApp.addition(-8, -6);
        assertEquals(-14, result);
    }

    @Test
    public void testAdditionZero() {
        MainApp mainApp = new MainApp();
        int result = mainApp.addition(4, 9);
        assertEquals(13, result);
    }

    @Test
    public void testMultiply() {
        MainApp mainApp = new MainApp();
        int result = mainApp.multiply(4, 5);
        assertEquals(20, result);
    }

}
