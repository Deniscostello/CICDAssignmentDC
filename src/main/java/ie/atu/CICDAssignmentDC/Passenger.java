package ie.atu.CICDAssignmentDC;

public class Passenger {
    private String Title;
    private String Name;
    private String ID;
    private int Phone;
    private int Age;

    public void setTitle(String title) {
        if("Mr".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title) ||"Ms".equalsIgnoreCase(title)) {
            Title = title;
        }
        else{
            System.out.println("Please enter ");
        }
    }

    public void setName(String name) {
        Name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public void setAge(int age) {
        Age = age;
    }
}
