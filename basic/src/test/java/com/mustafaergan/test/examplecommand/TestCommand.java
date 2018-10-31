package com.mustafaergan.test.examplecommand;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;

/**
 * @author : MustafaERGAN
 * Date: 30.10.2018 11:46
 */
public class TestCommand {

    @Test
    public void testFail() {
        fail();
    }

    @Test
    public void testAssertTruePass() {
        int a = 5;
        int b = 6;
        assertTrue((a+b) == 11);
    }

    @Test
    public void testAssertTrueFail() {
        int a = 5;
        int b = 8;
        assertTrue((a+b) == 11);
    }

    @Test
    public void testAssertsSame() {
        int a = 5;
        int b = 5;
        assertSame("A ve B Aynı", a,b);
    }

    @Test
    public void testAssertThat() {
        int a = 5;
        int b = 5;
        assertThat(a, is(b));
    }

    @Test
    public void testAssertThatWithMessageTrue() {
        int a = 5;
        int b = 5;
        assertThat("A ve B Eşit Değildir", a, is(b));
        //Aşağıdakilerde aynı işlemi yapmaktadır.
        assertThat(a, equalTo(b));
        assertThat(a, is(equalTo(b)));
    }

    @Test
    public void testAssertThatWithMessageFalse() {
        int a = 5;
        int b = 6;
        assertThat("A ve B Eşit Değildir", a, is(b));
    }


    @Test
    public void testEquals() {
        int a = 5;
        int b = 5;
        assertEquals(a,b);
        assertThat(a, is(equalTo(b)));
    }

    @Test
    public void testNotEquals() {
        int a = 5;
        int b = 6;
        assertNotEquals(a, b);
        assertThat(a, is(not(equalTo(b))));
    }

    //anyOf şartlardan birisnin olması yeterli durumundadır (OR)
    @Test
    public void anyOfTest1() {
        assertThat("Mustafa", anyOf(is("Mustafa"), containsString("ERGAN")));
    }

    @Test
    public void anyOfTest2() {
        assertThat("Mustafa", anyOf(is("Mus"), containsString("ERGAN")));
    }

    @Test
    public void anyOfTest3() {
        assertThat("Mustafa", anyOf(is("Mus"), containsString("ta")));
    }

    @Test
    public void anyOfTest4() {
        assertThat("Mustafa", anyOf(is("Mustafa"), containsString("fa")));
    }

    //şartlarınun hepsinin olması gerekli (AND)
    @Test
    public void allOfTest1() {
        assertThat("Mustafa", allOf(is("Mustafa"), containsString("fa")));
    }


    @Test
    public void allOfTest2() {
        assertThat("Mustafa", allOf(is("Mustafa"), containsString("Ergan")));
    }

    @Test
    public void allOfTest3() {
        assertThat("Mustafa", allOf(is("Mus"), containsString("fa")));
    }

    //Nesne türünü kontrol eder
    @Test
    public void instanceOfTest1() {
        assertThat(Long.valueOf(1), instanceOf(Long.class));
    }

    @Test
    public void instanceOfTest2() {
        assertThat(Long.valueOf(1), instanceOf(Integer.class));
    }

    //Listenin büyüklüğünü test eder
    @Test
    public void hasSizeTest1() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasSize(3));
    }

    @Test
    public void hasSizeTest2() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasSize(2));
    }
    //contains listenin sıraması ile birlikte kontrol eder
    //containsInAnyOrder sırama önemsiz liste öğelerini kontrol eder
    //everyItem üzerinde bir işlem yapıldığında onu kontrol eder
    @Test
    public void listTest1() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasSize(3));
        assertThat(list, contains(5, 2, 4));
        assertThat(list, containsInAnyOrder(2, 4, 5));
        assertThat(list, everyItem(greaterThan(1)));
    }

    @Test
    public void listTestFalse2() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasSize(3));
        assertThat(list, contains(5, 4, 2));
        assertThat(list, containsInAnyOrder(2, 4, 5));
        assertThat(list, everyItem(greaterThan(1)));
    }

    @Test
    public void listTestFalse3() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasSize(3));
        assertThat(list, contains(5, 2, 4));
        assertThat(list, containsInAnyOrder(2, 4));
        assertThat(list, everyItem(greaterThan(1)));
    }



    @Test
    public void arrayHasSizeOf() {
        Integer[] ints = new Integer[] { 7, 5, 12, 16 };
        assertThat(ints, arrayWithSize(4));
        assertThat(ints, arrayContaining(7, 5, 12, 16));
    }

    @Test
    public void isStringEmpty() {
        String stringToTest = "";
        assertThat(stringToTest, isEmptyString());
    }

    @Test
    public void isStringEmptyOfNull() {
        String stringToTest = "";
        assertThat(stringToTest, isEmptyOrNullString());
    }



}
