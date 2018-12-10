public class Student {
    private String name;
    private int korean;
    private int english;
    private int math;

    public Student () {
    }

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getKorean() {
        return this.korean;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getEnglish() {
        return this.english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getMath() {
        return this.math;
    }
}
