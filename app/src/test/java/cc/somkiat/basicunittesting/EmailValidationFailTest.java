package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.EmailValidation;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by student on 15/11/2017 AD.
 */

public class EmailValidationFailTest {

    @Test
    public void อีเมลเป็นค่าว่าง(){
        EmailValidation validation = new EmailValidation();
        boolean result = validation.emailValidation("");
        assertEquals("Email is empty", validation.getMessage());
        assertFalse("ไม่ผ่าน เพราะมีค่าว่าง", result);
    }
    @Test
    public void ไม่ใช่อีเมลแพทเทริน(){
        EmailValidation validation = new EmailValidation();
        boolean result = validation.emailValidation("Kcomic");
        assertEquals("Email is wrong pattern", validation.getMessage());
        assertFalse("ไม่ผ่าน เพราะแพทเทรินอีเมลไม่ถูกต้อง", result);
    }

    @Test
    public void อีเมลมีค่าnull(){
        EmailValidation validation = new EmailValidation();
        boolean result = validation.emailValidation(null);
        assertEquals("Email is null", validation.getMessage());
        assertFalse("ไม่ผ่าน เพราะเป็น null", result);
    }

}
