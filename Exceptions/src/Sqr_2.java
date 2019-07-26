public class Sqr_2 {

//    public double sqr(double arg) { // надо double
//        return arg * arg;           // double * double - это double
//    }


//    public double sqr(double arg) { // надо double
//        int k = 1;                  // есть int
//        return k;                   // можно неявно преобразовать int в double
//    }


//    public double sqr(double arg) { // надо double
//        int k = 1;                  // есть int
//        return (double) k;          // явное преобразование int в double
//    }


//    вот так не пройдет (другой тип)
//    public static double sqr(double arg) {
//        return "hello!";
//    }


//    Вот так не выйдет — нет возврата
//    public static double sqr(double arg) {
//    }


//    Тоже нет возврата
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // если currentTimeMillis() - четное число, то все ОК, но не компилируется
//        }
//    }


//    public static double sqr(double arg) {
//        while (true) ; // КОМПИЛИРУЕТСЯ!
//    }


//    Тут в d никогда ничего не будет присвоено, так как метод sqr повисает
//    public static void main(String[] args) {
//        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
//        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//    }
//
//    public static double sqr(double arg) {
//        while (true) ; // Вот тут мы на века "повисли"
//    }


//    Компилятор пропустит «вилку» (таки берем в квадрат ИЛИ висим)
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // ну ладно, вот твой double
//        } else {
//            while (true);     // а тут "виснем" навсегда
//        }
//    }


//    Но механизм исключений позволяет НИЧЕГО НЕ ВОЗВРАЩАТЬ!
//    public static double sqr(double arg) {
//        throw new RuntimeException();
//    }


//    public static double sqr(double arg) {// согласно объявлению метода он должен вернуть double
//        long time = System.currentTimeMillis();
//        if (time % 2 == 0) {
//            return arg * arg;             // ок, вот double
//        }
//        if (time % 2 == 1) {
//            while (true) ;                 // или можно "повиснуть"
//        } else {
//            throw new RuntimeException(); // или бросить исключение
//        }
//    }


//    public static void main(String[] args) {
//        // sqr - "сломается" (из него "выскочит" исключение),
//        double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
//        // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//        System.out.println(d); // и печатать нам ничего не придется!
//    }
//    public static double sqr(double arg) {
//        throw new RuntimeException(); // "бросаем" исключение
//    }
}

