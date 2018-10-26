package com.mustafaergan.test.example1;

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
public class TestAnnotation2 {

    //Nesne oluşmadan önce çalışır.
    //Spring nesneleri oluşmadan çalışır
    //Tüm testlerin calisması sırasında yalnızca bir kere calisir
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class");
    }

    //Nesneler ve spring çalıştıktan sonra çalışır.
    //Her Test islemi oncesi calisir
    @Before
    public void setUp() throws Exception {
        System.out.println("Setup");
    }

    @Test
    public void test1() throws Exception {
        System.out.println("Test 1");
    }

    @Test
    public void test2() throws Exception {
        System.out.println("Test 2");
    }

    //Test isleminin gerçekleştikten sonra çalışır.
    //Her test islemi sonrası çalışır
    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    //Test işlemi bittikten sonra çalışır
    //Tüm testler bittikten sonra calisir.
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After Class");
    }


}
