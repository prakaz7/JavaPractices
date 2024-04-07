package DailyJava;

public class Sort012 {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {0,2,1,2,1};
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        System.out.println("Values after initialization :" +c0+ " " + c1+ " " +c2);

        for (int i = 0; i< arr.length; i++){
            if (arr[i] == 0)
                c0++;
            else if (arr[i] == 1)
                c1++;
            else
                c2++;
        }
        for (int j = 0; j<c0; j++) {
            arr[j] = 0;
            System.out.println(arr[j]);
        }
        for (int j = c0; j < c0+c1; j++) {
            arr[j] = 1;
            System.out.println(arr[j]);
        }
        for (int j = c0+c1; j < n; j++) {
            arr[j] = 2;
            System.out.println(arr[j]);
        }
    }


}
