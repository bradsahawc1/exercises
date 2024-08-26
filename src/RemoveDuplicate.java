import java.util.*;

public class RemoveDuplicate {
    
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++)
            if (!temp.contains(list.get(i)))
                temp.add(list.get(i));

        list.clear();
        for (int i = 0; i < temp.size(); i++)
            list.add(temp.get(i));
    }
    public void test1() {
        Integer array[] = {35, 5, 3, 5, 6, 4, 33, 2, 2, 4};
        ArrayList<Integer> m = new ArrayList<>(Arrays.asList(array));;
        
        removeDuplicate(m);
        
        System.out.println(m.toString().equals("[35, 5, 3, 6, 4, 33, 2]"));
    }
    
    public static void main(String[] args) {
        RemoveDuplicate t = new RemoveDuplicate();
        t.test1();
    }
}

/** Make the code to return true
 true
*/
