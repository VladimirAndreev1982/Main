public class Main {
    public static void main(String[] args) {

        int deposit_start = 100; // начальный счёт
        int deposit_add = 1100; // сумма пополнения
        int bonus_cost = 100; // один бонус за каждые 100 руб.
        int bonus_condition = 1000; // расчёт бонусов если клиент пополняет счёт более чем на 1000 руб.

        int bonus_quantity; // кол-во бонусов
        int bonus_all; // итоговая сумма с бонусами

        if (deposit_add > bonus_condition) {
            bonus_quantity = deposit_add / bonus_cost; // кол-во бонусов
            bonus_all = deposit_start + deposit_add + bonus_quantity; // итоговая сумма с бонусами
        } else {
            bonus_quantity = 0; // кол-во бонусов
            bonus_all = deposit_start + deposit_add + bonus_quantity; // итоговая сумма с бонусами
        }
        System.out.println("Количество бонусных рублей: " + bonus_quantity);
        System.out.println("Итоговый счёт: " + bonus_all);
    }
}
