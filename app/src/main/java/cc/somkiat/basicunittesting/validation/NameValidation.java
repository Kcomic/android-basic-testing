package cc.somkiat.basicunittesting.validation;

import java.util.ArrayList;
import java.util.List;

import cc.somkiat.basicunittesting.validation.nameRule.NameEmptyRule;
import cc.somkiat.basicunittesting.validation.nameRule.NameFormatRule;
import cc.somkiat.basicunittesting.validation.nameRule.NameLengthRule;
import cc.somkiat.basicunittesting.validation.nameRule.NameNullRule;

/**
 * Created by student on 11/10/2017 AD.
 */

public class NameValidation {
    String message;
    public boolean nameValidation(String name) {
        List<SaveRule> saveRules = new ArrayList<SaveRule>();
        saveRules.add(new NameNullRule());
        saveRules.add(new NameEmptyRule());
        saveRules.add(new NameFormatRule());
        saveRules.add(new NameLengthRule());
        for(SaveRule saveRule : saveRules){
            saveRule.validate(name);
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
