package com.company.game;

public class GameLogic {

    private GameState Right;
    private GameState Left;
    private GameState StandingState;
    private GameState MidAir;
    private GameState Prone;
    private GameState currentState;
    private int numActions;

    public GameLogic() {
        numActions = 0;
        Right = new Right(GameLogic.this);
        Left = new Left(GameLogic.this);
        StandingState = new Stand(GameLogic.this);
        MidAir = new AirBorne(GameLogic.this);
        Prone = new Prone(GameLogic.this);
        currentState = StandingState;

    }

        private boolean haveMovesRemaining(){
            if(numActions > 0){
                return true;
            }else{
                return false;
            }
        }
        public void right(){
            currentState.moveRight();
        }

        public void left(){
            currentState.moveLeft();
        }

        public void jump(){
            currentState.jump();
        }

        public void fireBall(){
            currentState.fireBall();
        }

        public void gravity(){
            currentState.gravity();
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
