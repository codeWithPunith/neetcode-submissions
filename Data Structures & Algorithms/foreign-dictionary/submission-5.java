class Solution {
    List<Character> res = new ArrayList<>();
    HashSet<Character> visited = new HashSet<>();
    HashSet<Character> path = new HashSet<>();
   class Pair{
        char node;
        List<Character> neighbors ;
        Pair(char c ){
            this.node =c;
            neighbors = new ArrayList<>();
        }
    }
    public String foreignDictionary(String[] words) {
      String s = "abcdefghijklmnopqrstuvwxyz";
      HashMap<Character,Pair> map = new HashMap<>();
      HashSet<Character> nodes = new HashSet<>();
      for(char c : s.toCharArray()){
          map.put(c,new Pair(c));
      }
      for(String word : words){
    for(char c : word.toCharArray()){
        nodes.add(c);
    }
}
      List<List<Pair>> adj = new ArrayList<>();
      for(int i=0;i<words.length-1;i++){
        String w1 = words[i];
        String w2 = words[i+1];
       if(w1.length() > w2.length() && w1.startsWith(w2)){
     return "";
    }
        int len = Math.min(w1.length(),w2.length());
        for(int j=0;j<len;j++){
            if(w1.charAt(j)!=w2.charAt(j)){
                map.get(w1.charAt(j)).neighbors.add(w2.charAt(j));
                break;
            }
        }
      }
      
      for(char c : nodes){
          if(!dfs(c, map)){
        return "";
    }
      }
      return new StringBuilder(res.stream().map(String::valueOf).collect(Collectors.joining())).reverse().toString();
    }

    boolean dfs(char c,HashMap<Character, Pair> map){
        if(path.contains(c)) return false;
        if(visited.contains(c)) return true;
        path.add(c);
        visited.add(c);
        for(char nei : map.get(c).neighbors){

        if(!dfs(nei, map)){
            return false;
        }
    }

    path.remove(c);

    res.add(c);
    return true;
    }
}
