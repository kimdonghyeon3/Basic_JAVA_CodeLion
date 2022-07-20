//code.oa.gg/java8/1075
// 문제 : 아래코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        사람[] 사람들 = new 사람[5];
        사람들[0] = 사람.get사람();
        사람들[1] = 사람.get사람();
        사람들[2] = 사람.get사람();
        사람들[3] = 사람.get사람();
        사람들[4] = 사람.get사람();

        for ( int i = 0; i < 사람들.length; i++ ) {
            사람들[i].자기소개();
        }

    }
}
class 사람{
    static 사람 사람;
    int id = 0;
    static int num = 1;

    public 사람(int i) {
        id = i;
    }

    public static 사람 get사람() {
        사람 = new 사람(num++);
;        return 사람;
    }

    public void 자기소개() {
        System.out.println("저는 " + id +"번째 사람입니다.");
    }
}