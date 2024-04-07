package Episode1;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        int sum =0;
        for (int i =0; i< arr.length; i++){
            if(arr[i]%2 == 0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of Even Numbers :" + sum);
        oddNumbers();
        System.out.println();
        TwoDigitNos();
        System.out.println();
        positiveNos();

    }

    // odd nos, 2 digit nos, positive nos,
    public static void oddNumbers(){
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        int sum =0;
        for (int i =0; i< arr.length; i++){
            if(arr[i]%2 != 0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of Odd Numbers :" + sum);
    }

    public static void TwoDigitNos(){
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        int sum =0;
        for (int i =0; i< arr.length; i++){
            if(arr[i]>9 && arr[i]<100){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of Two Digits Numbers :" + sum);
    }

    public static void positiveNos(){
        int arr[] = {4,23,-564,12,46,8,2,6,-1,2,4,55,66,99,-987};
        int sum =0;
        for (int i =0; i< arr.length; i++){
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of Positive Numbers :" + sum);
    }
}
