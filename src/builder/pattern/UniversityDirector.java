package builder.pattern;

public class UniversityDirector {

    private UniversityBuilder builder;

    public UniversityDirector(UniversityBuilder builder) {
        this.builder = builder;
    }

    public void constructUniversity() {
        builder.buildFaculty("Faculty of Engineering");
        builder.buildDepartment("Department of Software Engineering");
        builder.buildCourse("Design Patterns");
        builder.buildCourse("Software Architecture");
    }
}
