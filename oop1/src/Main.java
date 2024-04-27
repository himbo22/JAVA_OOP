import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();

        while (true) {
            System.out.println("1. Insert Officer");
            System.out.println("2. Searching by name");
            System.out.println("3. Show Officer list");
            System.out.println("4. Exit");
            System.out.print("Enter your option : ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": {
                    System.out.println("a. Add Worker");
                    System.out.println("b. Add Engineer");
                    System.out.println("c. Add Staff");
                    System.out.print("Enter your type : ");

                    String type = scanner.nextLine();

                    switch (type) {
                        case "a": {
                            System.out.print("Enter Worker name : ");
                            String name = scanner.nextLine();
                            System.out.print("Enter Worker age : ");
                            int age = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Worker gender : ");
                            String gender = scanner.nextLine();
                            System.out.print("Enter Worker address : ");
                            String address = scanner.nextLine();
                            System.out.print("Enter Worker level : ");
                            int level = scanner.nextInt();
                            Worker worker = new Worker(name, age, gender, address, level);
                            managerOfficer.addOfficer(worker);
                            scanner.nextLine();
                            break;
                        }
                        case "b": {
                            System.out.print("Enter Engineer name : ");
                            String name = scanner.nextLine();
                            System.out.print("Enter Engineer age : ");
                            int age = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Engineer gender : ");
                            String gender = scanner.nextLine();
                            System.out.print("Enter Engineer address : ");
                            String address = scanner.nextLine();
                            System.out.print("Enter Engineer branch : ");
                            String branch = scanner.nextLine();
                            Engineer engineer = new Engineer(name, age, gender, address, branch);
                            managerOfficer.addOfficer(engineer);
                            break;
                        }
                        case "c": {
                            System.out.print("Enter Staff name : ");
                            String name = scanner.nextLine();
                            System.out.print("Enter Staff age : ");
                            int age = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Staff gender : ");
                            String gender = scanner.nextLine();
                            System.out.print("Enter Staff address : ");
                            String address = scanner.nextLine();
                            System.out.print("Enter Staff task : ");
                            String task = scanner.nextLine();
                            Staff staff = new Staff(name, age, gender, address, task);
                            managerOfficer.addOfficer(staff);
                            break;
                        }
                        default: {
                            System.out.println("Invalid");
                            break;
                        }
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter a name which you wanna find out : ");
                    String name = scanner.nextLine();
                    managerOfficer.searchName(name).forEach(officer ->
                            System.out.println(officer.toString())
                    );
                    break;
                }
                case "3": {
                    managerOfficer.showList();
                    break;
                }
                case "4": {
                    return;
                }
                default: {
                    continue;
                }
            }
        }
    }
}