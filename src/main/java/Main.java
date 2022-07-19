class Main {

    static long num = 1600851475143L;

    public static void main(String[] args) {
        //속도를 빠르게 하려면 dp를 사용하는 것도 좋아보인다
        long max = Long.MIN_VALUE;

        for (int i = 2; i <= num ; i++) {
            while (num % i == 0) {
//                System.out.println("약수 = " + i);
                num /= i;

                if(isPrime(i)){
//                    System.out.println("약수 중 소수인 것 = " + i);
                    max = Math.max(max, i);
                }
            }
        }


        System.out.println("max = " + ((max == Long.MIN_VALUE) ? "소인수가 없습니다.":max));

    }

    public static boolean isPrime(int n){

        if(n == 1)
            return false;

        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if( n % i == 0){
                return false;
            }
        }

        return true;
    }
}
