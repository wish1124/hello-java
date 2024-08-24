package lesson6;

// 클래스나 인터페이스, 또는 enum 선언은 자바 파일의 최상단에 위치합니다.
enum Day {  // Day enum은 클래스 외부에서 정의될 수 있습니다.
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class DayChecker {  // 클래스 선언은 enum 또는 다른 클래스 다음에 옵니다.

    // 주어진 day가 주말인지 평일인지를 출력하는 메서드
    public void printDayType(Day day) { // 매개변수 타입은 Day로 지정
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니다.");
                break;
            default:
                System.out.println("평일입니다.");
                break;
        }
    }

    // 주어진 day가 무슨 요일인지 한글로 출력하는 메서드
    public void printDay(Day day) { // 매개변수 타입은 Day로 지정
        switch (day) {
            case MONDAY:
                System.out.println("월요일");
                break;
            case TUESDAY:
                System.out.println("화요일");
                break;
            case WEDNESDAY:
                System.out.println("수요일");
                break;
            case THURSDAY:
                System.out.println("목요일");
                break;
            case FRIDAY:
                System.out.println("금요일");
                break;
            case SATURDAY:
                System.out.println("토요일");
                break;
            case SUNDAY:
                System.out.println("일요일");
                break;
        }
    }

    // main 메서드 (프로그램의 진입점)
    public static void main(String[] args) {
        DayChecker checker = new DayChecker();

        // 월요일 테스트
        checker.printDayType(Day.MONDAY);
        checker.printDay(Day.MONDAY);

        // 토요일 테스트
        checker.printDayType(Day.SATURDAY);
        checker.printDay(Day.SATURDAY);
    }
}
