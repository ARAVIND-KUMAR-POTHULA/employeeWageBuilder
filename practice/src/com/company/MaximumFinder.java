package com.company;

public class MaximumFinder {
    public  <E extends Comparable<E>> E maximum (E num1, E num2, E num3) {
        E data = num1;
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
            return data;
        }
        if(num2.compareTo(num3) > 0 && num2.compareTo(num1) > 0) {
            data = num2;
        }
        if(num3.compareTo(num1) > 0 && num3.compareTo(num2) > 0) {
            data = num3;
        }
        return data;
    }
}

