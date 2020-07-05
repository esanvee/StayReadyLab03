package hbcu.stay.ready;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import hbcu.stay.ready.animals.animal_storage.CatHouse;
import org.junit.Assert;
import hbcu.stay.ready.animals.Cat;


public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test

    public void addCatTest(){

        Cat cat1 = new Cat("Tom", new Date(), 101010);
        
        CatHouse.add(cat1);
        int expectedValue = 1;
        int actualValue = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedValue, actualValue);
        

    }

    @Test

    public void removeCatTest(){

        Cat cat1 = new Cat("peepeepoopoo", new Date(), 707);
        Cat cat2 = new Cat("catboi", new Date(), 239);
        
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.remove(707);

        int expectedValue = 1;
        int actualValue = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedValue, actualValue);
        

    }

    @Test

    public void removeCatTest2(){

        Cat cat1 = new Cat("sksaldjas", new Date(), 101010);
        
        CatHouse.add(cat1);
        CatHouse.remove(cat1);
        int expectedValue = 0;
        int actualValue = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedValue, actualValue);
        

    }

    @Test

    public void getIdTest(){

        Cat cat1 = new Cat("peepeepoopoo", new Date(), 707);
        Cat cat2 = new Cat("catboi", new Date(), 239);
        
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        
        Cat expectedCat = cat1;
        Cat actualCat = CatHouse.getCatById(707);

        Assert.assertEquals(expectedCat, actualCat);
        

    }

    @Test

    public void getTotalTest(){

        Cat cat1 = new Cat("peepeepoopoo", new Date(), 707);
        Cat cat2 = new Cat("catboi", new Date(), 239);
        
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        
        int expectedCat = 2;
        int actualCat = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCat, actualCat);
        

    }
}
