public class Staff extends Officer {
    private String task;

    public Staff(String fullName, int age, String gender, String address, String task) {
        super(fullName, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String toString() {
        return "Staff{" +
                "task='" + task + '\'' +
                ", name='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
