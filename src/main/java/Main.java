// 문제 : 아래와 같이 출력 되도록 전사A, 전사B를 만들어주세요.
// 조건 : this와 super를 활용해주세요.

class Main {
    public static void main(String[] args) {
        전사A a전사A = new 전사A();
        a전사A.이름 = "홍길동";

        System.out.println("== 전사A 공격(); ==");
        a전사A.공격();
        // 출력
        // 홍길동이(가) 공격!
        // 사람이(가) 숨쉬다.

        System.out.println("\n== 전사A 공격2(); ==");
        a전사A.공격2();
        // 홍길동이(가) 공격!
        // 사람이(가) 숨쉬다.

        전사B a전사B = new 전사B();
        a전사B.이름 = "홍길순";

        System.out.println("\n== 전사B 공격(); ==");
        a전사B.공격();
        // 홍길순이(가) 공격!
        // 전사B가 숨쉬다.

        System.out.println("\n== 전사B 공격2(); ==");
        a전사B.공격2();
        // null이(가) 공격!
        // 사람이(가) 숨쉬다.
    }
}

class 사람 {
    String 이름;

    void 숨쉬다() {
        System.out.println("사람이 숨쉬다.");
    }
}

class 전사 extends 사람{
    void 공격(){
        System.out.println(이름 + "이 공격!!");
        숨쉬다();
    }
    void 공격2() {
        System.out.println(이름 + "이 공격!!");
        super.숨쉬다();
    }
}

class 전사A extends 전사{

}

class 전사B extends 전사{

    String 이름;

    void 공격(){
        System.out.println(이름 + "이 공격!!");
        숨쉬다();
    }

    void 숨쉬다() {
        System.out.println("전사B가 숨쉬다.");
    }
}