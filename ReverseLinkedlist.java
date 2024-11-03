
import java.util.LinkedList;

public class ReverseLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println("Original LinkedList: " + ll);

        LinkedList<Integer> ll1 = new LinkedList<>();
        
        // Reverse the original LinkedList
        ll.descendingIterator().forEachRemaining(ll1::add);

        System.out.println("Reversed LinkedList: " + ll1);
    }
}
