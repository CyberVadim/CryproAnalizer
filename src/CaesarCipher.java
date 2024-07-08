import java.nio.file.Files;
import java.nio.file.Path;

public class CaesarCipher {


    public static void main(String[] args) {
        String plainText = "Привет, мир!"; // Пример открытого текста
        int shift = 3; // Смещение для шифрования
        String encryptText = encryptCaesar(plainText, shift);
        String decryptText = decryptCaesar(encryptText, shift);

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

    public static String encryptCaesar(String text, int shift) {
        StringBuilder cipherText = new StringBuilder();
        Validator validator = new Validator();

        validator.isFileExists(text);
        validator.isValidKey(shift);

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = (char) ((c % 'я' + shift) % 'я');
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

    public static String decryptCaesar(String cipherText, int shift) {
        return encryptCaesar(cipherText, -shift);
    }
}


