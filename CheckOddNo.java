
import java.util.List;

class CheckOddNo{
    public static boolean onlyOddNumbers(List<Integer> list) {
	for (int i : list) {
		if (i % 2 == 0)
			return false;
	}

	return true;
}
public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9);
        System.out.println(onlyOddNumbers(numbers)); // Output: true

        List<Integer> numbersWithEven = List.of(1, 2, 3, 5);
        System.out.println(onlyOddNumbers(numbersWithEven)); // Output: false
    }
}