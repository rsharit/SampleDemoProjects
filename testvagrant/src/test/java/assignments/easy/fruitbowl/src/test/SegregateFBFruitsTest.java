package assignments.easy.fruitbowl.src.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SegregateFBFruitsTest {

    @Test(description  = "This test will segregate fruits from a common fruit bowl." +
            "This test method will use directly FruitBowl class.")
    public void segregateFruitsUsingFruitBowlClass(){
        // Prepare fruit Bowl, add fruits into it
        // iterate fruit one by one and collect them into one place by their type
        // assert

        // Arrange
        FruitBowl fruitBowl = new FruitBowl();
        for(int i=0; i<3; i++){
            fruitBowl.addFruit(new FBOrange());
            fruitBowl.addFruit(new FBApple());
            fruitBowl.addFruit(new FBBanana());
        }

        // Act
        List<FBFruit> orrangesFruitBowl = fruitBowl.getOranges(fruitBowl.fruitBowl);
        List<FBFruit> appleFruitBowl = fruitBowl.getApple(fruitBowl.fruitBowl);
        List<FBFruit> bananaFruitBowl = fruitBowl.getBanana(fruitBowl.fruitBowl);

        // Assert

        for(int i=0; i<3; i++){
            Assert.assertEquals(appleFruitBowl.get(i).fruitName, "Apple");
            Assert.assertEquals(bananaFruitBowl.get(i).fruitName, "Banana");
            Assert.assertEquals(orrangesFruitBowl.get(i).fruitName, "Orange");
        }
    }

    @Test(description  = "This test will segregate fruits from a common fruit bowl." +
            "This test method will use directly Fruit classes.")
    public void segregateFruits(){
        // Prepare fruit Bowl, add fruits into it
        // iterate fruit one by one and collect them into one place by their type
        // assert

        //Arrange
        List<FBFruit> commonFruitBowl = new ArrayList<>();
        List<FBOrange> orrangesFruitBowl = new ArrayList<>();
        List<FBApple> appleFruitBowl = new ArrayList<>();
        List<FBBanana> bananaFruitBowl = new ArrayList<>();

        for(int i=0; i<3; i++){
            commonFruitBowl.add(new FBOrange());
            commonFruitBowl.add(new FBApple());
            commonFruitBowl.add(new FBBanana());
        }

        //Act

        for(FBFruit fruitType : commonFruitBowl){
            if (fruitType instanceof FBOrange)
                orrangesFruitBowl.add((FBOrange) fruitType);
            else if (fruitType instanceof FBApple)
                appleFruitBowl.add((FBApple) fruitType);
            else if (fruitType instanceof FBBanana)
                bananaFruitBowl.add((FBBanana) fruitType);
        }


        // Assert
        for(int i=0; i<3; i++){
            Assert.assertEquals(appleFruitBowl.get(i).fruitName, "Apple");
            Assert.assertEquals(bananaFruitBowl.get(i).fruitName, "Banana");
            Assert.assertEquals(orrangesFruitBowl.get(i).fruitName, "Orange");
        }

    }
}
