package ariefbelajarteknologi.javasequencedcollection;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.SequencedSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {

    @Test
    void set() {

        SequencedSet<String> set = new TreeSet<>();
        set.add("Gema");    // Gema
        set.add("Arief");   // Arief, Gema
        set.add("Rafly");   // Arief, Gema, Rafly
        set.add("Rozan");   // Arief, Gema, Rafly, Rozan
        set.add("Rangga");  // Arief, Gema, Rafly, Rangga, Rozan

        assertEquals(Set.of("Arief", "Gema", "Rafly", "Rangga", "Rozan"), set);
        assertEquals("Rozan", set.getLast());
        assertEquals("Arief", set.getFirst());

        SequencedSet<String> reversed = set.reversed();
        assertEquals("Rozan",reversed.getFirst());
        assertEquals("Arief",reversed.getLast());

        String value = set.removeFirst();
        assertEquals("Arief",value);

        value = set.removeFirst();
        assertEquals("Gema",value);
    }
}
