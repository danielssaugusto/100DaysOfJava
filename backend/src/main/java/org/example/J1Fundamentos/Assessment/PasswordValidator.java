void main() {
}

public static boolean PasswordValidator(String password) {
    if (password.length() < 8) {
        System.out.println("Your password cannot be less 8 characters.");
        return false;
    }

    boolean isUpper = false;
    boolean isNumber = false;
    boolean isSpecialChar = false;

    for (char c : password.toCharArray()) {
        if (Character.isUpperCase(c)) {
            isUpper = true;
        }

        if (Character.isDigit(c)) {
            isNumber = true;
        }

        if (!Character.isLetterOrDigit(c)) {
            isSpecialChar = true;
        }
    }
}


