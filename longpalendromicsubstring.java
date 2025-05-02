import  java.util.*;
public class longpalendromicsubstring {
    public  static String longestPalindrome(String s) {
        char[] s1 = new char[(s.length()*2)+1];
        int index = 0;
        for(int i=0;i<s1.length;i++){
            if(i%2==0)
                s1[i] = '#';
            else{
                s1[i] = s.charAt(index);
                index++;
            }
        }
        int []arr = new int[s1.length];
        int c = 0;
        for(int i=0;i<s1.length;i++){
            int l = i-1;
            int r =i+1;
            while(l>=0&&r<s1.length&&s1[l]==s1[r]){
                c++;
                arr[i]=c;
                l--;
                r++;
            }
            c=0;
        }
        int max = 0;
        int maxindex = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                maxindex = i;
            }
        }
        char[] res = new char[(max+maxindex)/2];
        int j =0;
        for(int i=(maxindex-max);i<(max+maxindex);i++){
            if(i%2!=0){
                res[j] = s1[i];
                j++;
            }
        }
        String sa = String.valueOf(res);
        return sa;
    }
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        String s1 = longestPalindrome(s);
        System.out.print(s1);

    }   
}
