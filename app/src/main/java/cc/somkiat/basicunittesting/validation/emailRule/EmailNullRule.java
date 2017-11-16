package cc.somkiat.basicunittesting.validation.emailRule;

import cc.somkiat.basicunittesting.validation.SaveRule;

/**
 * Created by Kcomic on 16/11/2560.
 */

public class EmailNullRule implements SaveRule {
    String message;
    @Override
    public void validate(String email) {
        if(email == null){
            message = "Email is null";
        }
    }

    public String getMessage() {
        return message;
    }
}
