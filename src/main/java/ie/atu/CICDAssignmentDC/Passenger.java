package ie.atu.CICDAssignmentDC;

public class Passenger {
    private String Title;
    private String Name;
    private String ID;
    private String Phone;
    private int Age;

    public void setTitle(String title) {
        if("Mr".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title) ||"Ms".equalsIgnoreCase(title)) {
            Title = title;
        }
        else{
            System.out.println("Please enter 'Mr', 'Mrs','Ms'' ");
        }
    }

    public void setName(String name) {
        int nameSize = name.length();
        if(nameSize >= 3){
            Name = name;
        }
        else{
            System.out.println("Name can be 3 characters minimum");
        }
    }

    public void setID(String ID) {
        int idSize = ID.length();
        if(idSize >= 10){
            this.ID = ID;
        }
        else{
            System.out.println("ID can be 10 characters minimum");
        }

    }

    public void setPhone(String phone) {
        int phoneSize = Phone.length();
        if(phoneSize >= 7) {
            Phone = phone;
        }
        else{
            System.out.println("Phone be 7 characters minimum");
        }
    }

    public void setAge(int age) {
        if(age > 16) {
            Age = age;
        }
        else {
            System.out.println("Passenger needs to be over 16 to fly");
        }
    }
}
