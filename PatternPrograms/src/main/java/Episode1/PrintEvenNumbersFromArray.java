package Episode1;

public class PrintEvenNumbersFromArray {
    public static void main(String[] args) {
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        for (int i =0; i< arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
