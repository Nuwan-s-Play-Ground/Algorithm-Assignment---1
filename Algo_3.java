public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        
        int[] reversedArray = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            reversedArray[i] = nums[nums.length - 1 - i];
        }
        
        nums = reversedArray;
        
        System.out.print("nums array after reversing: ");
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
