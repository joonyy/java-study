package Practice;

public class Pr1 {
    public static void main(String[] args) {
        int[] nums1 = {2,5,8,3,7};
        System.out.println(sumLessThan(nums1,5));
    }
    static int sumLessThan(int[] arr, int num){
        int ret = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] < num) ret += arr[i];
        }
        return ret;
    }
}
