public class Person implements MyMovable{
    String move;
    public Person(String move) {
        this.move = move;
    }
    public String moveBy(){
        return "나는 "+this.move+"로 출근한다.";
    }

}
