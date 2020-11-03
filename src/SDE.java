public class SDE extends Employee {
    public SDE(String name, int age, float salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setActiveInd(true);
    }

    @Override
    public String getNextDesignation() {
        return "SDE2";
    }
}
