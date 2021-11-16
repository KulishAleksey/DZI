package lesson7;

public class HumanRunner {

    public static void main(String[] args) {
        Human me = new Human();
        me.name = "Aleksey";
        me.surname = "Kulish";
        me.age = 32;
        me.weight = 82;
        me.height = 186;
        me.hasQrCode = true;

        Human NataliaIvanovna = new Human();
        NataliaIvanovna.name = "Natalia";
        NataliaIvanovna.surname = "Chalanova";
        NataliaIvanovna.age = 42;
        NataliaIvanovna.weight = 60;
        NataliaIvanovna.height = 165;
        NataliaIvanovna.hasQrCode = false;

        Human incognito = new Human("Unknown", "Unknown", -1, -1, -1, null);

        Human VasyaPupkin = new Human("Vasiliy", "Pupkin", 50, -1, -1, null );

        System.out.println(me == VasyaPupkin);
        System.out.println(me == me);

        Human [] humans = new Human[] {me, NataliaIvanovna, incognito, VasyaPupkin};
        for (Human human: humans) {
            if (Integer.valueOf(50).equals(human.age)) {
                System.out.println("Человек с именем " + human.name + " и фамилия " + human.surname + " имеет возраст 50");
            }
        }

        me.deOlder();
        System.out.println("Мне на след. год исполнится " + me.getAge());
        me.vaccinated();
        System.out.println("Наличе кода " + me.getHasQrCode());

        me.setName("Aleksey");
        System.out.println("Теперь я " +    me.getName());
    }
}