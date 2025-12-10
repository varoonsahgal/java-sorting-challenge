public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.age        = age;
    }

    @Override
    public int compareTo(Person other) {
        // 1. Compare by last name

        /*
        This compares 2 DIFFERENT PERSON Objects in the array
        When you call SORT - the sort algorithm is REPEATEDLY taking
        2 Person objects from the array and asking "Which one comes first??"
        - we DO NOT have to worry about which 2 objects, we just HAVE TO FULFILL the contract

        WHY do we have to define this?  BECAUSE Java does NOT know how to compare
        TWO person objects - because Person is a class created by YOU-  so YOU have to
        define the "natural ordering" - ie what comes before what

        In this line we call compareTo:   int lastCmp = this.lastName.compareTo(other.lastName);
        is that a recursive call? NO - we are calling the STRING class compareTo - not our
        OWN definition, and the string class compareTo will just compare 2 strings
        like "Dog" and "Cat", and "Cat" will come before "Dog"


         */
        int lastCmp = this.firstName.compareTo(other.firstName);
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
