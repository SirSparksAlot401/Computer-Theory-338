package com.company;

class State2 implements State{
    private GumballMachine gumballMachine;

    public State2(GumballMachine m){
        gumballMachine = m;
    }

    @Override
    public void quarterInserted() {
        gumballMachine.setState(gumballMachine.getSpotForQuarter());
    }

    @Override
    public void gumballDelivered() {
        gumballMachine.setState(gumballMachine.getGumballDeliveryTunnel());
    }

}
