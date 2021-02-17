package by.andervyd.solid.srp.modern_srp_solution;

public class ConnectionManagerImplementation implements IConnectionManager {

    @Override
    public void dial(String phoneNumber) {
        System.out.println("connected established");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");
    }
}
