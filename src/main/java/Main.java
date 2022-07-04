class Main {
    public static void main(String[] args) {
        전사 a전사1 = new 전사();

        a전사1.a왼손무기 = new 칼();
        a전사1.공격();
        // 출력 => 전사가 왼손으로 칼(을)를 사용합니다.

        전사 a전사2 = new 전사();
        a전사2.a왼손무기 = new 창();
        a전사2.a오른손무기 = new 도끼();
        a전사2.공격();
        // 출력 => 전사가 왼손으로 창(을)를 사용합니다.
        // 출력 => 전사가 오른손으로 도끼(을)를 사용합니다.
    }
}
class 전사{
    무기 a왼손무기;
    무기 a오른손무기;

    void 공격(){

        if(a왼손무기 != null && a오른손무기 != null){
            a왼손무기.작동("왼손");
            a오른손무기.작동("오른손");
        }else if(a왼손무기 != null)
            a왼손무기.작동("왼손");
        else
            a오른손무기.작동("오른손");
    }
}
abstract class 무기{
    abstract void 작동(String 손);
}

class 칼 extends 무기{
    @Override
    void 작동(String 손) {
        System.out.printf("전사가 %s 으로 칼(을)를 사용합니다.\n",손);
    }
}
class 창 extends 무기{
    @Override
    void 작동(String 손) {
        System.out.printf("전사가 %s 으로 창(을)를 사용합니다.\n",손);
    }
}
class 도끼 extends 무기{
    @Override
    void 작동(String 손) {
        System.out.printf("전사가 %s 으로 도끼(을)를 사용합니다.\n",손);
    }
}