public class Main {
    public static void main(String[] args) {
        Hogwards[] students = {
                //Качества учеников можно задавать с помощью конструктора
                new Griffindor("Гарри Поттер", 82, 56, 26, 14, 95),
                new Griffindor("Гермиона Грейнджер", 56, 14, 92, 19, 55),
                new Griffindor("Рон Уизли", 48, 22, 31, 66, 46),

                new Slytherin("Драко Малфой", 32, 45, 47, 63, 65,54,56),
                new Slytherin("Грэхэм Монтегю", 22, 65, 37, 33, 55,55,25),
                new Slytherin("Грегори Гойл", 42, 75, 75, 34, 75,59,89),

                new Hufflepuff("Захария Смит", 62,98,96,47,52),
                new Hufflepuff("Седрик Диггори", 47,95,8,54,22),
                new Hufflepuff("Джастин Финч-Флетчли", 60,81,96,47,12),

                new Ravenclaw("Чжоу Чанг",56,59,57,59,46,48),
                new Ravenclaw("Падма Патил",53,57,59,46,48, 85),
                new Ravenclaw("Маркус Белби",53,57,59,46,48, 85)
        };

        /**
         * Реализован метод, который выводит на экран описание студента: качества,
         * присущие всем ученикам школы и присущие определенному факультету.
         */
        StudentsBook.studentInfo((Griffindor) students[0]);
        StudentsBook.studentInfo((Slytherin) students[4]);
        StudentsBook.studentInfo((Hufflepuff) students[7]);
        StudentsBook.studentInfo((Ravenclaw) students[9]);

        System.out.println();

        /**
         * Реализованы методы, которые выводят на экран результат сравнения двух
         * учеников одного факультета по свойствам только это факультета
         */
        StudentsBook.studentComparing((Griffindor) students[0], (Griffindor) students[1]);
        StudentsBook.studentComparing((Slytherin) students[4], (Slytherin) students[5]);
        StudentsBook.studentComparing((Hufflepuff) students[6], (Hufflepuff) students[7]);
        StudentsBook.studentComparing((Ravenclaw) students[10], (Ravenclaw) students[11]);

        System.out.println();

        /**
         * Реализован метод, который сравнивает двух любых учеников по присущим всем ученикам школы характеристикам.
         */
        StudentsBook.studentComparing(students[0], students[9]);
    }
}