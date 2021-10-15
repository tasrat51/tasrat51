//package CS201.Lab11;
//import java.util.InputMismatchException;
//import java.util.Scanner;

//public class Exception extends Throwable {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Enter a num");
//            int num = scanner.nextInt();
//            if (num != 0) {
//                throw new Exception("Not zero");
//            }
//            System.out.println("i'm happy with the input");
//        }catch (InputMismatchException e){
//            System.out.println("invalid Entry");
//
//        }catch(Exception e) {
//            System.out.println("Error: " + e.getMessage());
//
//        }
//    }
//}
 //           a) -1;
//         Output: Error: Not zero
//             b) 0;
//         Output : I'm happy with the input.
//              c) 12xy;
 //        Output: Invalid entry
