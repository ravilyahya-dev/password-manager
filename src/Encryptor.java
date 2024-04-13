public class Encryptor {

    public static String encrypt(String password) {
        String result = "";

        for (int i = 0; i < password.length(); i++) {
            result = result.concat(String.valueOf((char) (password.charAt(i) + 1)));
        }

        return result;
    }

}
