package by.andervyd.solid.srp.modern_srp_solution;

public class PhoneClient {
    public static void main(String[] args) {

        Phone phone = new Phone(new ConnectionManagerImplementation(), new DataManagerImplementation());

        phone.dial("555-2314-32");
        phone.send("Hello, Ben. How are you?");
        phone.receive();
        phone.disconnect();

    }
}
