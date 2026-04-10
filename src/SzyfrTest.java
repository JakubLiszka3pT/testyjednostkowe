import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SzyfrTest {

    @Test // metoda testująca
    void szyfrujPrzestawieniowoJezeliPusteSlowo(){
        Assertions.assertEquals("", Szyfr.szyfrujPrzestawieniowo(""));
    }
    @Test
    void szyfrujPrzestawieniowoJezeliJednaLitera(){
        Assertions.assertEquals("z", Szyfr.szyfrujPrzestawieniowo("z"));
    }
    @Test
    void szyfrujPrzestawieniowoJezeliParzystaDlugoscSlowa(){
        Assertions.assertEquals("atam", Szyfr.szyfrujPrzestawieniowo("tama"));
    }
    @Test
    void szyfrujPrzestawieniowoJezeliNieparzystaDlugoscSlowa(){
        Assertions.assertEquals("odemk", Szyfr.szyfrujPrzestawieniowo("domek"));
    }
}
// wartosc wejscie-> otrzymana i oczekiwana