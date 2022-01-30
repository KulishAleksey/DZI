package hw200;

public class Employee {
    // это поля класса
    String name; //ФИО
    String position; //должность
    String tabel; //табель
    String phone_number; //номер телефона
    int salary; //зарплата
    int age; //возраст

    // это конструктор
    public Employee(String name, String position, String tabel, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.tabel = tabel;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    // это переопределенный метод
    @Override
    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nТабельный №: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, tabel, phone_number, salary, age);}

    // это метод вывода в консоль (как по заданию)
    public void print(){
        System.out.println(this);
    }


    public static void main(String[] args)  {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Вячеслав Кобрин", "Генеральный директор", "236", "+79996665544", 250000, 55);
        persArray[1] = new Employee("Иван Зайцев", "Директор по развитию", "248", "+79998884455", 127000, 42);
        persArray[2] = new Employee("Дмитрий Медведев", "Охранник", "142", "+79997771234", 19000, 41);
        persArray[3] = new Employee("Олеся Лисина", "Ведущий разработчик", "456", "+79995554789", 120000, 46);
        persArray[4] = new Employee("Кристина Волкова", "Директор по работе с клиентами", "57", "+79994445896", 138000, 48);

        // если у объекта в ячейке i поле age > 40, то у него вызывается метод print()
        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();

    }
}