package com.suresh.improve10x.theformproblem;

public class TheFormAnimals {
    public int getTotalAnimalLegs(int noOfChickens, int noOfCows, int noOfPigs) {
        int totalAnimalLegs = 0;
        if (noOfChickens < 0 && noOfCows < 0 && noOfPigs < 0) {
            return -1;
        }
        int chicken = noOfChickens*2;
        int cows = noOfCows*4;
        int pigs = noOfPigs*4;
        totalAnimalLegs = chicken+cows+pigs;
        return totalAnimalLegs;
    }
}
