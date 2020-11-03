public class Manager extends Employee {
    @Override
    public String getDesignation() {
        return "MANAGER";
    }

    @Override
    public String getNextDesignation() {
        return "DIRECTOR";
    }
}
