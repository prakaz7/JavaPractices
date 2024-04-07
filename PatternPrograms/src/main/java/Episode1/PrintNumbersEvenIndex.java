package Episode1;

public class PrintNumbersEvenIndex {
    public static void main(String[] args) {
        int arr[] = {123,234,234,35645,45,3411,1233,132232,34434,54};
        for (int i=0; i< arr.length; i++){
            if(i%2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
