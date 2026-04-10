public class SzyfrCezara {

    public static String szyfrowanieCezarem (String szyfrowanyCiag, int klucz){
        String zaszyfrowaneslowo = "";

        for (int i = 0; i < szyfrowanyCiag.length(); i++) {
            char znak = szyfrowanyCiag.charAt(i);
            if (znak == ' '){
                zaszyfrowaneslowo += " ";
            }else if (znak >= 'a' && znak <= 'z') {
                int znak2 = znak + klucz % 26;
                zaszyfrowaneslowo  += (char) znak2;
                if (znak >= 'z'){
                    znak2 -=26;
                }
                if (znak <= 'a'){
                    znak2 +=26;
                }
            }
            else {
                zaszyfrowaneslowo += klucz % 26;
            }
        }
        return zaszyfrowaneslowo;
    }
}
//abcdefghijklmnopqrstuvwxyz