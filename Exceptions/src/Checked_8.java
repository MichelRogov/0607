public class Checked_8 {

//    Мы не можем бросать, но не предупредить
//        public static void main(String[] args) {
//            throw new Exception(); // тут ошибка компиляции
//        }


//    Мы не можем бросать, но предупредить о «меньшем»
//        public static void main(String[] args) throws IOException {
//            throw new Exception(); // тут ошибка компиляции
//        }


//    Мы можем предупредить точно о том, что бросаем
//        public static void main(String[] args) throws Exception { // предупреждаем о Exception
//            throw new Exception(); // и кидаем Exception
//        }


//    Мы можем предупредить о большем, чем мы бросаем
//        public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
//            throw new Exception(); // а кидаем только Exception
//        }


//    Можем даже предупредить о том, чего вообще нет
//        public static void main(String[] args) throws Exception { // пугаем
//            // но ничего не бросаем
//        }


//    Даже если предупреждаем о том, чего нет — мы обязанны указывать это в сигнатуре или ловить ошибку
//        public static void main(String[] args) {
//            f(); // тут ошибка компиляции
//        }
//        public static void f() throws Exception {
//        }


//    Можно пробросить выше не только само исключение но и его предка
//    // метод main пробросил целый Throwable
//        public static void main(String[] args) throws Throwable {
//            f();
//        }
//    // хотя мы бросили всего-лишь Exception
//        public static void f() throws Exception {
//        }
}
