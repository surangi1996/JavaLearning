package example;

public class Inheritance {
    public static class Person {
        protected String name;

        public Person(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public static class Teacher extends Person{
        private String subject;

        public Teacher(String name, String subject){
            super(name);
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }
        public void teach(){
            System.out.println(name + " is teaching "+ subject);
        }
    }

    public static class Student extends Person{
        public int grade;
        public Student(String name, int grade){
            super(name);
            this.grade = grade;
        }

        public void learn(){
            System.out.println(name+ " is having "+ grade + " grade");
        }
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("surangi", "English");
        Student student = new Student("ranga", 10);

        teacher.teach();
        student.learn();
    }
}
