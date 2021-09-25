package com.company;

class NoQuarter implements State{
    private GumballMachine gumballMachine;

    public NoQuarter(GumballMachine m){
        gumballMachine = m;
    }

    @Override
    public void quarterInserted() {
        System.out.println("Quarter added.");
        gumballMachine.setState(gumballMachine.getQuarter());
    }

    @Override
    public void removeQuarter() {
        System.out.println("There is no quarter.");
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

    @Override
    public void crank(){
        System.out.println("Please insert a quarter.");
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

    @Override
    public void refill(int numGumballs){
        System.out.println(numGumballs + "added to gumball machine.");
        gumballMachine.refill(numGumballs);
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }
}
