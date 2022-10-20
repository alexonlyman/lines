public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan ";
        String lastName = "Ivanovich ";
        String middleName = "Ivanov ";
        String  fullName = middleName + firstName + lastName;
        System.out.println("ФИО сотрудника "+ fullName);
        System.out.println();
        String fullnameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullnameUpper);
        System.out.println();
        String fullSecondName = "Иванов Семён Семёнович ";
        fullSecondName = fullSecondName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника "+ fullSecondName);

    }
}
