public class Engineer extends Officer {
    private String branch;

    public Engineer(String fullName, int age, String gender, String address, String branch) {
        super(fullName, age, gender, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String toString() {
        return "Engineer{" +
                "branch='" + branch + '\'' +
                ", name='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
