package Episode1;

public class SquareRootAndPowers {
    public static void main(String[] args) {
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        System.out.println("\n The square root numbers are : ");
        for (int i =0; i< arr.length; i++){
            double sqrtNo = Math.sqrt(arr[i]);
            System.out.println("\n");
            System.out.print(arr[i] + " square root is " + sqrtNo + " ");
            System.out.println();
            powerOfN();
        }
    }

    public static void powerOfN(){
        int arr[] = {4,23,564,12,46,8,2,6,1,2,4,55,66,99,987};
        System.out.println("\n The Power of 3 numbers are : ");
        for (int i =0; i< arr.length; i++){
            double powerOfNo = Math.pow(arr[i], 3);
            System.out.println("\n");
            System.out.print(arr[i] + " Power of 3 is " + powerOfNo + " ");
        }
    }
}
