package com.company;
//State for the machine having no quarter.
class NoQuarter implements State{
    private GumballMachine gumballMachine;

    //Constructor for gumball machine.
    public NoQuarter(GumballMachine m){
        gumballMachine = m;
    }

    //Inserting quarter into gumball machine containing no quarter.
    @Override
    public void quarterInserted() {
        System.out.println("Quarter added.");
        gumballMachine.setState(gumballMachine.getQuarter());
    }

    //Attempting to remove quarter from a machine containing no quarter.
    @Override
    public void removeQuarter() {
        System.out.println("There is no quarter.");
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

    //Attempting to crank a machine with no quarter in it, filthy cheaters.
    @Override
    public void crank(){
        System.out.println("Please insert a quarter.");
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

    //Adding numGumballs to the machine.
    @Override
    public void refill(int numGumballs){
        System.out.println(numGumballs + "added to gumball machine.");
        gumballMachine.refill(numGumballs);
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }
}
