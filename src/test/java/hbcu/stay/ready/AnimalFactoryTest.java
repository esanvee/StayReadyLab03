package hbcu.stay.ready;

import java.util.Date;

import org.junit.Test;
import org.junit.Assert;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test

    public void makeDogTest(){
        Dog dog = AnimalFactory.createDog("Jim", new Date());

        String expectedName = "Jim";
        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);

    }

    @Test

    public void makeCatTest(){
        Cat cat = AnimalFactory.createCat("Helen", new Date());

        String expectedName = "Helen";
        String actualName = cat.getName();

        Assert.assertEquals(expectedName, actualName);

    }
}
