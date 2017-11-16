package cc.somkiat.basicunittesting.validation.nameRule;

import cc.somkiat.basicunittesting.validation.SaveRule;

/**
 * Created by Kcomic on 16/11/2560.
 */

public class NameNullRule implements SaveRule {
    String message;
    @Override
    public void validate(String name) {
        if(name == null){
            message = "Name is null";
        }
    }

    public String getMessage() {
        return message;
    }
}
