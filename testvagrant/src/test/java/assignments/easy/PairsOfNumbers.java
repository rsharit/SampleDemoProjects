package assignments.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1) Pair of Numbers (Logic & Algo)
 * Find any pair of numbers that form the key
 *
 * Input: [1, 2, -1, -2, 4, 5, -9, 0, 10, 40]
 *
 * Key: 4
 *
 * Using arithmetic operations (addition, substration, multiplication & division)
 *
 * Suggested output: [{2, -2}, {1, 4}, {-1, 5}, {4, 0}, {10, 40}]
 *
 * Eg: 2-(-2) = 4 #using subtraction,  1*4 = 4 # using multiplication
 */

public class PairsOfNumbers {
    int inputArr[] = {1, 2, -1, -2, 4, 5, -9, 0, 10, 40};
    int key = 4;

    private int multiply(int num1, int num2){
        return num1*num2;
    }

    private int add(int num1, int num2){
        return num1+num2;
    }

    private int subtract(int num1, int num2){
        return num1-num2;
    }

    private int divide(int num1, int num2){
        try{
            return num1/num2;
        }catch(ArithmeticException e){
            return -11111/*Safe value in case Arithmatic exception is encountered*/;
        }
    }

    public static void main(String[] args){

        PairsOfNumbers pairsOfNumbers = new PairsOfNumbers();
        Set<String> results = new HashSet<String>();
        for(int i=0; i<pairsOfNumbers.inputArr.length; i++){
            for(int j=i+1; j<pairsOfNumbers.inputArr.length; j++){
                if (pairsOfNumbers.key == pairsOfNumbers.multiply(pairsOfNumbers.inputArr[i],
                pairsOfNumbers.inputArr[j])){
                    results.add("{*:" + pairsOfNumbers.inputArr[i] + "," + pairsOfNumbers.inputArr[j] + "}");
                }

                if (pairsOfNumbers.key == pairsOfNumbers.multiply(pairsOfNumbers.inputArr[j],
                        pairsOfNumbers.inputArr[i])){
                    results.add("{*:" + pairsOfNumbers.inputArr[j] + "," + pairsOfNumbers.inputArr[i] + "}");
                }

                if (pairsOfNumbers.key == pairsOfNumbers.add(pairsOfNumbers.inputArr[i],
                        pairsOfNumbers.inputArr[j])){
                    results.add("{+:" + pairsOfNumbers.inputArr[i] + "," + pairsOfNumbers.inputArr[j] + "}");
                }

                if (pairsOfNumbers.key == pairsOfNumbers.add(pairsOfNumbers.inputArr[j],
                        pairsOfNumbers.inputArr[i])){
                    results.add("{+:" + pairsOfNumbers.inputArr[j] + "," + pairsOfNumbers.inputArr[i] + "}");
                }

                if (pairsOfNumbers.key == pairsOfNumbers.divide(pairsOfNumbers.inputArr[i],
                        pairsOfNumbers.inputArr[j])){
                    results.add("{/:" + pairsOfNumbers.inputArr[i] + "," + pairsOfNumbers.inputArr[j] + "}");
                }

                if (pairsOfNumbers.key == pairsOfNumbers.divide(pairsOfNumbers.inputArr[j],
                        pairsOfNumbers.inputArr[i])){
                    results.add("{/:" + pairsOfNumbers.inputArr[j] + "," + pairsOfNumbers.inputArr[i] + "}");
                }

                if (pairsOfNumbers.key == pairsOfNumbers.subtract(pairsOfNumbers.inputArr[i],
                        pairsOfNumbers.inputArr[j])){
                    results.add("{-:" + pairsOfNumbers.inputArr[i] + "," + pairsOfNumbers.inputArr[j] + "}");
                }

                if (pairsOfNumbers.key == pairsOfNumbers.subtract(pairsOfNumbers.inputArr[j],
                        pairsOfNumbers.inputArr[i])){
                    results.add("{-:" + pairsOfNumbers.inputArr[j] + "," + pairsOfNumbers.inputArr[i] + "}");
                }
            }
        }

        for (Object value : results.toArray()){
            System.out.print(value.toString() + " ");
        }


    }

}
