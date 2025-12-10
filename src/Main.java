import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> myFamily = new ArrayList<>();

        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        // SORT using the natural ordering defined in compareTo()
        // collections is able to sort this list ONLY because
        // we are fulfilling a contract wherein we implent the Comparable<Person> interface
        // and implement compareTo!
        // Sort will invoke YOUR compareTo implementation and then sort using whatever algorithm...
        Collections.sort(myFamily);

        // DISPLAY RESULTS
        for (Person p : myFamily) {
            System.out.println(p);
        }
    }
}
