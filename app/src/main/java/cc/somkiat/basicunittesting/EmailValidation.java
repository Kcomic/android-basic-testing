package cc.somkiat.basicunittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by student on 15/11/2017 AD.
 */

class EmailValidation {

    public boolean isEmpty(String email) {
        return email.isEmpty();
    }

    public boolean isNotEmailPattern(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
