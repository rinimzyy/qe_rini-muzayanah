class drawXYZ{
    public static void drawXYZ(int n) {
        int height = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                height++;
                if (height % 2 == 1) {
                    if (height % 3 == 0) {
                        System.out.print("X  ");
                    } else {
                        System.out.print("Y  ");
                    }
                } else if (height % 2 == 0) {
                    if (height % 3 == 0) {
                        System.out.print("X  ");
                    } else {
                        System.out.print("Z  ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        drawXYZ(5);
    }
}
