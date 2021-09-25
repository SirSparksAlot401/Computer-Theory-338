package com.company;
//State for machine containing a quarter.
class Quarter implements State{
    private GumballMachine gumballMachine;

    public Quarter(GumballMachine m){
        gumballMachine = m;
    }

    //Insert a quarter and send the machine to the getQuarter state.
    @Override
    public void quarterInserted() {
        System.out.println("There is already a quarter inserted.");
        gumballMachine.setState(gumballMachine.getQuarter());
    }

    //Crank the gumball machine and send it to the NoQuarter state if there
    // is a gumball in the machine.
    @Override
    public void crank() {
        System.out.println("Here is a gumball, enjoy!");
        gumballMachine.depreicateGumball();
        if (gumballMachine.getNumGumballs() < 1) {
            gumballMachine.setState(gumballMachine.getEmptyState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarter());
        }
    }

    //Taking the quarter out and returning to the NoQuarter state.
    @Override
    public void removeQuarter() {
        System.out.println("Here is your quarter back.");
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

    //Adding numGumballs to the machine and sending the machine
    // to the NoQuarter state.
    @Override
    public void refill(int numGumballs){
        System.out.println(numGumballs + "added to gumball machine.");
        gumballMachine.refill(numGumballs);
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

}
