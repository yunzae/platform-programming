

class Actor implements Runnable {
    private String name;
    private Counter counter;

    public Actor(String name, Counter counter){
        this.name = name;
        this.counter = counter;
    }
    @Override
    public  void run() {
        synchronized (Actor.class) {
            System.out.println("start");
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
            System.out.println("end");
        }
    }
}