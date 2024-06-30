import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        String myTestTextRead = "D:\\testRead.txt"; // локальный текст для проверок
        String myTestTextWrite = "D:\\testWrite.txt"; // локальный текст для проверок
        Scanner scanner = new Scanner(System.in);
        final char[] ALPHABET = {
                'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'к',
                'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф',
                'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я',
                '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '
        };
    }

    public class Validator {
        public boolean isValidKey(int key, char[] alphabet) {
            // Проверка ключа
            return false;
        }
        public boolean isFileExists(String filePath) {
            // Проверка существования файла
            return false;
        }
    }

    public class FileManager {
        public String readFile(String filePath) {
            // Логика чтения файла
            return filePath;
        }

        public void writeFile(String content, String filePath) {
            // Логика записи файла
        }
    }


}
