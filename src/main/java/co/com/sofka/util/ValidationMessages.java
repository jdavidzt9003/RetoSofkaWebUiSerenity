package co.com.sofka.util;

public enum ValidationMessages {
    LOGIN_OK("Welcome"),
    CREDENTIAL_INVALID("Invalid credentials"),
    CREDENTIAL_EMPTY("Username cannot be empty");

    private final String value;

    public String getValue() {
        return value;
    }

    ValidationMessages(String value) {
        this.value = value;
    }
}
