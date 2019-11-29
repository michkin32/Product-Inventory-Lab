package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerTest {
    @Test
    void Constructor() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Nike";
        String expectedSport = "Football";
        float expectedSize = 13f;
        int expectedQuantity = 1;
        float expectedPrice = 70f;

        Sneaker sneaker = new Sneaker(expectedId, expectedName,expectedBrand, expectedSport,expectedSize,expectedQuantity,expectedPrice);

        Assertions.assertEquals(expectedId, sneaker.getId());
        Assertions.assertEquals(expectedName, sneaker.getName());
        Assertions.assertEquals(expectedBrand, sneaker.getBrand());
        Assertions.assertEquals(expectedSize, sneaker.getSize());
        Assertions.assertEquals(expectedQuantity, sneaker.getQuantity());
        Assertions.assertEquals(expectedPrice, sneaker.getPrice());
    }
    @Test
    void setId() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Nike";
        String expectedSport = "Football";
        float expectedSize = 13f;
        int expectedQuantity = 1;
        float expectedPrice = 70f;

        Sneaker sneaker = new Sneaker(expectedId, expectedName,expectedBrand, expectedSport,expectedSize,expectedQuantity,expectedPrice);
        sneaker.setId(4);
        Assertions.assertEquals(4, sneaker.getId());


    }

    @Test
    void setName() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Nike";
        String expectedSport = "Football";
        float expectedSize = 13f;
        int expectedQuantity = 1;
        float expectedPrice = 70f;

        Sneaker sneaker = new Sneaker(expectedId, expectedName,expectedBrand, expectedSport,expectedSize,expectedQuantity,expectedPrice);
        sneaker.setName("Joe");


        Assertions.assertEquals("Joe", sneaker.getName());


    }

    @Test
    void setBrand() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Nike";
        String expectedSport = "Football";
        float expectedSize = 13f;
        int expectedQuantity = 1;
        float expectedPrice = 70f;

        Sneaker sneaker = new Sneaker(expectedId, expectedName,expectedBrand, expectedSport,expectedSize,expectedQuantity,expectedPrice);
        sneaker.setBrand("Adidas");

        Assertions.assertEquals("Adidas", sneaker.getBrand());

    }


    @Test
    void setSize() {

        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Nike";
        String expectedSport = "Football";
        float expectedSize = 13f;
        int expectedQuantity = 1;
        float expectedPrice = 70f;

        Sneaker sneaker = new Sneaker(expectedId, expectedName,expectedBrand, expectedSport,expectedSize,expectedQuantity,expectedPrice);
        sneaker.setSize(14f);

        Assertions.assertEquals(14f, sneaker.getSize());


    }

    @Test
    void setQuantity() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Nike";
        String expectedSport = "Football";
        float expectedSize = 13f;
        int expectedQuantity = 1;
        float expectedPrice = 70f;

        Sneaker sneaker = new Sneaker(expectedId, expectedName,expectedBrand, expectedSport,expectedSize,expectedQuantity,expectedPrice);
        sneaker.setQuantity(2);

        Assertions.assertEquals(2, sneaker.getQuantity());


    }

    @Test
    void setPrice() {
        int expectedId = 3;
        String expectedName = "Bob";
        String expectedBrand = "Nike";
        String expectedSport = "Football";
        float expectedSize = 13f;
        int expectedQuantity = 1;
        float expectedPrice = 70f;

        Sneaker sneaker = new Sneaker(expectedId, expectedName,expectedBrand, expectedSport,expectedSize,expectedQuantity,expectedPrice);
        sneaker.setPrice(24f);

        Assertions.assertEquals(24f, sneaker.getPrice());

    }

}