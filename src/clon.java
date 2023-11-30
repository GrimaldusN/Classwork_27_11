public class clon {
    public static void dubl(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    number[j] = 0;
                }
            }
        }
    }
}
