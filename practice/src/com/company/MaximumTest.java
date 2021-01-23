package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenThreeIntegers_ShouldReturnMaximum() {
        MaximumFinder object = new MaximumFinder();
        int max = object.maximum(6, 1, 3);
        Assert.assertEquals(6,max);
    }
    @Test
    public void givenThreeDouble_ShouldReturnMaximum() {
        MaximumFinder object = new MaximumFinder();
        double max = object.maximum(6.0, 1.0, 3.0);
        Assert.assertEquals(6.0,max,0.0);
    }
}

