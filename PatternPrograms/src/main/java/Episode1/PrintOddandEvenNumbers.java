package Episode1;

public class PrintOddandEvenNumbers {
    public static void main(String[] args) {
        int arr[] = {123,234,234,35645,45,3411,1233,132232,34434,54};

        for (int i =0; i< arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("The even numbers are: " + arr[i]);
            }
        }
        for (int j =0; j< arr.length; j++){
                if(arr[j] % 2 != 0){
                    System.out.println("The Odd numbers are: "+arr[j]);
                }
        }
    }
}
