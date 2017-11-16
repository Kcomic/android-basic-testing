package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.NameValidation;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class NameValidationFailTest {

    @Test
    public void ชื่อเป็นค่าว่าง(){
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation("");
        assertEquals("Name is empty", validation.getMessage());
        assertFalse("ไม่ผ่าน เพราะมีค่าว่าง", result);
    }

    @Test
    public void ชื่อเป็นค่าnull(){
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation(null);
        assertEquals("Name is null", validation.getMessage());
        assertFalse("ไม่ผ่าน เพราะเป็น null", result);
    }

    @Test
    public void ชื่อมี33ตัวอักษร(){
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        assertEquals("Name is too long", validation.getMessage());
        assertFalse("ไม่ผ่าน เพราะเกิน20ตัวอักษร", result);
    }


    @Test
    public void ชื่อไม่ถึง2ตัวอักษร(){
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation("k");
        assertEquals("Name is too short", validation.getMessage());
        assertFalse("ไม่ผ่าน เพราะไม่ถึง2ตัวอักษร", result);
    }

    @Test
    public void ชื่อเป็นตัวเลข(){
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation("455115");
        assertEquals("Name is not alphabet", validation.getMessage());
        assertFalse("ไม่ผ่าน เพราะ มีตัวเลข", result);
    }

    @Test
    public void ชื่อเป็นอัขระพิเศษ(){
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation("()_+");
        assertEquals("Name is not alphabet", validation.getMessage());
        assertFalse("ไม่ผ่าน เพราะ มีอัขระพิเศษ", result);
    }

}
