//code.oa.gg/java8/970
// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 문제 : `저장` 메서드를 1개로 줄여보세요.

public class Main {

    public static void main(String[] args) {
        Thing thing = new Thing();
        Person person = new Person();
        Apple apple = new Apple();

        Integer a = 10;
        Integer b = 10;

        String str1 = "abc";
        String str2 = "abc";
        
        System.out.println("thing instanceof Thing = " + (thing instanceof Thing));
        System.out.println("person instanceof Thing = " + (person instanceof Thing));
        System.out.println("apple instanceof Thing = " + (apple instanceof Thing));

        System.out.println("(thing instanceof Person) = " + (thing instanceof Person));
        System.out.println("(thing instanceof Apple) = " + (thing instanceof Apple));

        System.out.println("(a==b) = " + (a==b));
        System.out.println("(a.equals(b)) = " + (a.equals(b)));

        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str1.equals(str2)) = " + (str1.equals(str2)));
    }
}

class Thing{ }
class Person extends Thing { }
class Apple extends Thing { }


