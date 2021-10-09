package CS201.MockExam;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Tirhas",  5123 , 3.8,
                new Course("321", "CS", 15));

        Student std2 = new Student("Feven", 5124, 3.9,
                new Course("322", " MSD", 20));
        System.out.println(std1.getStdName());
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std1.getStdName()+ " is amazing  with " +std1.getGpa() + " Gpa " );
         std1.setStdName("Snit");
        System.out.println(std1);
    }


}