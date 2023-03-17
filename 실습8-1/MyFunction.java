@FunctionalInterface
public interface MyFunction {
    public void run();
    public static MyFunction getMyFunction(String functionName){
        MyFunction f = new MyFunction() {
            @Override
            public void run() {
                System.out.println(functionName+".run()");
            }
        };
        return f;
    }
    default void sayHello(){
        System.out.println("Hello");
    }





}
