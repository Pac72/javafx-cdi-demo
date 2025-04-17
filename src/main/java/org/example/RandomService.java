package org.example;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Random;

@ApplicationScoped
public class RandomService {
    private final Random rnd = new Random();

    public int nextInt() {
        return rnd.nextInt();
    }
}
