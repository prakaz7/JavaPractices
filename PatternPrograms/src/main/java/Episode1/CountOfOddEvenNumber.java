package Episode1;

public class CountOfOddEvenNumber {
    public static void main(String[] args) {
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        int count = 0;
        for (int i =0; i< arr.length; i++){
            if(arr[i]%2 ==0)
                count++;
        }
        System.out.println("Count of Even Numbers : "+count);
        System.out.println();
        oddNum();
    }

    public static void oddNum(){
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        int count = 0;
        for (int i =0; i< arr.length; i++){
            if(arr[i]%2 !=0)
                count++;
        }
        System.out.println("Count of Odd Numbers : "+count);
    }
}
