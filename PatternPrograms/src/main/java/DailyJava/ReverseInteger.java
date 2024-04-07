package DailyJava;


//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger rv = new ReverseInteger();
        int x = -234567123;
        rv.reverse(x);
    }
        public static int reverse(int x){

        boolean flag = false;
        if(x>0){
            flag = true;
        }
        x = Math.abs(x);
        long rev = 0;
        while(x>0) {
            rev = rev * 10 + (x % 10);
            x = x / 10;

            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
            }
        if (!flag){
            return -1*(int)rev;
        }
            System.out.println(rev);
        return (int)rev;
        }

}
