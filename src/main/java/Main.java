
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
        View aButton = new Button(this);
        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void clicked() {
                System.out.println("익명내부객체는 버튼이 클릭되었다는 사실을 방금 알았습니다.");
            } /* 이 부분을 구현해주세요. */ });

        aButton.fireClickEvent();
        // 출력 : 익명내부객체는 버튼이 클릭되었다는 사실을 방금 알았습니다.!
    }
}

abstract class View {
    private OnClickListener onClickListener;

    static interface OnClickListener {
        public void clicked();
    }

    void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    void fireClickEvent() {
        System.out.println("== 버튼이 클릭되었습니다. ==");
        System.out.println("구독자에게 알람을 합니다.");

        this.onClickListener.clicked();
    }
}

class Button extends View {
    Button(Activity activity) {
    }
}