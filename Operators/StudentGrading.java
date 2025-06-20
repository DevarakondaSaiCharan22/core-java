package Operators;

public class StudentGrading {

    public static void main(String[] args) {
        String studentName = "Ramu";
        byte studentId = 10;

        byte Maths = 50;
        byte social = 67;
        byte telugu = 70;

        int total = 300;
        int totalmarks = Maths + social + telugu ;

        int averagemarks = totalmarks / 3;

        boolean passing = averagemarks >= 50;

        boolean passallsubjects = Maths > 50 || social > 50 || telugu > 50;


        System.out.println("name is " + studentName);
        System.out.println("ID is " + studentId);
        System.out.println("marks in Maths is " + Maths);
        System.out.println("marks in social is " + social);
        System.out.println("marks in telugu is " + telugu);
        System.out.println("total marks is " + totalmarks);
        System.out.println("average marks is " + averagemarks);
        System.out.println("passorfail is " + passing);
        System.out.println("passallsubjects is " + passallsubjects);
    }
}
