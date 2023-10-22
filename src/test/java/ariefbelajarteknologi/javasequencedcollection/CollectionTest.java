package ariefbelajarteknologi.javasequencedcollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTest {

    @Test
    void collection() {
        SequencedCollection<String> listHilmi = new ArrayList<>();
        listHilmi.add("Hilmi");          // Hilmi
        listHilmi.add("Akbar");          // Hilmi, Akbar
        listHilmi.add("Muharrom");       // Hilmi, Akbar, Muharrom

        assertEquals(List.of("Hilmi", "Akbar", "Muharrom"), listHilmi);
    }
}
