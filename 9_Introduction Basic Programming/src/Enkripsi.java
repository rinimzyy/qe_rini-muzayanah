class Enkripsi {
    private static String encrypt(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()){
            if (c >= 'A' && c <= 'Z'){
                char shiftedChar = (char) ('A' + (c - 'A' + 10)% 26);
                result.append(shiftedChar);
            }
            else if (c >= 'a' && c <='z'){
                char shiftedChar = (char) ('a' + (c - 'a' + 10)% 26);
                result.append(shiftedChar);
            }
            else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE"));
        System.out.println(encrypt("ALTERRA ACADEMY"));
        System.out.println(encrypt("INDONESIA"));
        System.out.println(encrypt("GOLANG"));
        System.out.println(encrypt("PROGRAMMER"));
    }
}
