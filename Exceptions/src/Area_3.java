public class Area_3 {

//    Можно вывести в консоль
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.out.println("Bad ...");
//        }
//        return width * height;
//    }


//    Можно вернуть специальное значение
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            return -1; // специальное "неправильное" значение площади
//        }
//        return width * height;
//    }


//    Можем целиком остановить виртуальную машину
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.exit(0);
//        }
//        return width * height;
//    }


//    Но «правильный путь» таков: если обнаружили возможное некорректное поведение, то
//    1. Вычисления остановить, сгенерировать сообщение-поломку, которое трудно игнорировать,
//    предоставить пользователю информацию о причине
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
//        }
//        return width * height;
//    }

}
