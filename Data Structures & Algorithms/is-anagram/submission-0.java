class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }else{
    //1. Sorting            
           char[] string1 = s.toCharArray();
            char[] string2 = t.toCharArray();
            Arrays.sort(string1);//aaccerr
            Arrays.sort(string2);//aaccerr                    
            // return Arrays.equals(string1, string2);

        //2. Hash Map
            HashMap<Character, Integer> countS = new HashMap<>();
            HashMap<Character, Integer> countT = new HashMap<>();
            for(int i=0; i<s.length();i++){
                countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
                countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
            }
            return countS.equals(countT);
            }
    }
}
