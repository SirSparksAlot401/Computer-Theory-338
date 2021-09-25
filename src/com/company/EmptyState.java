package com.company;
//State for the machine having no gumballs.
class EmptyState implements State{
    private GumballMachine gumballMachine;

    //Constructor for gumball machine.
    public EmptyState(GumballMachine m){
        gumballMachine = m;
    }

    //Inserting quarter into the empty gumball machine.
    @Override
    public void quarterInserted() {
        System.out.println("The gumball machine is empty, here is your quarter back. Please wait until it is refilled.");
        gumballMachine.setState(gumballMachine.getEmptyState());
    }

    //Removing quarter from empty machine.
    @Override
    public void removeQuarter() {
        System.out.println("Here is your Quarter back, sorry the machine is empty ");
        gumballMachine.setState(gumballMachine.getEmptyState());
    }

    //Attempting to crank empty machine.
    @Override
    public void crank(){
        gumballMachine.setState(gumballMachine.getEmptyState());
        System.out.println("The gumball machine is empty, Please wait until it is refilled.");
    }

    //Refilling the empty machine.
    @Override
    public void refill(int numGumballs){
        System.out.println(numGumballs + "added to gumball machine.");
        gumballMachine.refill(numGumballs);
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

}
