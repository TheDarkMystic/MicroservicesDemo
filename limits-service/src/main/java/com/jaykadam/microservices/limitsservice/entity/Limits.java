package com.jaykadam.microservices.limitsservice.entity;

public class Limits {

    private int max;
    private int min;

    public Limits() {
    }

    public Limits(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }






}
