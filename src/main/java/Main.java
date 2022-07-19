class Main {
    public static void main(String[] args) {

        //속도를 빠르게 하려면 dp를 사용하는 것도 좋아보인다
        int sum = 0;

        for(int i = 0 ; true ; i++){
            int fiboNum = fibo(i);

            if(fiboNum > 50000000)
                break;

            if(fiboNum % 2 == 0)
                sum += fiboNum;

//            System.out.println("fibo(i) = " + fiboNum);
        }

        System.out.println("sum = " + sum);
    }

    public static int fibo(int n){

        if(n == 1 || n==0)
            return n == 1 ? 1 : 0;

        return fibo(n-1) + fibo(n-2);
    }
}
