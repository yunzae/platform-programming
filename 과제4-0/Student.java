import static java.util.Objects.hash;

public class Student{
    private String name;
    private int year;

    public Student(String name,int year){
        //생성자
        this.name = name;
        this.year = year;
    }

    public boolean equals(Object o) {
        if(this == (Student)o)
            return true;
        if((Student)o == null)
            return false;
        return (this.name.equals(((Student) o).name))&&(this.year==((Student) o).year);

    }
    public int hashcode(){
        return (int) hash(this.name,this.year);
    }
    @Override
    public String toString(){
        String msg = "["+this.name+", "+this.year+"]";
        return msg;
    }

}