public class Szyfr {
    public static String szyfrujPrzestawieniowo(String slowoDoSzyfrowania){
        String zaszyfrowaneslowo = "";
        for (int i = 0; i < slowoDoSzyfrowania.length()-1; i+=2) {
            zaszyfrowaneslowo = zaszyfrowaneslowo + slowoDoSzyfrowania.charAt(i+1) + slowoDoSzyfrowania.charAt(i);
        }
        if (slowoDoSzyfrowania.length() % 2 != 0){
            zaszyfrowaneslowo = zaszyfrowaneslowo + slowoDoSzyfrowania.charAt(slowoDoSzyfrowania.length()-1);
        }


        return zaszyfrowaneslowo;
        // prawy-> generate -> Test , testy powinny znajdowac sie w osobnym katalogu
    }
}
