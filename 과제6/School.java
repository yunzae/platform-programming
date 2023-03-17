package edu.pnu.admin;

import edu.pnu.collection.GenericList;

public class School {
    private final String name;
    private final int size;
    private GenericList<Student> students = new GenericList<Student>();

    public School(String name,int size) {
        this.name = name;
        this.size = size;

    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeAllStudent(){
        students.removeAll();
    }
    public Student findStudent(String studentName,int schoolYear){
        Student st= new Student(studentName,schoolYear);
        if(students.find(st)){
            return st;
        }
        return null;

    }

    @Override
    public String toString() {
        return students.toString() ;
    }
}
