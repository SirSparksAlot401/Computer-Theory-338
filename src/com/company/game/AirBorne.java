package com.company.game;
//AirBorne state
class AirBorne implements GameState {
    private GameLogic game;

    //Setting up the GameLogic object.
    public AirBorne(GameLogic g){
        game = g;
    }

    //Moving left from AirBorne.
    @Override
    public void moveLeft() {
        System.out.println("Remaining airborne.");
        game.setState(game.getMidAir());
    }
    //Moving right from AirBorne.
    @Override
    public void moveRight() {
        System.out.println("Remaining airborne.");
        game.setState(game.getMidAir());
    }

    //Jumping from AirBorne.
    @Override
    public void jump(){
        System.out.println("Remaining airborne.");
        game.setState(game.getMidAir());
    }

    //Handling the fireball game event while AirBorne.
    @Override
    public void fireBall(){
        System.out.println("Dogged fireball, remaining airborne.");
        game.setState(game.getMidAir());
    }

    //Handling the gravity game event while AirBorne.
    @Override
    public void gravity(){
        System.out.println("Returning to ground.");
        game.setState(game.getStanding());
    }
}
