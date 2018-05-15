package org.rbk.java.day01;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Student s1 = new Student();
        s1.age = 13;
        s1.name = "Ayman";
        s1.id = 1;
        System.out.println(s1.count); //1

        Student s2 = new Student();
        s2.age = 21;
        s2.name = "Dareen";
        s2.id = 2;
        //s2.tax = 0.10;
        System.out.println(s1.count);// 2
        System.out.println(s2.count);// 2
        Student.count = 200; // 200


        Student s3 = new Student(3, "Douaa", 30);
        System.out.println(s3.count);// 201


        Student s4 = new Student(4, "Ahamd", 32);
        System.out.println(s4.count);

       Student s5 = new Student(5);
       System.out.println(s4.count);

       Student s6 = new Student(6, "Ammar");
       System.out.println(s4.count);  //
        // Config.URL = "http://rbk.org";
        ConnectoToServer(Config.URL, Config.DATA_BASE, Config.USERNAME, Config.PASSWORD);
        /*
       System.out.println( s1.getFullInfo());
       System.out.println( s2.getFullInfo());
       System.out.println( s3.getFullInfo());
       System.out.println( s4.getFullInfo());

       System.out.print(s1.count);
        */
    }

    private static void ConnectoToServer(String url, String dataBase, String username, String password) {
    }
}
