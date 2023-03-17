import static java.util.Objects.hash;

public class Employee {
    //Your code here - 멤버 변수를 정의하시오
    String name;
    Double pay;
    //Your code here - 생성자를 정의하시오
    public Employee(String name, Double pay){
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return this.name;
        //Your code here

    }

    public Double getSalary() {
        //Your code here
        return this.pay;
    }

    @Override
    public String toString() {
        //Your code here
        return this.name.toString()+" "+this.pay.toString();
    }

    @Override
    public boolean equals(Object o) {
        return (this.name.equals(((Employee) o).name))&&(this.pay.equals(((Employee) o).pay));

    }


    @Override
    public int hashCode() {
        return (int) hash(this.name,this.pay);
    }

}