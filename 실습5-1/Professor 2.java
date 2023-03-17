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

    public String toString() {
        return String.format("%s, %d, %s, %s, %s",
                getName(), getAge(), getAddress(), schoolName, major) ;
    }
}
