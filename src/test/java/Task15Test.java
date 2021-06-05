import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task15Test {
    Task15 obj = new Task15();
    char[] key1 = "C++".toCharArray();
    char[] text1 = "Different tasks in programming.".toCharArray();
    char[] text2 = "Fspnobmxd#dkauc#sx#zbwqbiwwqxq!".toCharArray();

    @Test
    void cezar_code1() {
        char[] expected = obj.cezar_code(key1, text1);
        char[] actual = "Fspnobmxd#dkauc#sx#zbwqbiwwqxq!".toCharArray();
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }

    }
    @Test
    void cezar_decode1() {
        char[] expected = obj.cezar_decode(key1, text2);
        char[] actual = "Different tasks in programming.".toCharArray();
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}