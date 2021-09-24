package com.company;

class GumballMachine{
    private State quarter;
    private State noQuarter;

    private State currentState;

    public GumballMachine(){

        quarter = new Quarter(GumballMachine.this);
        noQuarter = new NoQuarter(GumballMachine.this);

        currentState = noQuarter;
    }

    public void crank(){
        currentState.crank();
    }

    public void addQuarter(){
        currentState.quarterInserted();
    }

    public void removeQuarter(){
        currentState.removeQuarter();
    }

    //Method to change state (called form where??)
    public void setState(State state){
        currentState = state;
    }

    public State getQuarter(){
        return quarter;
    }

    public State getNoQuarter(){
        return noQuarter;
    }


}