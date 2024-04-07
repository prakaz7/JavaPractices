package DailyPractice;

public class StringRemoveDuplicates {

    public static void main(String[] args) {
        String str = "Racecar Programming";

//        StringBuilder sb = new StringBuilder();
//        str.chars().distinct().forEach(c -> sb.append((char)c));
//        System.out.println(sb);


        StringBuilder sb1 = new StringBuilder();
        //char[] c = str.toCharArray();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int index = str.indexOf(c, i+1);
            if(index==-1){
                sb1.append(c);
            }
        }
        System.out.println(sb1);

        System.out.println();

        StringBuilder sb2 = new StringBuilder();
        char[] c = str.toCharArray();
        for (int i =0;i<c.length;i++){
            boolean flag = true;
            for (int j=i+1; i<c.length;i++){
                if(c[i] == c[j]){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                sb2.append(c[i]);
            }
        }
        System.out.println(sb2);
    }
}
