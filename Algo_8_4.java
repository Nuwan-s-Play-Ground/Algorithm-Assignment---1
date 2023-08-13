public class Algo_8_4 {
   
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
            
        System.out.print("Elements in numB but not in numA: ");
    
        boolean found;
        System.out.print("[");  
        for (int num : numB) {
            found = false;
            for (int value : numA) {
                if (num == value) {
                    found = true;
                    break;
                    }
                }
                if (!found) {
                    System.out.print(num + ", ");
                }
        }
        System.out.print("\b\b]");
        System.out.println();
    }
}
    

