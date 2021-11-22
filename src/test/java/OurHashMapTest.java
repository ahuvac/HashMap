import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest {

    @Test
    void getNull() {
        // given
        OurHashMap<String,String> map = new OurHashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        map2.remove('g');

        // when

        // then
        assertNull(map.get("ENGLISH1"));
    }

    @Test
    void put() {
        // given
        OurHashMap<String,String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");
        map.put("ENGLISH2", "HI");
        map.put("ENGLISH3", "HEY");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");
        map.put("FRENCH", "BONJOUR");
        map.put("RUSSIAN", "PRIVIT");
        map.put("JAPANESE", "NE HOW");
        map.put("MANDARIN", "CONICHIWA");

        // then
        assertEquals("HELLO", map.get("ENGLISH1"));
        assertEquals("HI", map.get("ENGLISH2"));
        assertEquals("HEY", map.get("ENGLISH3"));
        assertEquals("HOLA", map.get("SPANISH"));
        assertEquals("SHALOM", map.get("HEBREW"));
        assertEquals("BONJOUR", map.get("FRENCH"));
        assertEquals("PRIVIT", map.get("RUSSIAN"));
        assertEquals("NE HOW", map.get("JAPANESE"));
        assertEquals("CONICHIWA", map.get("MANDARIN"));
    }

    @Test
    void putSameKeys() {
        // given
        OurHashMap<String,String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");
        map.put("FRENCH", "BONJOUR");
        map.put("ENGLISH1", "HI");

        // then
        assertEquals("HI", map.get("ENGLISH1"));
    }

    @Test
    void remove(){
        // given
        OurHashMap<String,String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");
        map.put("SPANISH", "HOLA");
        map.remove("SPANISH");

        //then
        assertNull(map.get("SPANISH"));
    }

    @Test
    void clear(){
        // given
        OurHashMap<String,String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");
        map.put("SPANISH", "HOLA");
        map.clear();

        //then
        assertNull(map.get("SPANISH"));
    }

    @Test
    void putAll(){
        // given
        OurHashMap<String,String> map1 = new OurHashMap<>();
        OurHashMap<String,String> map2 = new OurHashMap<>();

        // when
        map1.put("ENGLISH1", "HELLO");
        map1.put("SPANISH", "HOLA");
        map1.put("HEBREW", "SHALOM");
        map1.put("FRENCH", "BONJOUR");

        map2.putAll(map1);

        //then
        assertEquals("HELLO", map2.get("ENGLISH1"));

    }
}