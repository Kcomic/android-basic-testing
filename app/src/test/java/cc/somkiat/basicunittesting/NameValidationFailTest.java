package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

public class NameValidationFailTest {
    @Test
    public void ชื่อเป็นค่าว่าง(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmpty("");
        assertFalse("ไม่ผ่าน เพราะมีค่าว่าง", result);
    }
}
