package com.company;

class State2 implements State{
    private GumballMachine gumballMachine;

    public State2(GumballMachine m){
        gumballMachine = m;
    }

    @Override
    public void quarterInserted() {
        gumballMachine.setState(gumballMachine.getQuarter());
    }

    @Override
    public void removeQuarter() {
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

    @Override
    public void crank(){
        System.out.println("How are you in here, you're not supposed to be here....");
    }

}
