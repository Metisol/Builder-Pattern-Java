package builder.pattern;

public interface UniversityBuilder {

    void buildFaculty(String faculty);
    void buildDepartment(String department);
    void buildCourse(String course);

    UniversityStructure getResult();
}
