package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    Cat cat;
    @Before

    public void initialize(){

        cat = new Cat ("Tom", new Date(), 101010);

    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    @Test

    public void setNameTest(){

        String expectedName = "Bobbina";

        cat.setName(expectedName);
        String actualName = cat.getName();

        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testSpeak(){

        String expected = "meow!";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test 

    public void setBirthDateTest(){

        Date expectedDate = new Date();

        Date actualDate = cat.getBirthDate();

        Assert.assertEquals(expectedDate, actualDate);

    }

    @Test

    public void testEatFood(){

        Food pizza = new Food();

        cat.eat(pizza);
        int actualValue = cat.getNumberOfMealsEaten();

        Assert.assertEquals(1, actualValue);

    }

    @Test

    public void getIdTest(){

        int expectedId = 101010;
        int actualId = cat.getId();

        Assert.assertEquals(101010, actualId);
    }

    @Test 

    public void instanceTest(){

        boolean expected = true;

        boolean actual = cat instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }



    @Test
    
    public void instanceTest2(){

        boolean expected = true;

        boolean actual = cat instanceof Animal;

        Assert.assertEquals(expected, actual);
    }
}
