package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class NameValidationFailTest {

    @Test
    public void ชื่อเป็นค่าว่าง(){
        NameValidation validation = new NameValidation();
        validation.isEmpty("");

        assertFalse("ไม่ผ่าน เพราะมีค่าว่าง", validation.isResult());
    }

    @Test
    public void ชื่อเกิน20ตัวอักษร(){
        NameValidation validation = new NameValidation();
        validation.longLength("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        assertFalse("ไม่ผ่าน เพราะเกิน20ตัวอักษร", validation.isResult());
    }

    @Test
    public void ชื่อไม่ถึง2ตัวอักษร(){
        NameValidation validation = new NameValidation();
        validation.shortLength("a");
        assertFalse("ไม่ผ่าน เพราะไม่ถึง2ตัวอักษร", validation.isResult());
    }

}
