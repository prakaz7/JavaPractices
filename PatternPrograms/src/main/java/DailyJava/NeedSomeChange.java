package DailyJava;

public class NeedSomeChange {

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        //int n;
        for (int i =0; i< arr.length-2; i++){
            int temp = arr[i+2];
            arr[i+2] = arr[i];
            arr[i] = temp;
        }

        for (int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
