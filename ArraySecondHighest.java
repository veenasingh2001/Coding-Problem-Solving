class ArraySecondHighest {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1, 4}; // Example array
        int secondHighest = findSecondHighest(array);
        
        System.out.println("Second highest number is: " + secondHighest);
    }

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest && i < highest) { // Ensure it's not equal to highest
                secondHighest = i;
            }
        }

        // Handle case where there is no second highest
        if (secondHighest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array must contain at least two distinct elements.");
        }

        return secondHighest;
    }
}
