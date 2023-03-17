public class IntTypeData extends SpecificTypeData<Integer> {
    public IntTypeData(Integer data) {
        super(data);
    }

    public void addData(Integer data){
        this.data+=data;
    }
}