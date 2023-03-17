import java.util.Objects;

public abstract class Player {
    private String name;
    private int jerseyNumber;
    protected int speed;
    private String type;

    public Player(Builder builder) {
        this.name = builder.name;
        this.jerseyNumber = builder.jerseyNumber;
        this.speed = builder.speed;
        this.type = builder.type;
    }

    public static class Builder {
        private String name;
        private int jerseyNumber;
        protected int speed;
        private String type;


        Builder setPlayerType(String type) {
            this.type = type;
            return this;
        }

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setJerseyNumber(int number) {
            this.jerseyNumber = number;
            return this;
        }

        Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Player build() {
            if (Objects.equals(this.type, "forward")) {
                return new Forward(this);
            } else if (Objects.equals(this.type, "midfielder")) {
                return new MidFielder(this);
            } else if (Objects.equals(this.type, "defender")) {
                return new Defender(this);
            } else {
                return new Forward(this);
            }


        }
    }
        // Builder 클래스를 정의하시오. (단, static nested class 로 정의하시오.  )
    protected abstract int getSpeed();

    @Override
    public String toString() {
        return "Player Name='" + this.name + ", JerseyNumber=" + this.jerseyNumber + ", SPEED=" +
                getSpeed() + ", ";
    }

}
