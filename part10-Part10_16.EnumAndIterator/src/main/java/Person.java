/*
Make a class Person. 
The Person constructor takes a name and the education as parameters. 
A Person has a method public Education getEducation(), which returns the education of the person. 
A Person also has a toString -method which works as follows:
 */
public class Person {

    private String name;
    private Education title;

    public Person(String name, Education edu) {
        this.name = name;
        this.title = edu;
    }

    public Education getEducation() {
        return this.title;
    }

    @Override
    public String toString() {
        return name + ", " + title;
    }

}
