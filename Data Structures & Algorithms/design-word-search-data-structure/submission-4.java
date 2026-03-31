class Trie{
    Trie[] children;
    boolean isend;
    Trie(){
        children = new Trie[26];
        isend = false;
    }
}
class WordDictionary {
    private Trie root;
    public WordDictionary() {
    root = new Trie();
    } 

    public void addWord(String word) {
       Trie cur = root;
       for(char c : word.toCharArray()){
        if(cur.children[c-'a']==null) {
        cur.children[c-'a'] = new Trie();
        }
         cur = cur.children[c-'a'];
       }
       cur.isend=  true;
    }

    public boolean search(String word) {
    return dfs(word ,0,root);
    }
    private boolean dfs(String word , int j,Trie root){
        Trie cur = root;
        for (int i =j;i<word.length();i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(Trie child : cur.children){
                    if(child!=null&&dfs(word,i+1,child)){
                        return true ;
                    }
                }
                return false ;
            }else {
                if(cur.children[c-'a']==null) return false;
               cur=cur.children[c-'a'];         
            } 
        }
        return cur.isend;
    }
}
