//code.oa.gg/java8/1416

class Main {
    public static void main(String[] args) {
        Activity activity = new MainActivity();
        activity.onCreate();
        // 출력 => 메인 액티비티가 실행되었습니다.
    }
}

class Activity{
    void onCreate(){
        System.out.println("메인 액티비티가 실행되었습니다.");
    }
}

class MainActivity extends Activity{

}