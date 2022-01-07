package assignments.easy;

import groovy.util.NodeList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 2) Games by Age (Logic & Algo)
 * During one of college anniversary event, the event managers have invited students from nearby colleges.
 * There are roughly 1000 students from all departments with an age range of 18 to 25 years.
 * However to conduct games the event managers need to group students by age range using below condition.
 *
 * Max difference of all students within a group is 2 years
 *
 * Eg. If there are 5 students of age groups 18, 20, 21, 21, 23
 *
 * Sample groups:
 * Group A: 18, 20
 * Group B: 21, 21, 23
 */
public class GameByAge {
    public static void main(String[] args){
        GameByAge gameByAge = new GameByAge();
        int totalStudents = 1000;
        int ageGap = 2;
        List<Integer> ages = new ArrayList<Integer>();
        HashMap<Integer, Integer> agesGroup = new HashMap<Integer, Integer>();
        List<Integer> agesCopy = new ArrayList<Integer>();

        /*Generating age*/
        for(int i = 0; i<totalStudents; i++)
            ages.add(18 + (int)(Math.random()*7));

        /*Copying ages in agesCopy*/
        //agesCopy.addAll(ages);

        /* finding no. of students by same age*/
        for(int i=0; i<ages.size(); i++){
            if (agesGroup.containsKey(ages.get(i))){
                int value = agesGroup.get(ages.get(i));
                agesGroup.put(ages.get(i), value+1);
            } else{
                agesGroup.put(ages.get(i), 1);
            }
        }

        /* print groups of age gap by 2 */
        while(agesGroup.size()>0) {

            for (int key : agesGroup.keySet()) {
                if (agesGroup.containsKey(key + 2)) {
                    for (int i = 0; i < agesGroup.get(key); i++) {
                        System.out.print(key + " ");
                    }

                    for (int i = 0; i < agesGroup.get(key + 2); i++) {
                        System.out.print(key + 2 + " ");
                    }

                    agesGroup.remove(key);
                    agesGroup.remove(key + 2);
                    System.out.println();
                    break;
                } else {
                    for (int i = 0; i < agesGroup.get(key); i++) {
                        System.out.print(key + " ");
                    }
                    agesGroup.remove(key);
                    System.out.println();
                }
            }
        }


        System.out.println();
    }
}
