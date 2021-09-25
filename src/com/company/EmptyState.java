package com.company;

class EmptyState implements State{
    private GumballMachine gumballMachine;

    public EmptyState(GumballMachine m){
        gumballMachine = m;
    }

    @Override
    public void quarterInserted() {
        System.out.println("The gumball machine is empty, here is your quarter back. Please wait until it is refilled.");
        gumballMachine.setState(gumballMachine.getEmptyState());
    }

    @Override
    public void removeQuarter() {
        System.out.println("Here is your Quarter back, sorry were empty ");
        gumballMachine.setState(gumballMachine.getEmptyState());
    }

    @Override
    public void crank(){
        gumballMachine.setState(gumballMachine.getEmptyState());
        System.out.println("The gumball machine is empty, Please wait until it is refilled.");
    }

    @Override
    public void refill(int numGumballs){
        System.out.println(numGumballs + "added to gumball machine.");
        gumballMachine.refill(numGumballs);
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

}
