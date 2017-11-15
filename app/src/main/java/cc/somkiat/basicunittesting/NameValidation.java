package cc.somkiat.basicunittesting;

/**
 * Created by student on 11/10/2017 AD.
 */

class NameValidation {
    private boolean result;
    public void isEmpty(String name) {
        if(name.isEmpty()) result = false;
    }

    public void longLength(String name) {
        if(name.length() > 20) result = false;
    }

    public void shortLength(String name) {
        if(name.length() < 2) result = false;
    }

    public boolean isResult() {
        return result;
    }
}
