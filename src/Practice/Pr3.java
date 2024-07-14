package Practice;

public class Pr3 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
    static int search(int[]arr, int t){
        int ret = -1;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == t) ret = i;
        }
        return ret;
    }
}

