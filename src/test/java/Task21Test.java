import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Task21Test {
    Task21 obj = new Task21();
    String[] arr1 = {"10.", "101", "a5.8", "0", "Hello!"};
    String[] arr2 = {".001", "-1", "01110", "0000", "-5"};

    @Test
    void binary_or_string1() {
        String[] expected = obj.binary_or_string(arr1);
        String[] actual = {"String","Binary","String","Binary","String"};
        for(int i=0; i<arr1.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void binary_or_string2() {
        String[] expected = obj.binary_or_string(arr2);
        String[] actual = {"String","String","Binary","Binary","String"};
        for(int i=0; i<arr1.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}