class Main {
    public static void main(String[] args){

        try{
            int rs = 계산기.나누다(10, 0);
            System.out.println(rs);
        }catch(ArithmeticException e){
            System.out.println("0으로 나누면 안됩니다.");
        }

    }
}
class 계산기 {
    static int 나누다(int a, int b) throws ArithmeticException {
            return a / b;
    }
}