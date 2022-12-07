public class Main {
    public static void main(String[] args) {
        int dayOfWeek = 1;
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Сегодня будний день");
                break;
            case 6:
            case 7:
                System.out.println("Сегодня выходной!!!");
                break;
            default:
                System.out.println("Нет такого дня");
        }
    }
}