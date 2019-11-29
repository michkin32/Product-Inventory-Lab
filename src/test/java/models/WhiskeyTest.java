package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiskeyTest {


    @Test
    void Constructor() {
       int expectedId = 3;
       String expectedName = "Bob";
       String expectedBrand = "Jack Daniels";
       float expectedSize = 40f;
       int expectedQuantity = 2;
       float expectedPrice = 70f;

       Whiskey whiskey = new Whiskey(expectedId, expectedName,expectedBrand,expectedSize,expectedQuantity,expectedPrice);

        Assertions.assertEquals(expectedId, whiskey.getId());
        Assertions.assertEquals(expectedName, whiskey.getName());
        Assertions.assertEquals(expectedBrand, whiskey.getBrand());
        Assertions.assertEquals(expectedSize, whiskey.getSize());
        Assertions.assertEquals(expectedQuantity, whiskey.getQuantity());
        Assertions.assertEquals(expectedPrice, whiskey.getPrice());
    }
    @Test
    void setId() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Jack Daniels";
        float expectedSize = 40f;
        int expectedQuantity = 2;
        float expectedPrice = 70f;

        Whiskey whiskey = new Whiskey(expectedId, expectedName,expectedBrand,expectedSize,expectedQuantity,expectedPrice);
        whiskey.setId(4);


        Assertions.assertEquals(4, whiskey.getId());

    }

    @Test
    void setName() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Jack Daniels";
        float expectedSize = 40f;
        int expectedQuantity = 2;
        float expectedPrice = 70f;

        Whiskey whiskey = new Whiskey(expectedId, expectedName,expectedBrand,expectedSize,expectedQuantity,expectedPrice);

        whiskey.setName("John");


        Assertions.assertEquals("John", whiskey.getName());


    }

    @Test
    void setBrand() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Jack Daniels";
        float expectedSize = 40f;
        int expectedQuantity = 2;
        float expectedPrice = 70f;

        Whiskey whiskey = new Whiskey(expectedId, expectedName,expectedBrand,expectedSize,expectedQuantity,expectedPrice);

        whiskey.setBrand("Jack Honey");

        Assertions.assertEquals("Jack Honey", whiskey.getBrand());

    }


    @Test
    void setSize() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Jack Daniels";
        float expectedSize = 40f;
        int expectedQuantity = 2;
        float expectedPrice = 70f;

        Whiskey whiskey = new Whiskey(expectedId, expectedName,expectedBrand,expectedSize,expectedQuantity,expectedPrice);

        whiskey.setSize(24f);

        Assertions.assertEquals(24f, whiskey.getSize());


    }

    @Test
    void setQuantity() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Jack Daniels";
        float expectedSize = 40f;
        int expectedQuantity = 2;
        float expectedPrice = 70f;

        Whiskey whiskey = new Whiskey(expectedId, expectedName,expectedBrand,expectedSize,expectedQuantity,expectedPrice);

        whiskey.setQuantity(3);

        Assertions.assertEquals(3, whiskey.getQuantity());


    }

    @Test
    void setPrice() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Jack Daniels";
        float expectedSize = 40f;
        int expectedQuantity = 2;
        float expectedPrice = 70f;

        Whiskey whiskey = new Whiskey(expectedId, expectedName,expectedBrand,expectedSize,expectedQuantity,expectedPrice);

        whiskey.setPrice(34f);

        Assertions.assertEquals(34f, whiskey.getPrice());

    }
}