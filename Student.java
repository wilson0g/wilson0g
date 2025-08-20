public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error");
        }
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

class Student2 {
    public static void main(String[] args) {
        Student sk = new Student("Aduuuna", 19, 90.9);

        sk.setAge(-3);           
        sk.setAge(19);          
        sk.setGrade(91.0);    

        System.out.println("Final Name: " + sk.getName());
        System.out.println("Final Age: " + sk.getAge());
        System.out.println("Final Grade: " + sk.getGrade());
    }
}
