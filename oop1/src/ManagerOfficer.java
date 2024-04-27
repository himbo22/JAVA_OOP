import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ManagerOfficer {
    private List<Officer> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }

    public void addOfficer(Officer officer) {
        this.officers.add(officer);
    }

    public List<Officer> searchName(String name) {
        return this.officers.stream().filter(officer ->
                officer.getFullName().contains(name)
        ).collect(Collectors.toList());
    }

    public void showList() {
        this.officers.forEach(officer ->
                System.out.println(officer.toString())
        );
    }
}
