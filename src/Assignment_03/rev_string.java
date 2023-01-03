package Assignment_03;

public class rev_string {
    public static void main(String[] args) {
        String s="akash";
        System.out.println("Actual String is: "+s);

        char ch;
        String newString="";
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            newString=ch+newString;
        }
        System.out.println("Reverse string is: "+newString);


    }
}
