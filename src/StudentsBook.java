public class StudentsBook {
    public static void studentInfo(Griffindor student) {
        System.out.println("Имя: " + student.getName() + ", Благородство: " + student.getNobility() +
                ", Честь: " + student.getHonor() + ", Храбрость: " + student.getBravery());
    }

    public static void studentInfo(Hufflepuff student) {
        System.out.println("Имя: " + student.getName() + ", Благородство: " + student.getHardworking() +
                ", Честь: " + student.getLoyal() + ", Храбрость: " + student.getHonest());
    }

    public static void studentInfo(Ravenclaw student) {
        System.out.println("Имя: " + student.getName() + ", Ум: " + student.getSmart() +
                ", Мудрость: " + student.getWise() + ", Остроумие: " + student.getWitty() +
                ", Творчество: " + student.getCreative());
    }

    public static void studentInfo(Slytherin student) {
        System.out.println("Имя: " + student.getName() + ", Хитрость: " + student.getCunning() +
                ", Решительность: " + student.getDetermination() + ", Амбициозность: " + student.getAmbushes() +
                ", Находчивость: " + student.getResourcefulness() + ", Жажда власти: " + student.getThirstForPower());
    }

    private static int studentSumPoints(Griffindor student) {
        return student.getHonor() + student.getBravery() + student.getNobility();
    }

    private static int studentSumPoints(Slytherin student) {
        return student.getAmbushes() + student.getResourcefulness() + student.getThirstForPower() +
                student.getDetermination() + student.getCunning();
    }

    private static int studentSumPoints(Hufflepuff student) {
        return student.getHonest() + student.getLoyal() + student.getHardworking();
    }

    private static int studentSumPoints(Ravenclaw student) {
        return student.getWitty() + student.getWise() + student.getCreative() + student.getSmart();
    }

    private static String whoIsTheBest(Hogwards student1, Hogwards student2, int student1Points, int student2Points) {
        if (student1Points < student2Points) {
            return (student2.getName() + " лучший студент чем " + student1.getName());
        } else if (student1Points > student2Points) {
            return (student1.getName() + " лучший студент чем " + student2.getName());
        } else {
            return "Стунденты " + student1.getName() + " и " + student2.getName() + " хороши одинаково";
        }
    }

    public static void studentComparing(Griffindor student1, Griffindor student2) {
        int student1Points = studentSumPoints(student1);
        int student2Points = studentSumPoints(student2);
        System.out.println(whoIsTheBest(student1, student2, student1Points, student2Points));
    }

    public static void studentComparing(Slytherin student1, Slytherin student2) {
        int student1Points = studentSumPoints(student1);
        int student2Points = studentSumPoints(student2);
        System.out.println(whoIsTheBest(student1, student2, student1Points, student2Points));
    }

    public static void studentComparing(Hufflepuff student1, Hufflepuff student2) {
        int student1Points = studentSumPoints(student1);
        int student2Points = studentSumPoints(student2);
        System.out.println(whoIsTheBest(student1, student2, student1Points, student2Points));
    }

    public static void studentComparing(Ravenclaw student1, Ravenclaw student2) {
            int student1Points = studentSumPoints(student1);
            int student2Points = studentSumPoints(student2);
            System.out.println(whoIsTheBest(student1, student2, student1Points, student2Points));
    }

    public static void studentComparing(Hogwards student1, Hogwards student2) {

        if (student1.getTransgressionDistance() < student2.getTransgressionDistance()) {
            System.out.println(student2.getName() + " дальше транссгресирует, чем студент " + student1.getName());
        } else {
            System.out.println(student1.getName() + " дальше транссгресирует, чем студент " + student2.getName());
        }
        if (student1.getTransgressionDistance() == student2.getTransgressionDistance()) {
            System.out.println("Стунденты " + student1.getName() + " и " + student2.getName() +
                    " одинаково далеко трансгрессируют");
        }
        if (student1.getPowerOfWitchcraft() > student2.getPowerOfWitchcraft()) {
            System.out.println("Магия студента " + student1.getName() + " мощнее, чем " + student2.getName());
        } else {
            System.out.println("Магия студента " + student2.getName() + " мощнее, чем " + student1.getName());
        }
        if (student1.getTransgressionDistance() == student2.getTransgressionDistance()) {
            System.out.println("Магия стундентов " + student1.getName() + " и " + student2.getName() +
                    " одинаково сильна");
        }
    }
}
