package com.company;

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();
        gumballMachine.quarterInserted();
        gumballMachine.gumballDelivered();
    }
}



interface State{
    public void quarterInserted();
    public void gumballDelivered();
}

