class Soal5 {
    public static void main(String[] args) {
        int[] arrayData = new int[] {2,3,3,3,6,9,9};
        int newLength = array(arrayData);

        System.out.println(newLength);
    }

    private static int array(int[] arrayData) {
        int length = arrayData.length;
        int j = 0;

        for (int i = 0; i < length; i++) {
            if (i < length - 1 && arrayData[i] == arrayData[i + 1]) {
                continue;
            }
            arrayData[j++] = arrayData[i];
        }
        return j;
    }
}