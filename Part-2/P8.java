public class P8 {

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        System.out.println(arrayCount9(new int[]{1, 2, 9}));        
        System.out.println(arrayCount9(new int[]{1, 9, 9}));        
        System.out.println(arrayCount9(new int[]{1, 9, 9, 3, 9}));  
    }
}
