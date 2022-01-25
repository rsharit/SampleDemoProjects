package assignments.easy.fruitbowl.src.test;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {
    List<FBFruit> fruitBowl;

    FruitBowl(){
        fruitBowl= new ArrayList<FBFruit>();
    }

    public void addFruit(FBFruit fruit){
        fruitBowl.add(fruit);
    }

    public List<FBFruit> getApple(List<FBFruit> commonFruitBowl){
        List<FBFruit> apples = new ArrayList<>();
        for(FBFruit fruitType : commonFruitBowl){
                if (fruitType instanceof FBApple)
                    apples.add(fruitType);
        }

        return apples;
    }

    public List<FBFruit> getBanana(List<FBFruit> commonFruitBowl){
        List<FBFruit> bananas = new ArrayList<>();
        for(FBFruit fruitType : commonFruitBowl){
            if (fruitType instanceof FBBanana)
                bananas.add(fruitType);
        }

        return bananas;
    }

    public List<FBFruit> getOranges(List<FBFruit> commonFruitBowl){
        List<FBFruit> oranges = new ArrayList<>();
        for(FBFruit fruitType : commonFruitBowl){
            if (fruitType instanceof FBOrange)
                oranges.add(fruitType);
        }
        return oranges;
    }
}
