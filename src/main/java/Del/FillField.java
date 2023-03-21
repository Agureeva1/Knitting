package Del;

public class FillField {

    private static String wrongX = "Вы указали неверное значение колонки";
    private static String wrongY = "Ошибка в указании номера ряда";
    private static String wrongTo = "Ошибка в указании последней меняемой ячейке";
    private static String wrongFrom = "Ошибка в указании начала отсчета";

//    public static void fillRow(int y, char q) {
//        if (y > 0 && y <= getCoordinatesY()) {
//            for (int i = 0; i < getCoordinatesX(); i++) {
//                getField()[y - 1][i] = q;
//            }
//        } else {
//            System.out.println(wrongY);
//        }
//    }
//
//    public static void fillRowFromTo(int y, int from, int to, char q) {
//        if (y > 0 && y <= getCoordinatesY()) {
//            if (from > 0 && from < getCoordinatesX()) {
//                if (to > from && to <= getCoordinatesX()) {
//                    for (int i = from - 1; i < to; i++) {
//                        getField()[y - 1][i] = q;
//                    }
//                } else {
//                    System.out.println(wrongTo);
//                }
//            } else {
//                System.out.println(wrongFrom);
//
//            }
//        } else {
//            System.out.println(wrongY);
//        }
//    }
//
//    public static void fillCell(int y, int x, char q) {
//        if (y > 0 && y <= getCoordinatesY()) {
//            if (x > 0 && x <= getCoordinatesX()) {
//                getField()[y - 1][x - 1] = q;
//            } else {
//                System.out.println(wrongX);
//            }
//        } else {
//            System.out.println(wrongY);
//        }
//    }
//
//    public static void fillColumn(int x, char q) {
//        if (x > 0 && x <= getCoordinatesX()) {
//            for (int i = 0; i < getCoordinatesY(); i++) {
//                getField()[i][x - 1] = q;
//            }
//        } else {
//            System.out.println(wrongX);
//        }
//    }
//
//    public static void fillColumnFromTo(int x, int from, int to, char q) {
//        if (x > 0 && x <= getCoordinatesX()) {
//            if (from > 0 && from < getCoordinatesY()) {
//                if (to > from && to <= getCoordinatesY()) {
//                    for (int i = from - 1; i < to; i++) {
//                        getField()[i][x - 1] = q;
//                    }
//                } else {
//                    System.out.println(wrongTo);
//                }
//            } else {
//                System.out.println(wrongFrom);
//            }
//        } else {
//            System.out.println(wrongX);
//        }
//    }


}
