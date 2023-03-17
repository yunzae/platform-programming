public class MyArrayList<T>{
    // your code here
    Object[] elementData;
    int count=0;
    public MyArrayList(int capacity) {
        if (capacity > 0) {
            this.elementData = new Object[capacity];
        }
        // your code here


    }



    public void add(T data) {
        this.elementData[count] = data;
        count+=1;
        // your code here

    }



    public T get(int index) {

        // your code here
        return (T)this.elementData[index];
    }

}
