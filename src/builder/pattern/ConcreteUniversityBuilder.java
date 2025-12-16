package builder.pattern;

public class ConcreteUniversityBuilder implements UniversityBuilder {

    private UniversityStructure universityStructure;

    public ConcreteUniversityBuilder() {
        universityStructure = new UniversityStructure();
    }

    @Override
    public void buildFaculty(String faculty) {
        universityStructure.addFaculty(faculty);
    }

    @Override
    public void buildDepartment(String department) {
        universityStructure.addDepartment(department);
    }

    @Override
    public void buildCourse(String course) {
        universityStructure.addCourse(course);
    }

    @Override
    public UniversityStructure getResult() {
        return universityStructure;
    }
}
