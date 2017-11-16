package cc.somkiat.basicunittesting.validation.emailRule;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cc.somkiat.basicunittesting.validation.SaveRule;

/**
 * Created by Kcomic on 16/11/2560.
 */

public class EmailFormatRule implements SaveRule {
    String message;
    @Override
    public void validate(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()){
            message = "Email is wrong pattern";
        }
    }

    public String getMessage() {
        return message;
    }
}
