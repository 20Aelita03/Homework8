public class Main {


    public static String calculationLeapYear(int year) {
        boolean control1;
        String answer = "";
        control1 = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        if (control1 == true) {
            answer += year + " — високосный год";
        } else {
            answer += year + " — не високосный год";
        }
        return answer;
    }

    public static String chooseAppVersion(int OS, int year) {
        String conclusion = "";
        if (OS == 0) {
            if (year < 2015){
                conclusion += "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                conclusion += "Установите версию приложения для iOS по ссылке";
            }
        } else if (year < 2015){
            conclusion += "Установите облегченную версию приложения для Android по ссылке";
        } else {
            conclusion += "Установите версию приложения для Android по ссылке";
        }
        return conclusion;
    }

    public static int countingDeliveryDays(int deliveryDistance) {
        int deliverDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval) {
            deliverDays = 1;
        } else {
            deliverDays += (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        return deliverDays;
    }

    public static void main(String[] args) {
        //Task1
        int year1 = 2024;
        System.out.println(calculationLeapYear(year1));

        //Task2
        int OS = 0;
        int yearOfManufactureOfThePhone = 2020;
        System.out.println(chooseAppVersion(OS, yearOfManufactureOfThePhone));

        //Task3
        int distance = 47;
        System.out.println("Потребуется дней: " + countingDeliveryDays(distance));

    }
}