package com.company;

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



interface State{
    void quarterInserted();
    void removeQuarter();
    void crank();
    void refill(int numGumballs);
}

