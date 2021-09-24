package com.company;

class State3 implements State{
    private GumballMachine gumballMachine;

    public State3(GumballMachine m){
        gumballMachine = m;
    }

    @Override
    public void quarterInserted() {
        gumballMachine.setState(gumballMachine.getSpotForQuarter());
    }
    @Override
    public void quarterUsedToPay() {
        gumballMachine.setState(gumballMachine.getCrank());
    }
    @Override
    public void gumballDelivered() {
        gumballMachine.setState(gumballMachine.getGumballDeliveryTunnel());
    }

}
