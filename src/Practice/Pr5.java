package Practice;

public class Pr5 {
    public static void main(String[] args) {
        String str1 = "ABABC";
        String str2 = "BABCAC";
        int endIndex = 0;
        int maxLength = 0;
        int dp[][] = new int[str1.length() + 1][str2.length() + 1]; //maxLength 계산용 저장소

        for(int i = 1; i<=str1.length();i++){
            for (int j = 1; j<=str2.length();j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if(dp[i][j] > maxLength){
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        System.out.println(str1.substring(endIndex - maxLength, endIndex));
    }
}
