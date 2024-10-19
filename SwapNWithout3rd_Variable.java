public class SwapNWithout3rd_Variable {

public static void main(String[] args) {
	int num1 = 15;
	int num2 = 26;

    System.out.println("num1 is = " + num1 + " and num2 is = " + num2);

	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1- num2;

    System.out.println("After swapping, num1 is " + num1 + " and num2 is " + num2);
    }

}