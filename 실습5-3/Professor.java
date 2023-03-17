import java.util.Objects;

public class Professor extends Person{
    private String name;
    private int age;
    private String address;
    private String schoolName;
    private String major;
    public Professor(String name, int age, String address,String schoolName,String major) {
        super(name, age, address);
        this.schoolName=schoolName;
        this.major=major;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName =schoolName;
    }
    public void setMajor(String major) {
        this.major =major;
    }
    public String schoolName() {
        return this.schoolName;
    }
    public String  major(){
        return this.major;
    }

    public String toString() {
        return String.format("%s, %d, %s, %s, %s",
                getName(), getAge(), getAddress(), schoolName, major) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return age == professor.age && Objects.equals(name, professor.name) && Objects.equals(address, professor.address) && Objects.equals(schoolName, professor.schoolName) && Objects.equals(major, professor.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, address, schoolName, major);
    }
}
