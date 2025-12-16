🎓 Builder Pattern – Java Implementation (University Academic Structure)

This project demonstrates the **Builder Pattern** in Java using a simple **University Academic Structure**.  
The program constructs a university step by step by adding **faculties**, **departments**, and **courses**.

---

## 📂 Project Files

- **`UniversityStructure.java`** – Stores the university data (faculties, departments, courses)  
- **`UniversityBuilder.java`** – Builder interface defining the construction steps  
- **`ConcreteUniversityBuilder.java`** – Implements the builder logic  
- **`UniversityDirector.java`** – Controls the building process  
- **`BuilderPattern.java`** – Main class to run the program  

---

## ▶ How to Run

**Using NetBeans:**  
1. Open the project in NetBeans  
2. Right-click `BuilderPattern.java`  
3. Select **Run File**

Using Command Line: 
'bash'
javac src/builder/pattern/*.java
java builder.pattern.BuilderPattern

🖥 Expected Output

University Structure:
Faculties: [Faculty of Engineering]
Departments: [Department of Software Engineering]
Courses: [Design Patterns, Software Architecture]
