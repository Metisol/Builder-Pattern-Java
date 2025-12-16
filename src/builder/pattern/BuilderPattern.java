package builder.pattern;

public class BuilderPattern {

    public static void main(String[] args) {

        UniversityBuilder builder = new ConcreteUniversityBuilder();
        UniversityDirector director = new UniversityDirector(builder);

        director.constructUniversity();

        UniversityStructure university = builder.getResult();
        university.displayStructure();
    }
}
