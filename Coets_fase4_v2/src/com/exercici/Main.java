package com.exercici;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        //rocket1
        (new Thread(new ThreadA())).start();

        //rocket2
        (new Thread(new ThreadB())).start();
    }
}
