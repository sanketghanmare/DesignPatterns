package com.sk101.state.abuse;

public class Stopstate implements State{
    private Stopwatch stopwatch;

    public Stopstate(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new Runningstate(stopwatch));
        System.out.println("Running");
    }
}
