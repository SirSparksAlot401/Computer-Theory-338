package com.company.game;
//GameLogic class, this is where the methods are called based on the state the game is in.
public class GameLogic {

    //Initializing variables.
    private GameState Right;
    private GameState Left;
    private GameState StandingState;
    private GameState MidAir;
    private GameState Prone;
    private GameState currentState;
    private int numActions;
    private final int initialNumActions = 10;

    //Constructor for states and numActions the player has, also sets up the currentState to StandingState.
    public GameLogic() {
        numActions = initialNumActions;
        Right = new Right(GameLogic.this);
        Left = new Left(GameLogic.this);
        StandingState = new Stand(GameLogic.this);
        MidAir = new AirBorne(GameLogic.this);
        Prone = new Prone(GameLogic.this);
        currentState = StandingState;

    }
        //Checks if the player has any moves remaining before resetting the player and game state to the start state.
        private void haveMovesRemaining(){
            currentState = StandingState;
            System.out.println("I am sorry, but you have run out of moves, resetting you to the start state: Standing.");
            numActions = initialNumActions;
        }

        //Calls moveRight if the player has moves remaining, otherwise calls haveMovesRemaining.
        public void right(){
            if(numActions < 1) {
                haveMovesRemaining();
            }else{
                currentState.moveRight();
                numActions --;
            }
        }

    //Calls moveLeft if the player has moves remaining, otherwise calls haveMovesRemaining.
    public void left(){
            if(numActions < 1) {
                haveMovesRemaining();
            }else{
                currentState.moveLeft();
                numActions --;
            }
        }
    //Calls jump if the player has moves remaining, otherwise calls haveMovesRemaining.
        public void jump(){
            if(numActions < 1) {
                haveMovesRemaining();
            }else{
                currentState.jump();
                numActions --;
            }
        }

    //Calls fireBall if the player has moves remaining, otherwise calls haveMovesRemaining.
    public void fireBall(){
            if(numActions < 1) {
                haveMovesRemaining();
            }else{
                currentState.fireBall();
                numActions --;
            }
    }

    //Calls gravity if the player has moves remaining, otherwise calls haveMovesRemaining.
        public void gravity(){
            if(numActions < 1) {
                haveMovesRemaining();
            }else{
                currentState.gravity();
                numActions --;
            }
        }

        //Getters for each state.
        public GameState getRight(){
            return Right;
        }

        public GameState getLeft(){
            return Left;
        }

        public GameState getStanding(){
            return StandingState;
        }

        public GameState getMidAir(){
            return MidAir;
        }

        public GameState getProne(){
            return Prone;
        }


        //Method to change currentState to state.
        public void setState(GameState state){
            currentState = state;
        }

}
