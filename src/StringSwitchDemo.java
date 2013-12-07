/**
 * Created by rhenning on 12/7/13.
 */

class StringSwitchDemo {}

// this only works in Java SE 7+ (aka "Java 1.7")
// we can use if/elseif/else with month.equals("whatever") instead on <= 1.6

//class StringSwitchDemo {
//    public static int getMonthNumber(String month) {
//        int monthNumber = 0;
//
//        if (month == null) {
//            return monthNumber;
//        }
//
//        switch (month.toLowerCase()) {
//            // this only works in Java SE 7+ (aka "Java 1.7")
//            // we can use if/elseif/else with month.equals("whatever") instead on <= 1.6
//            case     "january":
//                monthNumber = 1;
//                break;
//            case "february":
//                monthNumber = 2;
//                break;
//            case "march":
//                monthNumber = 3;
//                break;
//            case "april":
//                monthNumber = 4;
//                break;
//            case "may":
//                monthNumber = 5;
//                break;
//            case "june":
//                monthNumber = 6;
//                break;
//            case "july":
//                monthNumber = 7;
//                break;
//            case "august":
//                monthNumber = 8;
//                break;
//            case "september":
//                monthNumber = 9;
//                break;
//            case "october":
//                monthNumber = 10;
//                break;
//            case "november":
//                monthNumber = 11;
//                break;
//            case "december":
//                monthNumber = 12;
//                break;
//            default:
//                monthNumber = 0;
//                break;
//        }
//
//        return monthNumber;
//    }
//
//    public static void main(String[] args) {
//        String month = "August";
//
//        int returnedMonthNumber =
//                StringSwitchDemo.getMonthNumber(month);
//
//        if (returnedMonthNumber == 0) {
//            System.out.println("bad month");
//        } else {
//            System.out.println(returnedMonthNumber);
//        }
//    }
//}