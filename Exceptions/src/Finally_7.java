public class Finally_7 {

//    finally-секция получает управление, если try-блок завершился успешно
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    если try-блок завершился исключением
//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    даже если try-блок завершился директивой выхода из метода
//    public static void main(String[] args) {
//        try {
//            return;
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    finally-секция НЕ вызывается только если мы «прибили» JVM
//    public static void main(String[] args) {
//        try {
//            System.exit(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    аналогично предыдущему
//    public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().exit(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    аналогично предыдущему
//    public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().halt(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }

//    javadoc: java.lang.Runtime#halt(int status)
//    … Unlike the exit method, this method does not cause shutdown hooks to be started and does not run
//    uninvoked finalizers if finalization-on-exit has been enabled. If the shutdown sequence has already been
//    initiated then this method does not wait for any running shutdown hooks or finalizers to finish their work.

//    не может «починить» try-блок завершившийся исключением
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {throw new RuntimeException();}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }


//    не может «предотвратить» выход из метода, если try-блок вызвал return
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {return;}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }


//    Однако finally-секция может «перебить» throw/return при помощи другого throw/return
//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            return 1;
//        }
//    }


//    тут мы затерли ошибку
//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new RuntimeException();
//        } finally {
//            return 1;
//        }
//    }


//    а тут возвращаемое значение
//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            throw new RuntimeException();
//        }
//    }


//    здесь затрется одна ошибка другой
//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new Error();
//        } finally {
//            throw new RuntimeException();
//        }
//    }


//    Нет исключения
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            // nothing
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }


//    Есть исключение и есть подходящий catch
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }


//    try-cacth-finally тоже допускает неограниченное вложение
//    Вложенный try-catch-finally без исключения
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                // НИЧЕГО
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // НЕ заходим - нет исключения
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // заходим - выполнение в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // НЕ заходим - нет исключения
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение в норме
//    }


//    Вложенный try-catch-finally с исключением, которое ПЕРЕХВАТИТ ВНУТРЕННИЙ catch
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new RuntimeException();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // ЗАХОДИМ - есть исключение
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // заходим - выполнение УЖЕ в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // не заходим - нет исключения, УЖЕ перехвачено
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
//    }
}
