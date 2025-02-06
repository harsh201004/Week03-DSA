package linearsearch.searchword;

import org.junit.Test;
import static org.junit.Assert.*;

public class SearchWordTest {
    @Test
    public void test() {
        String[] arr = new String[]{"Hello guys", "Hello java", "Hello bro"};
        String searchWord = "java";
        assertEquals("Hello java", WordSearch.wordSearch(arr, searchWord));
    }
}
