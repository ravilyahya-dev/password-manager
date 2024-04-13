public class Main {
    public static void main(String[] args) {
        String password = "Amin777@34";

        String encrypted = Encryptor.encrypt(password);

        System.out.println(encrypted);

        System.out.println(Decryptor.decrypt(encrypted));
    }
}