class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1 =0;
        int p2 =0;
        int length1 =word1.length();
        int length2=word2.length();
        int minLength =Math.min(length1,length2);
        String result="";
        for(int i=0;i<minLength;i++){
            result+=word1.charAt(p1);
            result+=word2.charAt(p2);
            p1++;
            p2++;
        }
        if(length1>length2){
           result+=word1.substring(minLength,length1);
        }
        else{
            result+=word2.substring(minLength,length2);
        }
        return result;
    }
}