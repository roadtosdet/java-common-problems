package Function;

public class MyCustomer {
    public static void main(String[] args) {
        RegistrationModel registrationModel = new RegistrationModel();
        RegistrationModel user = registrationModel.doRegistr();
        System.out.println("Name: " + user.name);
        System.out.println("Email: " + user.email);
        System.out.println("Password: " + user.password);
        System.out.println("Phone Number: " + user.phoneNumber);

    }

}
