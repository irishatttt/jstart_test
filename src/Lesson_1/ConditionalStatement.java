package Lesson_1;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 22;
        if (age > 21) {
            System.out.println("age > 21");
        }
        char sex = 'G';
        if (sex == 'M') {
            System.out.println("sex = B");
        }
        if (sex != 'M') {
            System.out.println("sex = G");
        }
        double height = 1.999;
        if (height < 1.8) {
            System.out.println("height < 1.8");
        } else {
            System.out.println("height >= 1.8");
        }
        char firstLetterOfName = 'M';
        if (firstLetterOfName == 'M') {
            System.out.println("firstLetterOfName-M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("firstLetterOfName-I");
        } else {
            System.out.println("firstLetterOfName no M and I");
        }
    }

}
