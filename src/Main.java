public class Main {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("лег щавелев ", "Генеральный директор", "dkhjg@mail.ru", "89258887754", 100000, 50);
        persArray[1] = new Employee("Иван Морш", "Бугалтер", "qwdih@mail.ru", "892258976541", 80000, 48);
        persArray[2] = new Employee("Ольга Бикмаева", "Кассир", "sdfjg@mail.ru", "89032587541", 50000, 29);
        persArray[3] = new Employee("ВАсилий Шпак", "Убощик", "sdglkh@mail.ru", "+89635549688", 12000, 59);
        persArray[4] = new Employee("Дмитрий Федоров", "менеджер ", "ihawf@mail.ru", "89269268544", 98000, 25);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40)
                persArray[i].print();
        }
    }

}
