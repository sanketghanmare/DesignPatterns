package com.sk101.state.abuse;

public class Stopwatch {
//    private boolean isRunning;
//
//
//    public void click() {
//        if (isRunning) {
//            isRunning = false;
//            System.out.println("Stopped");
//        } else {
//            isRunning = true;
//            System.out.println("Running");
//        }
//    }
private State currentState = new Stopstate(this);
    public void click() {
       currentState.click();
    }


    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }



}
