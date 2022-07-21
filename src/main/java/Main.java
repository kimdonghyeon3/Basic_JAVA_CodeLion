/*
문제 : 사람 객체의 `안녕`이 `button.click();`에 의해 실행되도록 해주세요.
조건 : Button에는 `사람` 이라는 언급이 없어야 합니다.
*/
class Main {
    public static void main(String[] args) {
        Button button = new Button();
        // button.?? // 이 1줄을 완성해주세요.(메인 클래스는 여기만 수정 가능)
        button.setButton(new 사람());
        button.click();
    }
}

interface Listener{
    void listen();
}

class Button{

    Listener obj;

    public void setButton(Listener listen) {
        this.obj = listen;
    }

    void click(){
        obj.listen();
    }
}

class 사람 implements Listener{
    public void 안녕() {
        System.out.println("Main::안녕!");
    }

    @Override
    public void listen() {
        안녕();
    }
}