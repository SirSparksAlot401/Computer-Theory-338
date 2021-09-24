package com.company;

class GumballMachine{
    private State spotForQuarter;
    private State crank;
    private State gumballDeliveryTunnel;

    private State currentState;

    public GumballMachine(){

        spotForQuarter = new State1(GumballMachine.this);
        crank = new State2(GumballMachine.this);
        gumballDeliveryTunnel = new State3(GumballMachine.this);

        currentState = spotForQuarter;
    }

    public void quarterInserted(){
        currentState.quarterInserted();
        currentState = crank;
        System.out.println("Quarter inserted, transitioning to crank state.");
    }

    public void quarterUsedToPay(){
        currentState.quarterUsedToPay();
        currentState = gumballDeliveryTunnel;
        System.out.println("Quarter used to pay, transitioning to Gumball delivery tunnel.");
    }

    public void gumballDelivered(){
        currentState.gumballDelivered();
        currentState = spotForQuarter;
        System.out.println("Gumball was delivered, transitioning to spot for quarter state.");
    }

    //Method to change state (called form where??)
    public void setState(State state){
        currentState = state;
    }

    public State getSpotForQuarter(){
        return spotForQuarter;
    }

    public State getCrank(){
        return crank;
    }

    public State getGumballDeliveryTunnel(){
        return gumballDeliveryTunnel;
    }


}