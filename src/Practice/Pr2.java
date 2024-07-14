package Practice;

public class Pr2 {
    public static void main(String[] args) {
        int[] nums2 = {3,2,5,7,11};
        int target2 = 9;
        int[] result2 = findIndices(nums2, target2);
        System.out.println("["+result2[0]+", "+result2[1]+ "]");
    }
    static int[] findIndices(int[] arr, int t){
        for(int i =0 ;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] + arr[j] == t){
                    int[] ret = {i,j};
                    return ret;
                }
            }
        }
        return null;
    }
}
