package com.mustafaergan.test.examplecommand;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author : MustafaERGAN
 * Date: 30.10.2018 11:46
 */
public class TestCommand {

    @Test
    public static void sumFail() {
        fail();
    }

    @Test
    public static void sumAssertTruePass() {
        int a = 5;
        int b = 6;
        assertTrue((a+b) == 11);
    }

    @Test
    public static void sumAssertTrueFail() {
        int a = 5;
        int b = 8;
        assertTrue((a+b) == 11);
    }

    @Test
    public static void sumAssertsEquals() {
        int a = 5;
        int b = 5;
        assertSame("A ve B Aynı", a,b);
    }

//    @Test
//    public static void sumAssertsEquals() {
//        int a = 5;
//        int b = 5;
//    }




}
