//https://leetcode.com/problems/reverse-string/solutions/80937/java-simple-and-clean-with-explanations-6-solutions/

class Solution {
    public String reverseString(char[] name) {
        // char[] name = s.toCharArray();
        int i=0;
        int j = name.length -1;

        for(;i<j;i++,j--){
            char temp = name[i];
            name[i] = name[j];
            name[j] = temp;
        }
        return new String(name);
 
    }
}