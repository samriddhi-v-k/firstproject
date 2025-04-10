package com.xworkz.plants;

import com.xworkz.plants.indoorPlants.IndoorPlants;

public class PlantsRunner {
    public static void main(String[] args) {
        Plants plants = new Plants();
        plants.oxygen();
        plants.rain();

        IndoorPlants indoorPlants = new IndoorPlants();
        indoorPlants.oxygen();
        indoorPlants.rain();
    }
}
