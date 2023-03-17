package uk.epl.player;

import uk.epl.game.*;
public class Midfielder extends Player {
    private int PASSING_POINT =10;
    public Midfielder(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);
    }
    @Override
    protected float getPassing(){
        return super.getPassing() +PASSING_POINT;
    }

    public void setPoint(){
        position.x = 34;
        position.y = 50;
    }

}
