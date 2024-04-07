package DailyJava;

public class TransitionPoint {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,0,1};
        int n = arr.length;
        int beginning = 0, end = n-1;
        int flag = 0;
        System.out.println("Execution");

        if(arr[0] == 0 && n ==1){
            System.out.println("There is No Transition element found");
        }
        while(beginning <= end){
            int mid = (beginning+end)/2;
            System.out.println("The mid val is : " + mid);
            if(arr[mid] == 1 && arr[mid - 1] == 0){
                System.out.println("The transition element is found at :" + arr[mid]);
            } else if (arr[mid] == 1) {
                flag = 1;
                end = mid -1;
            }else{
                beginning = mid + 1;
            }
        }
        if (flag == 0){
            System.out.println("There is No Transition element found");
        }
    }
}
