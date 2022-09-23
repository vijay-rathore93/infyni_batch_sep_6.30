package mapExamples.customClasses.case2_OverideEqualsMethodOnly;

import java.util.HashMap;
import java.util.Map;

public class TestCatalog {

    public static void main(String[] args) {
        Catalog catalog = new Catalog(1, "Soap");
        Catalog catalog2 = new Catalog(2, "Toy");
        Catalog catalog3 = new Catalog(2, "Toy");

        Map<Catalog, String> map = new HashMap<>();
        map.put(catalog, "A");
        map.put(catalog2, "B");//what will be size
        map.put(catalog2, "D");//what will be size
        map.put(catalog3, "C");//what will be size

        System.out.println("Size of map::"+map.size());

        System.out.println("content::"+map);


    }
}

//in this case,equal mehod check equallity on the basis of properties defined inside class  but hashcode is not overridden coz of that
// line no
 //map.put(catalog2, "B");//what will be size
    //     map.put(catalog2, "D");//what will be size

//will have same address and same hashcode.
