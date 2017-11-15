package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by student on 15/11/2017 AD.
 */

public class EmailValidationFailTest {

    @Test
    public void อีเมลเป็นค่าว่าง(){
        EmailValidation validation = new EmailValidation();
        boolean result = validation.isEmpty("");
        assertTrue("ไม่ผ่าน เพราะมีค่าว่าง", result);
    }
    @Test
    public void ไม่ใช่อีเมลแพทเทริน(){
        EmailValidation validation = new EmailValidation();
        boolean result = validation.isNotEmailPattern("kcomic");
        assertFalse("ไม่ผ่าน เพราะแพทเทรินอีเมลไม่ถูกต้อง", result);
    }

}
