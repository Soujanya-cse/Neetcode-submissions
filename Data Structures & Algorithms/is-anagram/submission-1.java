class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();

        for(char i:s.toCharArray()){
            if(h1.containsKey(i)){
                int x=h1.get(i);
                h1.put(i,x+1);
            }
            else{
                h1.put(i,1);
            }
        }

        for(char i:t.toCharArray()){
            if(h2.containsKey(i)){
                int x=h2.get(i);
                h2.put(i,x+1);
            }
            else{
                h2.put(i,1);
            }
        }

        if(h1.size()!=h2.size()){
            return false;
        }

        for(char i:h1.keySet()){
            if(!h2.containsKey(i)){
                return false;
            }

            else if(!h2.get(i).equals(h1.get(i))){
                return false;
            }

            
        }
        return true;
    }
}
