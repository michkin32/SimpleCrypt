import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    private String startLower;
    private String startUpper;
    private boolean symmetric = false;

    public ROT13(Character cs, Character cf) {
        String upperCaseStart;
        if (Character.toLowerCase(cs) == 'a' && Character.toLowerCase(cf) == 'n'){
            symmetric = true;


//            startUpper = ROT13.rotate(upperCaseStart, Character.toUpperCase(cs));
//            startLower = ROT13.rotate(lowerCaseStart, Character.toLowercase(cs));
//
//            registerUpper = ROT13.rotate(upperCaseStart, Character.toUpperCase(cf));
//            registerLower = ROT13.rotate(lowerCaseStart, Character.toLowercase(cf));

        }
    }

    ROT13() {
        this('a', 'n');
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {

        return "";
    }


}
