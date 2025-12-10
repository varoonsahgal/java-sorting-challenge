public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.age        = age;
    }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public int getAge()          { return age; }

    @Override
    public int compareTo(Person other) {
        // 1. Compare by last name
        int lastCmp = this.lastName.compareTo(other.lastName);
        if (lastCmp != 0) {
            return lastCmp;   // if not equal, this determines order
        }

        // BONUS: if last names are the same, compare by first name
        return this.firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (age " + age + ")";
    }
}
