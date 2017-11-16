package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.EmailValidation;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Kcomic on 16/11/2560.
 */

public class EmailValidationPassTest {
    @Test
    public void เป็นอีเมลแพทเทริน(){
        EmailValidation validation = new EmailValidation();
        assertTrue(validation.emailValidation("Kcomic@gmail.com"));
    }
}
