public class Algo_2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};
        
        int smallest = nums[0]; 
        int largest = nums[0];  
        
        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
