package ariefbelajarteknologi.javasequencedcollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SeqCollectionTest {

    @Test
    void collection() {
        SequencedCollection<String> list = new ArrayList<>();
        list.addLast("Hermawan");   // Hermawan
        list.addFirst("Karditya");  // Karditya, Hermawan
        list.addFirst("Arief");     // Arief, Karditya, Hermawan

        assertEquals(List.of("Arief", "Karditya", "Hermawan"), list);

        assertEquals("Arief", list.getFirst());
        assertEquals("Hermawan", list.getLast());

        SequencedCollection<String> reversed = list.reversed();
        assertEquals(List.of("Hermawan", "Karditya", "Arief"), reversed);

        String value = list.removeFirst();
        assertEquals("Arief", value);
        assertEquals("Karditya", list.getFirst());

        value = list.removeLast();
        assertEquals("Hermawan", value);
        assertEquals("Karditya",list.getLast());
    }
}
