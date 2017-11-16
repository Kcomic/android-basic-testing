package cc.somkiat.basicunittesting.validation.nameRule;

import cc.somkiat.basicunittesting.validation.SaveRule;

/**
 * Created by Kcomic on 16/11/2560.
 */

public class NameLengthRule implements SaveRule {
    String message;
    @Override
    public void validate(String name) {
        if(name.length() < 2){
            message = "Name is too short";
        } else if(name.length() > 20){
            message = "Name is too long";
        }
    }

    public String getMessage() {
        return message;
    }
}
