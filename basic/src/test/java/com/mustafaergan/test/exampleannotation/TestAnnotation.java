package com.mustafaergan.test.exampleannotation;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : MustafaERGAN
 * Date: 26.10.2018 15:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAnnotation {

    //Nesne oluşmadan önce çalışır.
    //Spring nesneleri oluşmadan çalışır
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("1.Before Class");
    }

    //Nesneler ve spring çalıştıktan sonra çalışır.
    @Before
    public void setUp() throws Exception {
        System.out.println("2.Setup");
    }

    @Test
    public void test() throws Exception {
        System.out.println("3.Test");
    }

    //Test isleminin gerçekleştikten sonra çalışır.
    @After
    public void tearDown() throws Exception {
        System.out.println("4.After");
    }

    //Test işlemi bittikten sonra çalışır
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("5.After Class");
    }


}
