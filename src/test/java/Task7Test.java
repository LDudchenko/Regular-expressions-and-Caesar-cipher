import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {
    Task7 obj = new Task7();
    char ch1='a';
    char ch2='-';
    char ch3='Z';

    @Test
    void convert_to_Hex1() {
        String expected = obj.convert_to_Hex(ch1);
        String actual = "\\u0061";
        assertEquals(expected, actual);
    }

    @Test
    void convert_to_Hex2() {
        String expected = obj.convert_to_Hex(ch2);
        String actual = "\\u002D";
        assertEquals(expected, actual);
    }
    @Test
    void convert_to_Hex3() {
        String expected = obj.convert_to_Hex(ch3);
        String actual = "\\u005A";
        assertEquals(expected, actual);
    }

}