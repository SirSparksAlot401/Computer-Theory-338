package com.company;

//Gumball machine class
class GumballMachine{
    private State quarter;
    private State noQuarter;
    private State emptyState;
    private int numGumballs;
    final private int initalGumballs = 4;

    private State currentState;
    //Constructor for gumball machine, sets up the states and initial gumballs.
    public GumballMachine(){
        numGumballs = initalGumballs;
        quarter = new Quarter(GumballMachine.this);
        noQuarter = new NoQuarter(GumballMachine.this);
        emptyState = new EmptyState(GumballMachine.this);

        currentState = noQuarter;
    }
    //Method calls to states from gumball machine.
    public void crank(){
        currentState.crank();
    }

    public void addQuarter(){
        currentState.quarterInserted();
    }

    public void removeQuarter(){
        currentState.removeQuarter();
    }

    //Method to add gumballs to the machine.
    public void refill(int numGumballsAdded){
        numGumballs += numGumballsAdded;
    }



    //Method to set currentState to state.
    public void setState(State state){
        currentState = state;
    }

    //Setters, Getters, and deprecation for each state and deprecation for
    //numGumballs.
    public State getQuarter(){
        return quarter;
    }

    public int getNumGumballs(){
        return numGumballs;
    }

    public void depreicateGumball(){
        numGumballs -= 1;
    }

    public State getNoQuarter(){
        return noQuarter;
    }

    public State getEmptyState(){return emptyState;}

    //Method to set the number of gumballs in machine,
    // mostly for testing purposes.
    public void setNumGumballs(int gumballs){
        numGumballs = gumballs;
    }

}