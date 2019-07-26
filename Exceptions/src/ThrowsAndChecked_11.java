public class ThrowsAndChecked_11 {

//    Не надо указывать в сигнатуре то, что вы перехватили так
//        public static void main(String[] args) {
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                // ...
//            }
//        }


//    или так (ставим catch по предку и точно перехватываем)
//        public static void main(String[] args) {
//            try {
//                throw new Exception();
//            } catch (Throwable e) {
//                // ...
//            }
//        }


//    Но если перехватили только потомка, то не выйдет
//        public static void main(String[] args) {
//            try {
//                throw new Throwable();
//            } catch (Exception e) {
//                // ...
//            }
//        }


//    Не годится, естественно, и перехватывание «брата»
//        public static void main(String[] args) {
//            try {
//                throw new Exception();
//            } catch (Error e) {
//                // ...
//            }
//        }


//    Если вы часть перехватили, то можете это не указывать
//    // EOFException перехватили catch-ом, его не указываем
//        public static void main(String[] args) throws FileNotFoundException {
//            try {
//                if (System.currentTimeMillis() % 2 == 0) {
//                    throw new EOFException();
//                } else {
//                    throw new FileNotFoundException();
//                }
//            } catch (EOFException e) {
//                // ...
//            }
//        }


//    — проверка на cheched исключения происходит в момент компиляции (compile-time checking)
//    — перехват исключений (catch) происходит в момент выполнения (runtime checking)
//    // указываем Exception
//        public static void main(String[] args) throws Exception {
//            Throwable t = new Exception(); // и лететь будет Exception
//            throw t; // но тут ошибка компиляции
//        }

//    Полная аналогия с
//    public static void main(String[] args) throws Exception {
//        Object ref = "Hello!";  // ref указывает на строку
//        char c = ref.charAt(0); // но тут ошибка компиляции
//    }

//    Хотя ССЫЛКА ref УКАЗЫВАЕТ на объект типа java.lang.String (у которого имеется метод charAt(int)),
//    но ТИП ССЫЛКИ — java.lang.Object (ссылка типа java.lang.Object на объект типа java.lang.String).
//    Компилятор ориентируется на «левый тип» (тип ссылки, а не тип ссылаемого) и не пропускает такой код.

//    В ДАННОЙ СИТУАЦИИ компилятор мог бы разобрать, что t ссылается на Exception, а ref — на String,
//    но этого уже невозможно сделать при раздельно компиляции. Представьте, что мы МОГЛИ БЫ скомпилировать ОТДЕЛЬНО
//    такой класс, упаковать в jar и распространять
//    // НЕ КОМПИЛИРУЕТСЯ! ИССЛЕДУЕМ ГИПОТЕТИЧЕСКУЮ СИТУАЦИЮ!
//    public static void f0(Throwable t) throws Exception {
//        throw t;
//    }
//    public static void f1(Object ref) {
//        char c = ref.charAt(0);
//    }

//    А кто-то берет этот класс, добавляет в classpath и вызывает App.f0(new Throwable()) или App.f1(new Integer(42)).
//    В таком случае JVM столкнулась бы с ситуацией, когда от нее требует бросить проверяемое исключение, которое не
//    отследил компилятор (в случае с f0) или вызвать метод, которого нет (в случае с f1)!

//    Компилятор не пропустит этот код, хотя метод main ГАРАНТИРОВАННО НЕ ВЫБРОСИТ ИСКЛЮЧЕНИЯ
//    пугаем Exception
//    public static void main(String[] args) throws Exception {
//        try {
//            Throwable t = new Exception(); // и лететь будет Exception
//            throw t; // но тут ошибка компиляции
//        } catch (Exception e) {
//            System.out.println("Перехвачено!");
//        }
//    }

//    public static void main(String[] args) throws Throwable {
//        try {
//            Throwable t = new Exception(); // а лететь будет Exception
//            throw t;
//        } catch (Exception e) { // и мы перехватим Exception
//            System.out.println("Перехвачено!");
//        }
//    }
//
//>> Перехвачено!

//    Java — язык со статической типизацией (т.е. отслеживание корректности использования типов
//    (наличие используемых полей, наличие вызываемых методов, проверка на checked исключения, ...)
//    проводится компилятором), запрещает такое поведение.
}
