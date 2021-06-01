public class Staff extends Person{
    private String school;
    private double salary;

    public Staff(String name, String address, String school, double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    public String getSchool() { return school; }

    public double getSalary() { return salary; }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff[" +
                super.toString() +
                ", school='" + school + '\'' +
                ", salary='" + salary + '\'' +
                "]";
    }
}
