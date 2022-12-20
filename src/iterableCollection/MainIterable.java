package iterableCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterable {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Andi Dwi", "Lindhu Parang", "Ryzaldi Ananda");
        /*
        for(var name: names){
            System.out.println(name);
        }
        */
        // iterator
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        Iterable<Person> persons = Arrays.asList(
                new Person(1,"Andi","Bekasi"),
                new Person(2,"Lindhu","Malang"),
                new Person(3,"Aldi","Jakarta")
        );

        /*
        for (var peson: persons){
            System.out.println(peson);
        }*/
        Iterator<Person> personIterator = persons.iterator();
        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }
    }
}

