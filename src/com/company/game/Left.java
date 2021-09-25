package com.company.game;

//Left state.
public class Left implements GameState{
    private GameLogic game;

    //Setting up the GameLogic object.
    public Left(GameLogic g){
        game = g;
    }

    //Moving left from Left.
    @Override
    public void moveLeft() {
        System.out.println("Moving left.");
        game.setState(game.getLeft());
    }

    //Moving left from Left.
    @Override
    public void moveRight() {
        System.out.println("Moving to stand.");
        game.setState(game.getStanding());
    }

    //Jumping from Left.
    @Override
    public void jump(){
        System.out.println("Jumping, now midair.");
        game.setState(game.getMidAir());
    }
    //Handling the fireball game action while in left state.
    @Override
    public void fireBall(){
        System.out.println("Hit by fireball.");
        game.setState(game.getProne());
    }

    //Handling the gravity game action while in left state.
    @Override
    public void gravity(){
        System.out.println("Remaining strong in the face of gravity, stay Left.");
        game.setState(game.getStanding());
    }
}
