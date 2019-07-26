public class Throw_1 {
//    Можно кинуть только наследника класса Throwable:
//    public static void main(String[] args) throws Throwable {
//    }


//    String кунить как ошибку нельзя
//    public static void main(String[] args) throws String {
//    }


//    Скомпилируется
//    public static void main(String[] args) {
//        try {
//        } catch (Throwable t) {
//        }
//    }


//    Будет ошика компиляции
//    public static void main(String[] args) {
//        try {
//        } catch (String s) {
//        }
//    }


//    Так можно
//    public static void main(String[] args) {
//        // Error - потомок Throwable
//        throw new Error();
//    }


//    Ошибка
//    public static void main(String[] args) {
//        throw new String("Hello!");
//    }


//    Кроме того, throw требуется не-null аргумент, иначе NullPointerException в момент выполнения
//    public static void main(String[] args) {
//        throw null;
//    }


//    throw и new — это две независимых операции. В следующем коде мы независимо создаем объект исключения и «бросаем» его
//    public static void main(String[] args) {
//        Error ref = new Error(); // создаем экземпляр
//        throw ref;               // "бросаем" его
//    }


//    -------------------------------------
//    >> RUNTIME ERROR: Exception in thread "main" java.lang.StackOverflowError
//    public static void main(String[] args) {throw new Exception(); // тут ошибка компиляции
//        f(null);
//    }
//    public static void f(NullPointerException e) {
//        try {
//            throw e;
//        } catch (NullPointerException npe) {
//            f(npe);
//        }
//    }


//    -------------------------------------
//    Разные способы прервать цикл
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.print("0");
            f();
            System.out.println("4");
        }

    }

    public static void f() {
        for (int i = 1; i <= 2; i++) {
            System.out.print("1");
//            continue;     //прервет данную итерацию цикла
//            break;        // выйдет из цикла
//            return;       //выйдет из метода
//            throw new RuntimeException(); //разрушит весь стек
            System.out.print("2");
        }
        System.out.print("3");
    }
}
