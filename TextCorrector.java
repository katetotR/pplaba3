public class TextCorrector {
    public static String correct(String text) {
        StringBuffer result = new StringBuffer(text);

        for (int i = 0; i < result.length() - 1; i++) {
            char current = result.charAt(i);
            char next = result.charAt(i + 1);

            if (current == 'Р' || current == 'р') {
                if (next == 'А') {
                    result.setCharAt(i + 1, 'О');
                } else if (next == 'а') {
                    result.setCharAt(i + 1, 'о');
                }
            }
        }

        return result.toString();
    }
}
