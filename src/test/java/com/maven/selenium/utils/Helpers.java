package com.maven.selenium.utils;

import java.util.Random;

public class Helpers {
    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int randomNumber(int size){
        Random random = new Random();
        int num =   random.nextInt(size-1);
        return num;

    }
}
