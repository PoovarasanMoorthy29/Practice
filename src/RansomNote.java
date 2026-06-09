package src;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] r=new int[26];
        int [] m=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            r[ransomNote.charAt(i) - 'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            m[magazine.charAt(i) - 'a']++;
        }
        for(int i=0;i<r.length;i++){
            if(r[i]>m[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String r="aa";
        String m="aab";
        RansomNote obj=new RansomNote();
        System.out.println(obj.canConstruct(r,m));
    }
}
