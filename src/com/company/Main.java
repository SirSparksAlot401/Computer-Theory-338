package com.company;
//Driver/Main class for the gumball machine.
// This is the class for the gumball matching DFA implementation.
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();
        gumballMachine.addQuarter();
        gumballMachine.addQuarter();
        gumballMachine.crank();
        gumballMachine.removeQuarter();
        gumballMachine.crank();
        gumballMachine.addQuarter();
        gumballMachine.removeQuarter();
        gumballMachine.refill(5);

    }
}


//State interface.
interface State{
    void quarterInserted();
    void removeQuarter();
    void crank();
    void refill(int numGumballs);
}

