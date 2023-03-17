package uk.epl.game;
import uk.epl.player.*;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<uk.epl.player.Player> players =new ArrayList<>();

    public void add(uk.epl.player.Player player){
        players.add(player);

    }
    public void moveUp(int jerseyNumber){
        for (uk.epl.player.Player p :players){
            if(p.getJerseyNumber()==jerseyNumber)
                p.moveUp();
        }
    }
    public void moveDown(int jerseyNumber){
        for (uk.epl.player.Player p :players){
            if(p.getJerseyNumber()==jerseyNumber)
                p.moveDown();
        }
    }
    public void moveRight(int jerseyNumber){
        for (uk.epl.player.Player p :players){
            if(p.getJerseyNumber()==jerseyNumber)
                p.moveRight();
        }
    }
    public void moveLeft(int jerseyNumber){
        for (uk.epl.player.Player p :players){
            if(p.getJerseyNumber()==jerseyNumber)
                p.moveLeft();
        }
    }
    public void start(){
        for (uk.epl.player.Player p :players){
            p.setPoint();
        }
    }
    public void stop(){

    }
    public void info(){
        for (Player p :players){
            System.out.println(p);
        }
    }
}
