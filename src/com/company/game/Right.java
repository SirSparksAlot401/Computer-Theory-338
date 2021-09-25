package com.company.game;

//Right state
class Right implements GameState {
    private GameLogic game;

    //Setting up the GameLogic object.
    public Right(GameLogic g){
        game = g;
    }

    //Moving left from right.
    @Override
    public void moveLeft() {
        System.out.println("Moving to stand.");
        game.setState(game.getStanding());
    }

    //Moving right from right.
    @Override
    public void moveRight() {
        System.out.println("Moving right.");
        game.setState(game.getRight());
    }

    //Jumping from right.
    @Override
    public void jump(){
        System.out.println("Jumping, now midair.");
        game.setState(game.getMidAir());
    }

    //Handling the fireball game action while in right state.
    @Override
    public void fireBall(){
        System.out.println("Hit by fireball.");
        game.setState(game.getProne());
    }

    //Handling the gravity game action while in left state.
    @Override
    public void gravity(){
        System.out.println("Remaining strong in the face of gravity, stay right.");
        game.setState(game.getRight());
    }
}
