public class Author {
    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {

        return "Name: " + getName() + " Surname: " + getSurname() + " Age: " + getAge();
    }
}
