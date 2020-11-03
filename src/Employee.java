public abstract class Employee {
    private int age;
    private String name;
    private float salary;
    private String designation;
    private boolean activeInd;

    public String getDesignation() {
        return this.designation;
    }

    public abstract String getNextDesignation();

    public void promote(int increment) {
        this.designation = getNextDesignation();
        this.salary += this.salary * increment / 100.0f;
    }

    public void evict() {
        this.activeInd = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setActiveInd(boolean activeInd) {
        this.activeInd = activeInd;
    }

    @Override
    public String toString() {
        if (activeInd)
            return "Name: " + name + ", Age: " + age + ", Salary: " + salary + ", Designation: " + designation;
        return "Employee Details Unavailable as employee is evicted";
    }
}
