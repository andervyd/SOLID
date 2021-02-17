package by.andervyd.solid.srp.modern_srp_solution;

public class DataManagerImplementation implements IDataManager {

    @Override
    public void send(String message) {
        System.out.println("data sent successfully");
    }

    @Override
    public int receive() {
        System.out.println("data receive successfully");
        return 0;
    }
}
