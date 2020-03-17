import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

/**
 * Test
 */
public class Test {

    String name;
    int length;
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        List<String> list2 = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add(String.valueOf(5));
        list.add(10 + "");

        for(String name : list){
            System.out.println(name);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        Test test = new Test();
        test.name = "My Test name";
        test.length = "30 days";

        Test test2 = new Test();
        test2.name = "My Second Test";

        Test[] testArray = new Test[5];

        testArray[4] = new Test();

        List<Test> myList = new ArrayList<>();

    }
}