package edu.pnu.collection;

import edu.pnu.admin.Student;

import java.util.Arrays;
import java.util.Objects;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data= new Object[DEFAULT_SIZE];
    private int count = 0;



    public void add(Student student) {
        data[count] = student;
        count++;
    }

    public void removeAll() {
        for (Object s : data) {
            data = null;
            count = 0;
        }
    }

    public boolean find(T st) {
        for (Object s : data){
            if (Objects.equals(s,st)){
                return true;
            }

        }
        return false;
    }

    @Override
    public String toString() {
        String msg ="";
        for (Object st: data){
            if(st!=null)  msg +=st.toString();
        }
        return msg;
    }
}
