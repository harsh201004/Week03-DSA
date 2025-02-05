package linearsearch.searchword;

public class WordSearch {
    public static String wordSearch(String arr [], String target){
            for(int i = 0; i<arr.length; i++){
                String res [] = arr[i].split(" ");
                for(int j = 0; j<res.length;  j++){
                    if(res[j].equalsIgnoreCase(target)){
                        return arr[i];
                    }
                }
            }
            return "Not found";
    }
}