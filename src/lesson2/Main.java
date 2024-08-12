//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package lesson2;

/*public class Main {
    public static void main(String[] args) {
        // int 타입 변수 선언 및 초기화
        int age = 25;
        System.out.println("정수형 변수 (int) age: " + age);

        // double 타입 변수 선언 및 초기화
        double height = 175.5;
        System.out.println("실수형 변수 (double) height: " + height);

        // boolean 타입 변수 선언 및 초기화
        boolean isJavaFun = true;
        System.out.println("불린형 변수 (boolean) isJavaFun: " + isJavaFun);

        // String 타입 변수 선언 및 초기화
        String name = "Alice";
        System.out.println("문자열 변수 (String) name: " + name);

        // long 타입 변수 선언 및 초기화
        long population = 7800000000L; // long 리터럴에 'L'을 붙임
        System.out.println("긴 정수형 변수 (long) population: " + population);
    }
}*/

/*public class Main{
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 정수 입력 받기
        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        // 개행 문자를 제거하기 위해 scanner.nextLine() 호출
        scanner.nextLine(); // Enter 키를 처리하기 위해 필요

        // 문자열 입력 받기
        System.out.print("문자열을 입력하세요: ");
        String text = scanner.nextLine();

        // 입력 받은 값 출력
        System.out.println("입력 받은 정수: " + number);
        System.out.println("입력 받은 문자열: " + text);

        // Scanner 객체 닫기
        scanner.close();
    }
}*/
// 두 개의 문자열을 선언하고 연결하여 새로운 문자열을 만들기
/*public class Main  {
    public static void main(String[] args) {
        // 두 개의 문자열 선언
        String firstName = "Alice";
        String lastName = "Johnson";

        // 문자열 연결 방법 1: concat 메서드 사용
        String fullNameConcat = firstName.concat(" ").concat(lastName);
        System.out.println("Concat 메서드를 사용하여 연결된 문자열: " + fullNameConcat);

        // 문자열 연결 방법 2: + 연산자 사용
        String fullNamePlus = firstName + " " + lastName;
        System.out.println("+ 연산자를 사용하여 연결된 문자열: " + fullNamePlus);
    }
}*/

// 2. 문자열의 길이 출력하기
/*public class Main {
    public static void main(String[] args) {
        // 두 개의 문자열 선언
        String firstName = "Alice";
        String lastName = "Johnson";

        // 문자열 연결
        String fullName = firstName + " " + lastName;

        // 문자열의 길이 출력
        int length = fullName.length();
        System.out.println("연결된 문자열의 길이: " + length);
    }
}*/
//3. 문자열 뒤집어서 출력하기

public class Main {
    public static void main(String[] args) {
        // 두 개의 문자열 선언
        String firstName = "Alice";
        String lastName = "Johnson";

        // 문자열 연결
        String fullName = firstName + " " + lastName;

        // 문자열의 길이 출력
        int length = fullName.length();
        System.out.println("연결된 문자열의 길이: " + length);

        // 문자열 뒤집기
        String reversedFullName = new StringBuilder(fullName).reverse().toString();
        System.out.println("뒤집어진 문자열: " + reversedFullName);
    }
}
