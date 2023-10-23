package ariefbelajarteknologi.javasequencedcollection;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {

    @Test
    void map() {
        SequencedMap<String, String> map = new TreeMap<>();
        map.put("c", "Hermawan");
        map.put("b", "Karditya");
        map.put("a", "Arief");

        assertEquals("Arief", map.firstEntry().getValue());
        assertEquals("Hermawan", map.lastEntry().getValue());

        SequencedMap<String, String> reversed = map.reversed();
        assertEquals("Arief", reversed.lastEntry().getValue());
        assertEquals("Hermawan", reversed.firstEntry().getValue());
    }

    @Test
    void linkedMap() {
        SequencedMap<String, String> map = new LinkedHashMap<>();
        map.putFirst("a", "Arief");
        map.putFirst("b", "Karditya");
        map.putFirst("c", "Hermawan");

        assertEquals("Hermawan", map.firstEntry().getValue());
        assertEquals("Arief", map.lastEntry().getValue());

    }
}
