import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCompareExam {
    public static void main(String[] args) {
        Student s1 = new Student("D", 100, 50, 80);
        Student s2 = new Student("B", 80, 60, 80);
        Student s3 = new Student("C", 70, 60, 90);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("=========== Name  ===========");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("=========== Korean  ===========");

        Collections.sort(list, new StudentKorComparator());
        System.out.println(list);

        System.out.println("=========== English  ===========");

        Collections.sort(list, new StudentEngComparator());
        System.out.println(list);

        System.out.println("=========== Math  ===========");

        Collections.sort(list, new StudentMathComparator());
        System.out.println(list);
    }
}

class StudentKorComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getKor() - o2.getKor();
    }
}

class StudentEngComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getEng() - o2.getEng();
    }
}

class StudentMathComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMath() - o2.getMath();
    }
}
