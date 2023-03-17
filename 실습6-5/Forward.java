public class Forward extends Player{
    public Forward(Builder builder) {
        super(builder);
    }
    public int getSpeed(){
        this.speed+=10;
        return this.speed;
    }

    @Override
    public String toString() {
        return super.toString()+"Forward";
    }
}
