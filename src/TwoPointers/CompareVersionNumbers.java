package TwoPointers;

public class CompareVersionNumbers {
    public int compareVersion(String version1,String version2){
        int left=0;
        int right=0;
        while(left<version1.length()||right <version2.length()){
            int num1=0;
            while(left<version1.length() && version1.charAt(left)!='.' ){
                num1=(num1*10)+(version1.charAt(left)-'0');
                left++;
            }
            int num2=0;
            while(right<version2.length() && version2.charAt(right)!='.' ){
                num2=(num2*10)+(version2.charAt(right)-'0');
                right++;
            }
            if(num1>num2){
                return 1;
            }
            if(num1<num2){
                return -1;
            }
            left++;
            right++;
        }
        return 0;
    }

    static void main() {
        String v1="1.02";
        String v2="1.001";
        CompareVersionNumbers obj=new CompareVersionNumbers();
        System.out.println(obj.compareVersion(v1,v2));
    }
}
