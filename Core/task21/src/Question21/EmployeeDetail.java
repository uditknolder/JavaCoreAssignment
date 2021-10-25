package Question21;

public class EmployeeDetail {
    private String name;
    private int id;
    private String designation;
    public EmployeeDetail(String name,int id,String designation) {
        this.name = name;
        this.id=id;
        this.designation=designation;
    }

    public String getName(){
        return name;
    }
    public int getId()
    {
        return id;
    }
    public String getDesignation()
    {
        return designation;
    }
}
