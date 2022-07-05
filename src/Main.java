public class Main {
    public static void main(String[] args) {

        int depositStart = 100; // начальный счёт
        int depositAdd = 1100; // сумма пополнения
        int bonusCost = 100; // один бонус за каждые 100 руб.
        int bonusCondition = 1000; // расчёт бонусов если клиент пополняет счёт более чем на 1000 руб.

        int bonusQuantity; // кол-во бонусов
        int bonusAll; // итоговая сумма с бонусами

        if (deposit_Add > bonusCondition) {
            bonusQuantity = depositAdd / bonusCost; // кол-во бонусов
            bonusAll = depositStart + depositAdd + bonusQuantity; // итоговая сумма с бонусами
        } else {
            bonusQuantity = 0; // кол-во бонусов
            bonusAll = depositStart + depositAdd + bonusQuantity; // итоговая сумма с бонусами
        }
        System.out.println("Количество бонусных рублей: " + bonusQuantity);
        System.out.println("Итоговый счёт: " + bonusAll);
    }
}
