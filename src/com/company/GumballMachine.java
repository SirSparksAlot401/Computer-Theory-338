package com.company;

class GumballMachine{
    private State quarter;
    private State noQuarter;
    private State emptyState;
    private int numGumballs;

    private State currentState;

    public GumballMachine(){
        numGumballs = 4;
        quarter = new Quarter(GumballMachine.this);
        noQuarter = new NoQuarter(GumballMachine.this);
        emptyState = new EmptyState(GumballMachine.this);

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

    public void refill(int numGumballsAdded){
        numGumballs += numGumballsAdded;
    }



    //Method to change state (called form where??)
    public void setState(State state){
        currentState = state;
    }

    public State getQuarter(){
        return quarter;
    }

    public int getNumGumballs(){
        return numGumballs;
    }
    public void depreicateGumball(){
        numGumballs -= 1;
    }

    public void setNumGumballs(int gumballs){
        numGumballs = gumballs;
    }

    public State getNoQuarter(){
        return noQuarter;
    }

    public State getEmptyState(){return emptyState;}


}