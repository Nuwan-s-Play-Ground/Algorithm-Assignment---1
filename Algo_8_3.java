public class Algo_8_3 {
   
    public static void main(String[] args) {

        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
            
        System.out.print("Elements in numA but not in numB: ");
      
        boolean found;
        System.out.print("[");    
        for (int num : numA) {
            found = false;
            for (int value : numB) {
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
