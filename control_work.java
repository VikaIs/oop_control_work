public class Student {
    // Атрибути класу
    String name;          // Ім'я студента
    int age;             // Вік
    double averageScore; // Середній бал

    // Створювємо об'єкт з початковими даними
    public Student(String name, int age, double averageScore) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }

    // Метод 1: Виводить інформацію про студента
    public void displayInfo() {
        System.out.println("Студент: " + name + ", Вік: " + age + ", Сер. бал: " + averageScore);
    }

    // Метод 2: Перевіряє, чи є студент відмінником
    public void checkHonors() {
        if (averageScore >= 4.5) {
            System.out.println(name + " — відмінник!");
        } else {
            System.out.println(name + " — старається, але є куди рости.");
        }
    }

    // Головний метод для перевірки роботи класу
    public static void main(String[] args) {
        // Створюємо екземпляр класу Student
        Student myStudent = new Student("Віка", 17, 4.9);

        // Викликаємо методи
        myStudent.displayInfo();
        myStudent.checkHonors();
    }
}
