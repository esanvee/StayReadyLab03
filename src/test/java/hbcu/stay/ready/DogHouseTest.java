package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test

    public void addDogTest(){

        Dog dog1 = new Dog("Scooby", new Date(), 12345);
        
        DogHouse.add(dog1);
        int expectedValue = 1;
        int actualValue = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedValue, actualValue);
        

    }

    @Test

    public void removeDogTest(){

        Dog dog1 = new Dog("ScoobyDoo", new Date(), 737);
        Dog dog2 = new Dog("dog", new Date(), 324);
        
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.remove(737);

        int expectedValue = 1;
        int actualValue = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedValue, actualValue);
        

    }

    @Test

    public void removeDogTest2(){

        Dog dog1 = new Dog("kdlsfad", new Date(), 10);
        
        DogHouse.add(dog1);
        DogHouse.remove(dog1);
        int expectedValue = 0;
        int actualValue = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedValue, actualValue);
        

    }

    @Test

    public void getIdTest(){

        Dog dog1 = new Dog("albert", new Date(), 77);
        Dog dog2 = new Dog("dogboi", new Date(), 231);
        
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        
        Dog expectedDog = dog1;
        Dog actualDog = DogHouse.getDogById(77);

        Assert.assertEquals(expectedDog, actualDog);
        

    }

    @Test

    public void getTotalTest(){

        Dog dog1 = new Dog("peepeepoopoo", new Date(), 707);
        Dog dog2 = new Dog("dogboi", new Date(), 239);
        
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        
        int expectedDog = 2;
        int actualDog = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedDog, actualDog);
        

    }
}
