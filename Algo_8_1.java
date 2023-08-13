public class Algo_8_1 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        
        System.out.print("Intersection of numA and numB: ");
        System.out.print("[");
       
        for (int num1 : numA) {
            for (int num2 : numB) {
                if (num1 == num2) {
                    System.out.print(num1 + ", ");
                    break; // Move to the next element in arr1
                }
            }
        }
        System.out.print("\b\b]");
    }
}
