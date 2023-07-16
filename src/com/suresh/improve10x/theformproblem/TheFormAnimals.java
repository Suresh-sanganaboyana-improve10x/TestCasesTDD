package com.suresh.improve10x.theformproblem;

public class TheFormAnimals {
    public int getTotalAnimalLegs(int noOfChickenLegs, int noOfCows, int noOfPigs) {
        int totalAnimalLegs = 0;
        int chicken = noOfChickenLegs*2;
        int cows = noOfCows*4;
        int pigs = noOfPigs*4;
        totalAnimalLegs = chicken+cows+pigs;
        return totalAnimalLegs;
    }
}
