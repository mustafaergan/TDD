
Anatasyonlar:
```
+--------------+--------------------------------------------------------------------------------------------------------------------------------+
| @BeforeClass | Nesne oluşmadan önce çalışır.(Spring nesneleri oluşmadan çalışır). Tüm testlerin calisması sırasında yalnızca bir kere calisir |
+--------------+--------------------------------------------------------------------------------------------------------------------------------+
| @Before      | Nesneler ve spring oluştuktan sonra çalışır. Her Test işlemi öncesi çalışır                                                    |
+--------------+--------------------------------------------------------------------------------------------------------------------------------+
| @After       | Test isleminin gerçekleştikten sonra çalışır. Her test işlemi sonrası çalışır.                                                 |
+--------------+--------------------------------------------------------------------------------------------------------------------------------+
| @AfterClass  | Tüm testler bittikten sonra çalışır.                                                                                           |
+--------------+--------------------------------------------------------------------------------------------------------------------------------+
```


Komutlar:
```
| Kod:                                                | Tanım                                                                 |
|-----------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| fail(String)                                        | Kodun tamamın çalışmadığını kontrol eder.                                                                  |
| assertTrue(true)                                    | İşlemin true değer döndürdüğünü kontrol eder.                                                              |
| assertsEquals(message, expected, actual)            | expected ve actual değerlerinin aynı olduğunu kontrol eder. Değilse message’ı gösterir.                    |
| assertsEquals(message, expected, actual, tolerance) | expected ve actual değerlerinin belirli toleransta aynı olduğunu kontrol eder. Değilse message’ı gösterir. |
| assertNull(message, object)                         | Nesnenin null olduğunu kontrol eder.                                                                       |
| assertNotNull(message, object)                      | Nesnenin null olmadığını kontrol eder.                                                                     |
| assertSame(message, expected, actual)               | expected ve actual nesnelerinin aynı nesneler olduğunu kontrol eder.                                       |
| assertNotSame(message, expected, actual)            | expected ve actual nesnelerinin aynı nesneler olmadığını kontrol eder.                                     |
| assertTrue(message, boolean condition)              | condition’ın true olduğunu kontrol eder. Değilse message’ı gösterir.                                       |
```


