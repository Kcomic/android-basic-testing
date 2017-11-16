package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.NameValidation;

import static junit.framework.Assert.assertTrue;

/**
 * Created by student on 15/11/2017 AD.
 */

public class NameValidationPassTest {
    @Test
    public void เป็นชื่อที่ถูกต้อง(){
        NameValidation validation = new NameValidation();
        assertTrue(validation.nameValidation("Kcomic"));
    }

}
