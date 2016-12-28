package com.apex;

import java.util.Random;

/**
 * Created by akshay on 22/12/16.
 */
public class RandomValueGenerator {
    Random random = new Random();

    public double randomCost() {
        return (0.5 * (random.nextInt(10) + 1));
    }

    public int randomImpressions() {
        return random.nextInt(5) + 1;
    }

    public boolean randomClicks() {
        return random.nextBoolean();
    }
}
