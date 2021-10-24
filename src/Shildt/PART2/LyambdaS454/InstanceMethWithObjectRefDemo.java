package Shildt.PART2.LyambdaS454;

/**
 * pag 456 line 38?
 */

@FunctionalInterface
interface MyFunc<T> {
    boolean func(T v1, T v2);
}

//    Класс для хранения максимальной температуры за день
class HighTemp {
    private int hTemp;

    public HighTemp(int ht) {
        this.hTemp = ht;
    }

    //    возвратить логическое значение true,   если вызывающий объект
//    типа HighTemp имеет такую же температуру,   как и  у объекта ht2
    boolean semeTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    //    возвратить логическое значение true, если вызывающий объект
//    типа HighTemp имеет  температуру ниже,   чем у  объекта ht2
    boolean lessThenTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class InstanceMethWithObjectRefDemo {
    //    Метод, возвращающий количество экземпляров объекта,
//    найденных по критериям, задаваемым параметром
//    функционального интерфейс MyFunc
    static <T> int counter(T[] vals, MyFunc<T> f, T val) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) if (f.func(vals[i], val)) count++;
        return count;
    }

    public static void main(String[] args) {
        int count;
//        создать массив объектов типа HighTemp
        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(90), new HighTemp(89), new HighTemp(84),
                new HighTemp(82), new HighTemp(89), new HighTemp(91), new HighTemp(83),
        };
//        Использовать ме тод counter() вместе с  массивами объектов
//        типа HighTemp.  Обратите внимание на то,  что ссЬ1Лка на метод
//        экземпляра semiTemp()  передается в  качестве второго параметра
        count = counter(weekDayHighs, HighTemp::semeTemp, new HighTemp(89));
        System.out.println("Дней,   когда максимальная температура была 89: " + count);

//        А  теперь создать и  использовать вместе с  данным/
//        тодом еще  один массив объектов типа HighTemp
        HighTemp[] weekDayHighs2 = {
                new HighTemp(32), new HighTemp(12), new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12), new HighTemp(-1), new HighTemp(13),
        };
        count = counter(weekDayHighs2, HighTemp::semeTemp, new HighTemp(12));
        System.out.println("Дней,   когда максимальная температура была 12: " + count);

//        А  теперь воспользоваться методом lessThenTemp () , чтобы
//        выяснить,   сколько дней температура  была меньше заданной
        count = counter(weekDayHighs, HighTemp::lessThenTemp, new HighTemp(89));
        System.out.println("Дней,   когда максимальная температура была меньше 89: " + count);
        count = counter(weekDayHighs2, HighTemp::lessThenTemp, new HighTemp(19));
        System.out.println("Дней,   когда максимальная температура была меньше 19: " + count);
    }
}
