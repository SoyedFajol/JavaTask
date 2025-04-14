import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Day02 {
    public static void main(String[] args) {
        List<String>  names= new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("alice");

        System.out.println("Names in the list:");
        for(String name:names){
            System.out.println(name);
        }

        List<String> names2= new ArrayList<>(List.of("Alice","Bob", "Alice"));

        Iterator<String> it = names2.iterator();
        while(it.hasNext()){
            String name=it.next();
            

        }


        
    }
}
