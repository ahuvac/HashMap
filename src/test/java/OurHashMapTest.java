import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class OurHashMapTest {

    @Test
    public void getNull() {
        // given
        OurHashMap<String,String> map = new OurHashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        map2.isEmpty();

        // when

        // then
        assertNull(map.get("ENGLISH1"));
    }

    @Test
    public void put() {
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
    public void putSameKeys() {
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
    public void remove(){
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
    public void clear(){
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
    public void putAll(){
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

    @Test
    public void isEmpty_False(){
        // given
        OurHashMap<String,String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");

        //
        assertFalse(map.isEmpty());
    }

    @Test
    public void isEmpty_True(){
        // given
        OurHashMap<String,String> map = new OurHashMap<>();

        // when
         map.clear();

        //
        assertTrue(map.isEmpty());
    }

    @Test
    public void keySet(){
        OurHashMap<String,String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("RUSSIAN", "PRIVIT");

        Set keys = map.keySet();
        //then
        assertEquals(3, keys.size());
        assertTrue(keys.contains("RUSSIAN"));
    }


    @Test
    public void valueSet(){
        OurHashMap<String,String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("RUSSIAN", "PRIVIT");

        Collection values = map.values();
        //then
        assertEquals(3, values.size());
        assertTrue(values.contains("HELLO"));
    }

}