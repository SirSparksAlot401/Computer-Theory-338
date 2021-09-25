package com.company.game;

public class GameLogic {

    private GameState Right;
    private GameState Left;
    private GameState StandingState;
    private GameState MidAir;
    private GameState Prone;
    private GameState currentState;
    private int numActions;
    private final int initialNumActions = 10;

    public GameLogic() {
        numActions = initialNumActions;
        Right = new Right(GameLogic.this);
        Left = new Left(GameLogic.this);
        StandingState = new Stand(GameLogic.this);
        MidAir = new AirBorne(GameLogic.this);
        Prone = new Prone(GameLogic.this);
        currentState = StandingState;

    }

        private void haveMovesRemaining(){
            currentState = StandingState;
            System.out.println("I am sorry, but you have run out of moves, resetting you to the start state: Standing.");
            numActions = initialNumActions;
        }
        public void right(){
            if(numActions < 1) {
                haveMovesRemaining();
            }else{
                currentState.moveRight();
                numActions --;
            }
        }

        public void left(){
            if(numActions < 1) {
                haveMovesRemaining();
            }else{
                currentState.moveLeft();
                numActions --;
            }
        }

        public void jump(){
            if(numActions < 1) {
                haveMovesRemaining();
            }else{
                currentState.jump();
                numActions --;
            }
        }

        public void fireBall(){
            if(numActions < 1) {
                haveMovesRemaining();
            }else{
                currentState.fireBall();
                numActions --;
            }
    }

        public void gravity(){
            if(numActions < 1) {
                haveMovesRemaining();
            }else{
                currentState.gravity();
                numActions --;
            }
        }

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


        //Method to change state (called form where??)
        public void setState(GameState state){
            currentState = state;
        }

}
