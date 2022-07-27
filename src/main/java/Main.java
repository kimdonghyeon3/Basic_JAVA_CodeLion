
class Main {
    public static void main(String[] args) {
        Activity activity = new MainActivity();
        activity.onCreate();
    }
}

abstract class Activity {
    abstract public void onCreate();
}

class MainActivity extends Activity {
    @Override
    public void onCreate() {
        System.out.println("메인 액티비티가 실행되었습니다.");

        // 아래 코드가 실행되도록 해주세요.
        View.OnClickListener a = new 사과();
        View aButton = new Button(this);
        aButton.setOnClickListener(a);

        aButton.fireClickEvent();
        // 출력 : 사과는 버튼이 클릭되었다는 사실을 방금 알았습니다.!
        // 조건 : 위 문구는 사과 클래스 안의 메서드에 의해서 출력되어야 합니다.
    }
}

abstract class View {
    public void fireClickEvent() {
    }

    static interface OnClickListener {

        void fireClickEvent();
    }

    void setOnClickListener(OnClickListener onClickListener) {

    }
}

class Button extends View {

    OnClickListener onClickListener;

    Button(Activity activity) {
    }

    @Override
    void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @Override
    public void fireClickEvent() {
        onClickListener.fireClickEvent();
    }
}

class 사과 implements View.OnClickListener {
    @Override
    public void fireClickEvent() {
        System.out.println("사과는 버튼이 클릭되었다는 사실을 방금 알았습니다.!");
    }
}


