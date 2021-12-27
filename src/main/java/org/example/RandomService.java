package org.example;

import javax.inject.Singleton;
import java.util.Random;

@Singleton
public class RandomService {
    private final Random rnd = new Random();

    public int nextInt() {
        return rnd.nextInt();
    }
}