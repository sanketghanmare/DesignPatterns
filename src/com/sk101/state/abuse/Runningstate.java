package com.sk101.state.abuse;

public class Runningstate implements State{

    private Stopwatch stopwatch;

    public Runningstate(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new Stopstate(stopwatch));
        System.out.println("Stopped");
    }
}
