package cc.somkiat.basicunittesting.validation.nameRule;

import cc.somkiat.basicunittesting.validation.SaveRule;

/**
 * Created by Kcomic on 16/11/2560.
 */

public class NameFormatRule implements SaveRule {
    String message;
    @Override
    public void validate(String name) {
        if(!name.matches("[a-zA-Z]+")){
            message = "Name is not alphabet";
        }
    }

    public String getMessage() {
        return message;
    }
}
