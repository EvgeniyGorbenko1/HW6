import java.util.Scanner;

class Main {
    //  Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
    //  метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
    //  который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
    //  выводит текущую информацию о карточке. Напишите программу, которая создает три
    //  объекта класса CreditCard у которых заданы номер счета и начальная сумма.
    //  Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
    //  третьей. Выведите на экран текущее состояние всех трех карточек
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("234321", 2004.12);
        CreditCard creditCard2 = new CreditCard("234322", 2333.43);
        CreditCard creditCard3 = new CreditCard("234323", 134.36);

        creditCard1.deposit(250);
        creditCard2.deposit(121);
        creditCard3.withdraw(130);

        System.out.println("Текущее состояние счетов:");
        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
    }
}

