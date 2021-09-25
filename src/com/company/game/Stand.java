package com.company.game;

//Stand state
class Stand implements GameState {
    private GameLogic game;

    //Setting up the GameLogic object.
    public Stand(GameLogic g) {
        game = g;
    }

    //Moving from stand to left.
    @Override
    public void moveLeft() {
        System.out.println("Moving left.");
        game.setState(game.getLeft());
    }

    //Moving from stand to right.
    @Override
    public void moveRight() {
        System.out.println("Moving right.");
        game.setState(game.getRight());
    }

    //Jumping from standing.
    @Override
    public void jump(){
        System.out.println("Jumping, now midair.");
        game.setState(game.getMidAir());
    }

    //Handling the fireball game action while in stand state.
    @Override
    public void fireBall(){
        System.out.println("Hit by fireball.");
        game.setState(game.getProne());
    }

    //Handling the gravity game action while in left state.
    @Override
    public void gravity(){
        System.out.println("Remaining strong in the face of gravity, stay standing.");
        game.setState(game.getStanding());
    }

}
