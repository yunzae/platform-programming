import java.util.Objects;

public class Grade {
    public static final int FRESH = 1 ;
    public static final int SOPHOMORE = 2 ;
    public static final int JUNIOR = 3 ; 
    public static final int SENIOR = 4 ;
    private int grade ;
    public Grade() { this.grade = FRESH ; }
    public Grade(int grade) { this.grade = grade ; }
    public int getGrade() { return grade ; }
    public void upGrade() { if ( grade != SENIOR ) grade ++ ; }
    @Override
    public String toString() { return String.valueOf(grade); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Grade grade1 = (Grade) o;
        return grade == grade1.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade);
    }
}