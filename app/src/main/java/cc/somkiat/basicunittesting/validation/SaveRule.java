package cc.somkiat.basicunittesting.validation;

/**
 * Created by Kcomic on 16/11/2560.
 */

public interface SaveRule {
    void validate(String string);
    String getMessage();
}
