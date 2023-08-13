public class Algo_8_2 {
    public static void main(String[] args) {
      
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
                    
        System.out.print("Union of numA and numB: ");
                    
        int[] union = new int[numA.length + numB.length];
        int index = 0;
                    
        for (int num : numA) {
            union[index] = num;
            index++;
        }
                    
        for (int num : numB) {
            boolean found = false;
            for (int value : union) {
                if (value == num) {
                    found = true;
                    break;
                    }
                }
                if (!found) {
                    union[index] = num;
                    index++;
                }
        }

        System.out.print("[");          
        for (int i = 0; i < index; i++) {
            System.out.print(union[i] + ", ");
        }
        System.out.print("\b\b]");
        System.out.println();
    }
                    
}
