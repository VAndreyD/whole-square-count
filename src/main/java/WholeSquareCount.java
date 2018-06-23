public class WholeSquareCount {
    public static int getWholeSquareCount(int A, int B) {
        if (A <= B) {
            int resultCount = 0;
            for (int i = A; i <= B; i++) {
                if (Math.sqrt(i) % 1 == 0) {
                    resultCount++;
                }
            }
            return resultCount;
        }
        return 0;
    }
}
