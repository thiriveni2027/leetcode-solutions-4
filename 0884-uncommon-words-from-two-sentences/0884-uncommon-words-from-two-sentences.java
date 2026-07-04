class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer>map=new HashMap<>();
        String a1[]=s1.split(" ");
        String a2[]=s2.split(" ");
        for(String word:a1){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for(String word:a2){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        List<String>result=new ArrayList<>();
        for(String word:map.keySet()){
            if(map.get(word)==1){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
        
    }
}