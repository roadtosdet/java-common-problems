package Function;

public class RegistrationModel {
    public String name;
    public String email;
    public String password;
    public String phoneNumber;
    public RegistrationModel(){

    }
    public RegistrationModel(String name, String email, String password, String phoneNumber){
        this.name=name;
        this.email=email;
        this.password=password;
        this.phoneNumber=phoneNumber;
    }
    public static void main(String[] args) {
        
    }

    public RegistrationModel doRegistr(){
        RegistrationModel registrationModel=new RegistrationModel();
        registrationModel.name="Salman Rahman";
        registrationModel.email="salman@test.com";
        registrationModel.password="1234";
        registrationModel.phoneNumber="01504454544";
        return registrationModel;
    }
    
    
}
