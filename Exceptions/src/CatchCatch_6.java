public class CatchCatch_6 {

//    нельзя ставить потомка после предка
//    public static void main(String[] args) {
//        try {
//        } catch (Exception e) {
//        } catch (RuntimeException e) {
//        }
//    }


//    брата после брата — можно
//    public static void main(String[] args) {
//        try {
//        } catch (Error e) {
//        } catch (RuntimeException e) {
//        }
//    }


//    JVM идет сверху-вниз до тех пор, пока не найдет такой catch в котором указано нужное исключение или его предок
//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");
//    }


//    Выбор catch осуществляется в runtime (а не в compile-time), значит учитывается не тип ССЫЛКИ (Throwable),
//    а тип ССЫЛАЕМОГО (Exception)
//    public static void main(String[] args) {
//        try {
//            Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
//            throw t;
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");
//    }
//}
//>> catch Exception
//>> next statement

}
