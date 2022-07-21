class Main {
    public static void main(String[] args) {
        Button aButton = new Button();
        aButton.setClickEventListener(new 고양이());
        aButton.fireClick();
        // 나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 개());
        aButton.fireClick();
        // 나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 부엉이());
        // 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.fireClick();
    }
}
class Button{

    Object obj;

    public void fireClick() {
        if(obj instanceof 고양이){
            ((고양이)obj).listen();
        }else if(obj instanceof 개){
            ((개)obj).listen();
        }else if(obj instanceof 부엉이){
            ((부엉이)obj).listen();
        }
    }

    public void setClickEventListener(Object obj) {
        this.obj = obj;
    }
}

class 고양이{
    void listen(){
        System.out.println("나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
class 개{
    void listen(){
        System.out.println("나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
class 부엉이{
    void listen(){
        System.out.println("나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}