package CS201.Lab12;

public class NumberOfCharacter {

    public static void main(String[] args) {
        System.out.println(countChar("Tirhas"));
        System.out.println(countDigits("Tirhas@Asrat512351",0));
    }
    public static int countChar(String str)
    {

        if(str.isEmpty())
            return 0;
        else
            return 1 + countChar( str.substring(1));


    }
    public static int countDigits(String s,int i){
        if (i == s.length() )
            return 0;
        else if (s.charAt(i) >= '0'||s.charAt(i) <= '9')
            return 1+countDigits(s,i+1);
        else
            return 0+countDigits(s, i+1);
    }
}


