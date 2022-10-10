package sk.akademia.persons;

public class Employee extends Person {
    private String jobTitle;
    private int yearsOfExperience;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
