package enums;

import static enums.MaritalStatus.SINGLE;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vasiliy");
        student.setStatus(SINGLE);

        String hebrewDesc = student.getStatus().getHebrewDesc();
        System.out.println("hebrewDesc = " + hebrewDesc);

        int dbcode = 3;
        MaritalStatus maritalStatus = MaritalStatus.findByDbCode(7);
        System.out.println(maritalStatus.getHebrewDesc());

        Student student2 = new Student();

    }
}
