import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {
    Task17 obj = new Task17();
    String[] arr1 = {"10.", "4", "a5.8", "-.07", "Hello!"};
    String[] arr2 = {".001", "0.89gh", ".", "0.9", "-5"};

    @Test
    void decimal_or_string1() {
        String[] expected = obj.decimal_or_string(arr1);
        String[] actual = {"Decimal","Decimal","String","Decimal","String"};
        for(int i=0; i<arr1.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void decimal_or_string2() {
        String[] expected = obj.decimal_or_string(arr2);
        String[] actual = {"Decimal","String","String","Decimal","Decimal"};
        for(int i=0; i<arr2.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}