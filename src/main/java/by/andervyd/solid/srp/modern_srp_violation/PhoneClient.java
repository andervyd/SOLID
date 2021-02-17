package by.andervyd.solid.srp.modern_srp_violation;

public class PhoneClient {
    public static void main(String[] args) {

        IPhone phone = new Phone();

        phone.dial("555-2314-32");
        phone.send("Hello, Ben. How are you?");
        phone.receive();
        phone.disconnect();

    }
}
