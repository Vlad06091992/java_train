package syntaxis_practics.codewars;

/*
* Кейт и Майкл хотят купить пиццу и разделить её.
* В зависимости от цены пиццы, они собираются разделить расходы следующим образом:

Если пицца стоит меньше 5 евро, Майкл угощает Кейт, то есть Майкл оплачивает полную стоимость.
В противном случае Кейт внесёт 1/3 от стоимости, но не более 10 евро (у неё нет денег :-) ), а Майкл заплатит оставшуюся часть.

Сколько заплатит Майкл? Рассчитайте сумму с точностью до двух знаков после запятой, если это необходимо.
* */

import java.text.DecimalFormat;

public class PizzaPayments {

    private static final double freePizzaForKate = 5;
    private static final double KateMoneys = 10;

    //стоимость пиццы - cost
    public static double michaelPays(double cost) {

        double result = 0;

        if (cost < freePizzaForKate) result = cost;
        else {
            double oneThird = cost * (1.0 / 3.0);
            result = oneThird > KateMoneys ? cost - KateMoneys : cost - oneThird;
        }

        return Math.round(result * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println(PizzaPayments.michaelPays(30));
    }
}