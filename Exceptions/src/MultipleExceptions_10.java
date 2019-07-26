public class MultipleExceptions_10 {

//      Мы можем точно указать, что бросаем
//    // в сигнатуре оба исключения
//        public static void main(String[] args) throws EOFException, FileNotFoundException {
//            if (System.currentTimeMillis() % 2 == 0) {
//                throw new EOFException();
//            } else {
//                throw new FileNotFoundException();
//            }
//        }


//      или вот так
//    // в сигнатуре оба исключения
//        public static void main(String[] args) throws EOFException, FileNotFoundException {
//            f0();
//            f1();
//        }
//        public static void f0() throws EOFException {...}
//        public static void f1() throws FileNotFoundException {...}


//    А можем предупредить о предке (предке обоих исключений)
//    // указываем предка исключений
//        public static void main(String[] args) throws IOException {
//            if (System.currentTimeMillis() % 2 == 0) {
//                throw new EOFException();
//            } else {
//                throw new FileNotFoundException();
//            }
//        }


//    или вот так
//    // указываем предка исключений
//        public static void main(String[] args) throws IOException {
//            f0();
//            f1();
//        }
//        public static void f0() throws EOFException {...}
//        public static void f1() throws FileNotFoundException {...}


//    EOFException и FileNotFoundException «обобщаем до» IOException, а InterruptedException «пропускаем нетронутым»
//    (InterruptedException — НЕ потомок IOException)
//    public static void main(String[] args) throws IOException, InterruptedException {
//        f0();
//        f1();
//        f2();
//    }
//    public static void f0() throws EOFException {...}
//    public static void f1() throws FileNotFoundException {...}
//    public static void f2() throws InterruptedException {...}

}
