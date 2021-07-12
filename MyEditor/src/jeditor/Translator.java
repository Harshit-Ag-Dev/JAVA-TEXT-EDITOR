
package jeditor;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author Harshit Agarwal
 */
public class Translator {

    public static String toEnglish(String hindi) {
        String english = hindi;
        if (english != null) {

            english = english.replaceAll("\u0915\u094D\u0937","kSh");
            english = english.replaceAll("\u091C\u094D\u091E\u093E","GYa");
            english = english.replaceAll("\u091C\u094D\u091E","GY");

            english = english.replaceAll("\u0902",".n");
            english = english.replaceAll("\u0901",".N");
            english = english.replaceAll("\u0903",".h");

            english = english.replaceAll("\u0916", "kh");
            english = english.replaceAll("\u0915", "k");
            english = english.replaceAll("\u0918", "gh");
            english = english.replaceAll("\u0917", "g");
            english = english.replaceAll("\u0919", "~N");
            english = english.replaceAll("\u091B", "chh");
            english = english.replaceAll("\u091A", "ch");
            english = english.replaceAll("\u091D", "jh");
            english = english.replaceAll("\u091C", "j");
            english = english.replaceAll("\u091E", "~n");
            english = english.replaceAll("\u0920", "Th");
            english = english.replaceAll("\u091F", "T");
            english = english.replaceAll("\u0922", "Dh");
            english = english.replaceAll("\u0921", "D");
            english = english.replaceAll("\u0923", "N");
            english = english.replaceAll("\u0925", "th");
            english = english.replaceAll("\u0924", "t");
            english = english.replaceAll("\u0927", "dh");
            english = english.replaceAll("\u0926", "d");
            english = english.replaceAll("\u0928", "n");
            english = english.replaceAll("\u092B", "ph");
            english = english.replaceAll("\u092A", "p");
            english = english.replaceAll("\u092D", "bh");
            english = english.replaceAll("\u092C", "b");
            english = english.replaceAll("\u092E", "m");
            english = english.replaceAll("\u092F", "y");
            english = english.replaceAll("\u0930", "r");
            english = english.replaceAll("\u0932", "l");
            english = english.replaceAll("\u0923", "L");
            english = english.replaceAll("\u0935", "v");
            english = english.replaceAll("\u0935", "w");
            english = english.replaceAll("\u0937", "shh");
            english = english.replaceAll("\u0936", "sh");
            english = english.replaceAll("\u0938", "s");
            english = english.replaceAll("\u0939", "h");

            english = english.replaceAll("\u094D", "`");
            english = english.replaceAll("\u0906", "AA");
            english = english.replaceAll("\u0948", "ai");
            english = english.replaceAll("\u0910", "AI");
            english = english.replaceAll("\u093F", "i");
            english = english.replaceAll("\u0907", "I");
            english = english.replaceAll("\u0940", "ee");
            english = english.replaceAll("\u0908", "EE");
            english = english.replaceAll("\u0941", "u");
            english = english.replaceAll("\u0909", "U");
            english = english.replaceAll("\u0942", "oo");
            english = english.replaceAll("\u090A", "OO");
            english = english.replaceAll("\u090B", "RRi");
            english = english.replaceAll("\u090C", "LLi");
            english = english.replaceAll("\u0947", "e");
            english = english.replaceAll("\u090F", "E");
            english = english.replaceAll("\u094B", "o");
            english = english.replaceAll("\u0913", "O");
            english = english.replaceAll("\u094C", "au");
            english = english.replaceAll("\u0914", "AU");
            english = english.replaceAll("\u0905\u0902", "aM");
            english = english.replaceAll("\u0905\u0903", "aH");
            english = english.replaceAll("\u093E", "a");
            english = english.replaceAll("\u0905", "A");
        }
        return english;
    }

    public static String toHindi(String english) {
        String hindi = toEnglish(english);

        if (hindi != null) {

            hindi = hindi.replaceAll("kSha","\u0915\u094D\u0937\u093E");
            hindi = hindi.replaceAll("kSh","\u0915\u094D\u0937");
            hindi = hindi.replaceAll("GYa","\u091C\u094D\u091E\u093E");
            hindi = hindi.replaceAll("GY","\u091C\u094D\u091E");

            hindi = hindi.replaceAll("kh", "\u0916");
            hindi = hindi.replaceAll("k", "\u0915");
            hindi = hindi.replaceAll("gh", "\u0918\u094D");
            hindi = hindi.replaceAll("g", "\u0917");
            hindi = hindi.replaceAll("~N", "\u0919");
            hindi = hindi.replaceAll("chh", "\u091B");
            hindi = hindi.replaceAll("ch", "\u091A");
            hindi = hindi.replaceAll("jh", "\u091D");
            hindi = hindi.replaceAll("j", "\u091C");
            hindi = hindi.replaceAll("~n", "\u091E");
            hindi = hindi.replaceAll("Th", "\u0920");
            hindi = hindi.replaceAll("T", "\u091F");
            hindi = hindi.replaceAll("Dh", "\u0922");
            hindi = hindi.replaceAll("D", "\u0921");
            hindi = hindi.replaceAll("th", "\u0925");
            hindi = hindi.replaceAll("t", "\u0924");
            hindi = hindi.replaceAll("dh", "\u0927");
            hindi = hindi.replaceAll("d", "\u0926");
            //hindi = hindi.replaceAll("n", "\u0928");
            hindi = hindi.replaceAll("ph", "\u092B");
            hindi = hindi.replaceAll("f", "\u092B");
            hindi = hindi.replaceAll("p", "\u092A");
            hindi = hindi.replaceAll("bh", "\u092D");
            hindi = hindi.replaceAll("b", "\u092C");
            hindi = hindi.replaceAll("m", "\u092E");
            hindi = hindi.replaceAll("y", "\u092F");
            hindi = hindi.replaceAll("r", "\u0930");
            //hindi =  hindi.replaceAll("RRA", "\u0931");
            hindi = hindi.replaceAll("l", "\u0932");
            hindi = hindi.replaceAll("L", "\u0933");
            //hindi =  hindi.replaceAll("LLLA", "\u0934");
            hindi = hindi.replaceAll("v", "\u0935");
            hindi = hindi.replaceAll("w", "\u0935");
            hindi = hindi.replaceAll("shh", "\u0937");
            hindi = hindi.replaceAll("sh", "\u0936");
            hindi = hindi.replaceAll("s", "\u0938");

            hindi = hindi.replaceAll("\\.n", "\u0902");
            hindi = hindi.replaceAll("\\.N", "\u0901");
            hindi = hindi.replaceAll("\\.h", "\u0903");

            hindi = hindi.replaceAll("n", "\u0928");
            hindi = hindi.replaceAll("N", "\u0923");
            hindi = hindi.replaceAll("h", "\u0939");

            hindi = hindi.replaceAll("`", "\u094D");
            hindi = hindi.replaceAll("AA", "\u0906");
            hindi = hindi.replaceAll("ai", "\u0948");
            hindi = hindi.replaceAll("AI", "\u0910");
            hindi = hindi.replaceAll("ee", "\u0940");
            hindi = hindi.replaceAll("EE", "\u0908");
            hindi = hindi.replaceAll("oo", "\u0942");
            hindi = hindi.replaceAll("OO", "\u090A");
            hindi = hindi.replaceAll("RRi", "\u090B");
            hindi = hindi.replaceAll("Ri", "\u0943");
            hindi = hindi.replaceAll("LLi", "\u090C");
            hindi = hindi.replaceAll("i", "\u093F");
            hindi = hindi.replaceAll("I", "\u0907");
            hindi = hindi.replaceAll("e", "\u0947");
            hindi = hindi.replaceAll("E", "\u090F");
            hindi = hindi.replaceAll("au", "\u094C");
            hindi = hindi.replaceAll("AU", "\u0914");
            hindi = hindi.replaceAll("ou", "\u094C");
            hindi = hindi.replaceAll("OU", "\u0914");
            hindi = hindi.replaceAll("u", "\u0941");
            hindi = hindi.replaceAll("U", "\u0909");
            hindi = hindi.replaceAll("o", "\u094B");
            hindi = hindi.replaceAll("O", "\u0913");
            hindi = hindi.replaceAll("aM", "\u0905\u0902");
            hindi = hindi.replaceAll("aH", "\u0905\u0903");
            hindi = hindi.replaceAll("a", "\u093E");
            hindi = hindi.replaceAll("A", "\u0905");
        }
        try {
            return new String(hindi.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            return null;
        } catch (NullPointerException ex) {
            return null;
        }
    }
}
