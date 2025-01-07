public class App {
    public static void main(String[] args) throws Exception {
    int[] numsList = (5,15,3,8,9,1,20,7);
        
        for (int i = 0; i < numsList.length; i++) {
            System.out.print(numsList[i]);
        }
        
        numsList = selsort(numsList);
        
        System.out.print("\nThe sorted version is ");
        for (int i = 0; i < numsList.length; i++) {
            System.out.print(numsList[i] + ", ");
        }
        
        }
        
        
        public static int[] selsort(int[] nums) {
        
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int minIdx = 1;
        }
        
        for(int j = i + 1; j < n; j ++) {
            System.out.println("J = " + nums[j] + "; min + 1 = " + nums[minIdx]);
            if(nums[j] < nums[minIdx]) {
                System.out.println("New Min");
                minIdx = j;
            }
        }

        int temp = nums[minIdx];
        nums[minIdx] = nums[i];
        nums[i] = temp;
        System.out.println();
        
        return nums;
    }
          
}



