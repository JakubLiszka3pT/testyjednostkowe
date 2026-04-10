import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfrCezaraTest {
    @Test
    void kluczdodatni(){
        Assertions.assertEquals("def", SzyfrCezara.szyfrowanieCezarem("abc", 3));
    }
    @Test
    void zawijanie(){
        Assertions.assertEquals("abc", SzyfrCezara.szyfrowanieCezarem("xyz", 3));
    }
    @Test
    void odszyfrowanie(){
        Assertions.assertEquals("abc", SzyfrCezara.szyfrowanieCezarem("xyz", -3));
    }
    @Test
    void kluczWiekszyOdAlfabetu(){
        Assertions.assertEquals("def", SzyfrCezara.szyfrowanieCezarem("abc", 29));
    }
    @Test
    void spacjaWTekscie(){
        Assertions.assertEquals("cd ef", SzyfrCezara.szyfrowanieCezarem("ab cd", 2));
    }
}