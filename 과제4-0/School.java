import static java.util.Objects.hash;

public class School{
	private String name;
	private int limit;

	private Student[] student;
	private int studentCount;

	public School(String name, int limit){
		this.name = name;
		this.limit = limit;
		student = new Student[limit];
		studentCount = 0;
	}

	public String toString(){
		String msg = "School Name: "+name+" StudentCount: "+studentCount+"\n";
		for (int i =0;i<studentCount;i++){
			msg+= "\t"+student[i]+"\n";
		}
		return msg;
	}
	public boolean equals(Object o) {
		return (this.name.equals(((School) o).name))&&(this.limit==((School) o).limit)&&(this.studentCount==((School) o).studentCount);

	}
	public int hashcode(){
		return (int) hash(this.name,this.limit);
	}
	public Student findStudent(String studentName,int schoolYear){
		Student temp_student=new Student(studentName,schoolYear);
		for(int i=0;i<student.length;i++){
			if (this.student[i].equals(temp_student)){
				return student[i];
			}
		}
		return null;


	}
	public void addStudent(Student newStudent){

		studentCount++;
		student[studentCount-1] = newStudent;
	}
	public void removeAllStudent(){
		for (int i=0;i<studentCount;i++){
			this.student[i] = null;
		}
		studentCount=0;
	}



}