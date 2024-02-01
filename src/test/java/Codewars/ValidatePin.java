package Codewars;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ValidatePin {

    //ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
    @Test
    public void validPins() {
        assertEquals(true, ValidatePin.validatePin("1234"));
        assertEquals(true, ValidatePin.validatePin("0000"));
        assertEquals(true, ValidatePin.validatePin("1111"));
        assertEquals(true, ValidatePin.validatePin("123456"));
        assertEquals(true, ValidatePin.validatePin("098765"));
        assertEquals(true, ValidatePin.validatePin("000000"));
        assertEquals(true, ValidatePin.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, ValidatePin.validatePin("a234"));
        assertEquals(false, ValidatePin.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, ValidatePin.validatePin("1"));
        assertEquals(false, ValidatePin.validatePin("12"));
        assertEquals(false, ValidatePin.validatePin("123"));
        assertEquals(false, ValidatePin.validatePin("12345"));
        assertEquals(false, ValidatePin.validatePin("1234567"));
        assertEquals(false, ValidatePin.validatePin("-1234"));
        assertEquals(false, ValidatePin.validatePin("-12345"));
        assertEquals(false, ValidatePin.validatePin("1.234"));
        assertEquals(false, ValidatePin.validatePin("00000000"));
    }

    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
