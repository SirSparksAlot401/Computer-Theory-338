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

    }
}



interface State{
    public void quarterInserted();
    public void removeQuarter();
    public void crank();
}

