# Builder Pattern –Java Code 

This project is a Java implementation of the Builder Pattern using a simple University structure. The program builds a university by adding faculties, departments, and courses step by step.

The project contains the following classes:
UniversityStructure.java (stores faculties, departments, and courses),
UniversityBuilder.java (builder interface),
ConcreteUniversityBuilder.java (implements the builder),
UniversityDirector.java (controls the building process),
BuilderPattern.java (main class to run the program).

To run the program using NetBeans, open the project, right-click BuilderPattern.java, and select Run File.

To run using the command line, open a terminal in the project folder and run:
javac src/builder/pattern/*.java
java builder.pattern.BuilderPattern

Output:
University Structure:
Faculties: [Faculty of Engineering]
Departments: [Department of Software Engineering]
Courses: [Design Patterns, Software Architecture]
