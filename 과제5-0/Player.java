package uk.epl.player;

import uk.epl.game.*;
public abstract class Player {
    private String name;
    private int jerseyNumber;
    private int speed;
    private int stamina;
    private int passing;
    private int[] abilities =new int[3];
    final int SPEED = 0; final int STAMINA =1; final int PASSING =2;

    public Player(String name, int jerseyNumber, int speed, int stamina, int passing) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.speed = speed;
        this.stamina = stamina;
        this.passing = passing;
        this.position = new Position(0,0);
        abilities[SPEED] = speed;
        abilities[STAMINA]= stamina;
        abilities[PASSING]= passing;
    }

    Position position;

    public class Position{
        public int x;
        public int y;

        public Position(int x,int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "("+x+" , "+y+")";
        }
    }
    public void setPoint(){
        position.x = 0;
        position.y = 0;
    }
    public Position getPosition(){
        return new Position(position.x,position.y);
    }
    public void moveUp(){
        float move_delta = getMovedelta();
        position.y =(int) (position.y-move_delta);
        decreaseStamina();
    }
    public void moveRight(){
        float move_delta = getMovedelta();
        position.x =(int) (position.x-move_delta);
        decreaseStamina();
    }
    public void moveDown(){
        float move_delta = getMovedelta();
        position.y =(int) (position.y+move_delta);
        decreaseStamina();
    }
    public void moveLeft(){
        float move_delta = getMovedelta();
        position.x =(int) (position.x+move_delta);
        decreaseStamina();
    }
    private void decreaseStamina(){
        abilities[STAMINA] =(int) (abilities[STAMINA]-2);
    }
    private float getMovedelta(){
        return 1+getSpeed()/100*getStamina()/100;
    }
    protected float getSpeed(){
        return (float) abilities[SPEED];
    }
    protected float getStamina(){
        return (float) abilities[STAMINA];
    }
    protected String getName(){
        return this.name;
    }
    public int getJerseyNumber(){
        return this.jerseyNumber;
    }
    protected float getPassing(){
        return this.passing;
    }

    @Override
    public String toString() {
        return "Player Name=" + getName()  +
                ", JerseyNumber=" + getJerseyNumber() +
                ", Position=" + getPosition().toString() +" "+this.getClass().getSimpleName() +
                " SPEED=" + getSpeed() +
                ", STAMINA=" + getStamina() +
                ", PASSING=" + getPassing() ;
    }
}
