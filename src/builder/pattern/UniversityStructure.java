package builder.pattern;

import java.util.ArrayList;
import java.util.List;

public class UniversityStructure {

    private List<String> faculties = new ArrayList<>();
    private List<String> departments = new ArrayList<>();
    private List<String> courses = new ArrayList<>();

    public void addFaculty(String faculty) {
        faculties.add(faculty);
    }

    public void addDepartment(String department) {
        departments.add(department);
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void displayStructure() {
        System.out.println("University Structure:");
        System.out.println("Faculties: " + faculties);
        System.out.println("Departments: " + departments);
        System.out.println("Courses: " + courses);
    }
}
