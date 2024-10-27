import java.nio.file.Files;
import java.nio.file.Path;

public class CaesarCipher {


    public static void main(String[] args) {
        String plainText = "Привет, мир!"; // Пример открытого текста
        int key = 3; // Ключ для шифрования

        String encryptText = encryptCaesar(plainText, key);
        String decryptText = decryptCaesar(encryptText, key);

        System.out.println("Открытый текст: " + plainText);
        System.out.println("Зашифрованный текст: " + encryptText);
        System.out.println("Дешифрованный текст: " + decryptText);
    }

    public static class Validator {
        public boolean isValidKey(int key) {
            // Проверка валидности ключа
            if (key != 0 && key > 0) {
                return true;
            } else {
                return false;
            }
        }
        public boolean isFileExists(String filePath) {
            // Проверка существования файла, но в рамках проверки, мы проверяем текст
            if (Files.exists(Path.of(filePath))) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String encryptCaesar(String text, int key) {
        StringBuilder cipherText = new StringBuilder();
        Validator validator = new Validator();

        validator.isFileExists(text);
        validator.isValidKey(key);

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = (char) ((c % 'я' + key) % 'я');
                cipherText.append(encryptedChar);
            } else {
                cipherText.append(c);
            }
        }
        // мне тяжело давалось шифровка с использование алфавита,
        // погугли часок другой нашел более простое решение,
        // все-таки программировать - это еще и уметь гуглить)))

        return cipherText.toString();
    }

    public static String decryptCaesar(String cipherText, int key) {
        return encryptCaesar(cipherText, -key);
    }
}


