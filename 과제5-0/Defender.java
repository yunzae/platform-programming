package uk.epl.player;
import uk.epl.game.*;
public class Defender extends Player {
    private int STRENGTH_POINT =10;

    public Defender(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);
    }

    @Override
    protected float getStamina(){
        return super.getStamina() + STRENGTH_POINT;
    }

    public void setPoint(){
        position.x = 34;
        position.y = 75;
    }


}
