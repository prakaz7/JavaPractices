package Episode1;

public class Print2DigitNumbers {
    public static void main(String[] args) {
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        for (int i =0; i< arr.length; i++){
            if(arr[i] > 9 && arr[i]<100){
                System.out.println("Two digits numbers: "+arr[i]);
            }
        }
        //positive nos, divisible by 5, //ends by 7
        positiveNumbers();
        System.out.println();
        divisibleBy5();
        System.out.println();
        endsBy7();
    }

    public static void positiveNumbers(){
        int arr[] = {4,23,-564,-12,46,8,2,-6,1,2,4,55,-66,99,987};
        for (int i=0; i< arr.length; i++){
            if(arr[i] > 0){
                System.out.println("Positive numberz are: "+arr[i]);
            }
        }
    }

    public static void divisibleBy5(){
        int arr[] = {4,23,565,12,45,8,2,6,1,2,4,55,65,99,987};
        for (int i=0; i< arr.length; i++){
            if(arr[i]%5 ==0){
                System.out.println("Divisible by 5 : "+arr[i]);
            }
        }
    }

    public static void endsBy7(){
        int arr[] = {4,21,565,42,45,7,2,6,1,2,4,56,65,77,987};
        for (int i=0; i< arr.length; i++){
            if(arr[i]%10 ==7){
                System.out.println("Ends by 7 :"+arr[i]);
            }
        }
    }
}
