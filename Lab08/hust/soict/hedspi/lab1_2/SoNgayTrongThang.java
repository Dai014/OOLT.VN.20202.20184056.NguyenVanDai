package hust.soict.hedspi.lab1_2;

import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        String month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng: ");
        month = scanner.next();

        switch (month) {
            // các tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày.
            case "1":
            case "January":
            case "3":
            case "March":
            case "5":
            case "May":
            case "7":
            case "July":
            case "August":
            case "October":
            case "December":
            case "8":
            case "10":
            case "12":
            case "Jan":
            case "Mar":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.println("Tháng " + month + " có 31 ngày.");
                break;

            // các tháng 4, 6, 9, 11 có 30 ngày
            case "4":
            case "April":
            case "June":
            case "September":
            case "November":
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
            case "6":
            case "9":
            case "11":
                System.out.println("Tháng " + month + " có 30 ngày.");
                break;

            // tháng 2 nếu là năm nhuận  29 ngày, k thif 28 ngày.
            case "2":
            case "February":
            case "Feb":
                int year;
                System.out.println("Mời bạn nhập năm: ");
                year = scanner.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
                } else {
                    System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
                }
                break;
            default:
                System.out.println("Nhập tháng không hợp lệ.");
        }
    }

}