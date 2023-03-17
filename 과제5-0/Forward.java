package uk.epl.player;

import uk.epl.game.*;
public class Forward  extends Player {
    private int ACCELERATION_POINT =10;

    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);
    }

    @Override
    protected float getSpeed(){
        return super.getSpeed() +ACCELERATION_POINT;
    }

    public void setPoint(){
        position.x = 34;
        position.y = 25;
    }

}
