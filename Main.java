import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer text = new StringBuffer();

        System.out.println("Введите текст. Для завершения введите пустую строку:");

        try {
            while (true) {
                String line = br.readLine();

                if (line == null || line.length() == 0) {
                    break;
                }

                text.append(line);
                text.append('\n');
            }

            String correctedText = TextCorrector.correct(text.toString());
            System.out.println("Исправленный текст:");
            System.out.print(correctedText);
        } catch (IOException e) {
            System.out.println("Ошибка чтения с клавиатуры");
        }
    }
}
