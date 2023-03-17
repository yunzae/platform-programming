public class Defender extends Player{
    public Defender(Builder builder) {
        super(builder);
    }
    public int getSpeed(){
        this.speed-=10;
        return this.speed;
    }
    public String toString() {
        return super.toString()+"Defender";
    }
}
