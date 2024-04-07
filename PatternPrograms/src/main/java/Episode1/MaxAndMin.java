package Episode1;

public class MaxAndMin {
    public static void main(String[] args) {
//        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
//        int temp;
//        for (int i =0; i<arr.length; i++){
//            for (int j=i+1; i<arr.length; j++){
//                if(arr[i]<arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//            System.out.println(arr[i]);
//        }
        System.out.println();
        maxVal();
        System.out.println();
        minVal();
    }


    public static void maxVal(){
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        int max = arr[0];

        for (int i=1; i< arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The Max amount is :" +max);
    }

    public static void minVal(){
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        int min = arr[0];

        for (int i=1; i< arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The Min amount is :" +min);
    }
}
