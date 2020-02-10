
import model.Student;
import model.Teacher;

import java.util.ArrayList;

public class Application {


    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "李莉";
        stu.age = 24;
        stu.gender = "女";

        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.gender);
        stu.eat();
        stu.relax();

        Teacher Tea = new Teacher();
        Tea.name = "张龙";
        Tea.stuList = new ArrayList<String>();
        Tea.stuList.add("李莉，20岁，女");
        Tea.stuList.add("王其，21岁，男");

        Tea.addStudent("赵毅，22岁，男");

        Tea.check(Tea.stuList);


    }
}
