package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;


public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    
    Dog dog;
    @Before

    public void initialize(){

        dog = new Dog ("Scooby", new Date(), 420);

    }
    
    
    

    @Test

    public void setNameTest(){

        String expectedName = "Godard";

        dog.setName(expectedName);
        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);

    }

    @Test 

    public void setBirthDateTest(){

        Date expectedDate = new Date();

        Date actualDate = dog.getBirthDate();

        Assert.assertEquals(expectedDate, actualDate);

    }

    @Test
    public void testSpeak(){

        String expected = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testEatFood(){

        Food pizza = new Food();

        dog.eat(pizza);
        int actualValue = dog.getNumberOfMealsEaten();

        Assert.assertEquals(1, actualValue);

    }

    @Test

    public void getIdTest(){

        int expectedId = 420;
        int actualId = dog.getId();

        Assert.assertEquals(expectedId, actualId);
    }

    @Test 

    public void instanceTest(){

        boolean expected = true;

        boolean actual = dog instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }

    @Test
    
    public void instanceTest2(){

        boolean expected = true;

        boolean actual = dog instanceof Animal;

        Assert.assertEquals(expected, actual);
    }



}
