package CS201.Lab12;

public class ReverseString {

    public static void main(String[] args) {

        reverse("Tirhas");
        System.out.print(reverse("Tirhas"));
        String s = "Feven";
        System.out.print("\n");
        for (int j = s.length(); j > 0; j--) {

            System.out.print(s.charAt(j - 1));
        }

    }
    public static String reverse (String input){
        int k = input.length();
        if (input == null || input.isEmpty())
            return input;
        else
            return input.charAt(k - 1) + reverse(input.substring(0, k - 1));

    }
}




