public class Unchecked_9 {

    //    Вызов метода, который бросает unchecked исключением не накладывает на нас никаких обязанностей.
    public static void main(String[] args) {
        f();
    }

    public static void f() throws RuntimeException {
    }

//    Пример (java.lang.NumberFormatException — непроверяемое исключение):
//            package java.lang;
//
//    public final class Integer extends Number implements Comparable<Integer> {
//    ...
//        /**
//         * ...
//         *
//         * @param s    a {@code String} containing the {@code int}
//         *             representation to be parsed
//         * @return     the integer value represented by the argument in decimal.
//         * @exception  NumberFormatException  if the string does not contain a
//         *               parsable integer.
//         */
//        public static int parseInt(String s) throws NumberFormatException {
//            return parseInt(s,10);
//        }
//    ...
//    }
//    — в сигнатуре метода: throws NumberFormatException
//    — в документации (javadoc): @ exception
//      Все равно нас это не обязывает проверять это исключение

}
