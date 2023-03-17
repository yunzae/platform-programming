public class MidFielder extends Player{
    public MidFielder(Builder builder) {
        super(builder);
    }
    public int getSpeed(){
        return this.speed;
    }
    public String toString() {
        return super.toString()+"Midfielder";
    }
}
