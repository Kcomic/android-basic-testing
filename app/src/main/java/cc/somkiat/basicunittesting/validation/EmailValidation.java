package cc.somkiat.basicunittesting.validation;

import java.util.ArrayList;
import java.util.List;

import cc.somkiat.basicunittesting.validation.emailRule.EmailEmptyRule;
import cc.somkiat.basicunittesting.validation.emailRule.EmailFormatRule;
import cc.somkiat.basicunittesting.validation.emailRule.EmailNullRule;

/**
 * Created by student on 15/11/2017 AD.
 */

public class EmailValidation {

String message;
    public boolean emailValidation(String email) {
        List<SaveRule> saveRules = new ArrayList<SaveRule>();
        saveRules.add(new EmailNullRule());
        saveRules.add(new EmailEmptyRule());
        saveRules.add(new EmailFormatRule());
        for(SaveRule saveRule : saveRules){
            saveRule.validate(email);
            if(saveRule.getMessage() != null) {
                message = saveRule.getMessage();
                return false;
            }
        }
        return true;
    }

    public String getMessage() {
        return message;
    }
}
