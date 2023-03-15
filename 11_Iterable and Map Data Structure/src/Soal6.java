class Soal6 {
    public static void main(String[] args)
    {
        int arr[] = {2,1,5,1,3,2};
        int k = 4;
        int length = arr.length;
        System.out.println(sum(arr, length, k));
    }

    public static int sum(int arr[], int length, int k)
    {
        int res = 0;
        for (int i=0; i<k; i++)
            res += arr[i];

        int sum = res;
        for (int i=k; i<length; i++)
        {
            sum += arr[i] - arr[i-k];
            res = Math.max(res, sum);
        }

        return res;
    }
}