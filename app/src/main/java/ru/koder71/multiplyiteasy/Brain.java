package ru.koder71.multiplyiteasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Brain {
    int x;
    public Brain(int x) {
        this.x = x;
    }

    ArrayList<Integer> numb = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9));
    //генератор сл. чисел 2-9
    Random rand = new Random();
    int r = rand.nextInt(numb.size());
    public int rez;

    int multiPlyer() {
        rez = x * numb.get(r);


        return rez;
    }
}
