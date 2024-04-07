package DailyPractice;

public class StringReverse {
    public static void main(String[] args) {
        String name = "HEllo World";
        char[] ch = name.toCharArray();
        for(int i = ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
        System.out.println();

        //approach 2
        for (int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
        System.out.println();

        //Approach 3:
        StringBuffer buf = new StringBuffer();
        buf.append(name);
        buf.reverse();
        System.out.println(buf);
        System.out.println();

        StringBuilder build = new StringBuilder(name);
        build.reverse();
        System.out.println(build);

        junk();
    }


    public static void junk(){
        String s = "$@@$hsdhofh123498@#$@#$@@%@&$@#)";

        String si = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(si);
    }
}
