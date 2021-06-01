public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Narek", "Nor Nork", "JAVA", 2021, 0.0);
        Staff staff1 = new Staff("Narek", "Yerevan", "DISQO", 20.5);




        System.out.println(s1.toString());

        System.out.println(s1.getAddress());

        System.out.println(staff1.toString());
    }
}
