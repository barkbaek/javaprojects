public class Student implements Comparable<Student>{
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student () {
    }

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getKor() {
        return this.kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getEng() {
        return this.eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getMath() {
        return this.math;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (kor != student.kor) return false;
        if (eng != student.eng) return false;
        if (math != student.math) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + kor;
        result = 31 * result + eng;
        result = 31 * result + math;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}
