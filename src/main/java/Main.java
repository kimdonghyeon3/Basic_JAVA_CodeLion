class Main {

    public static void main(String[] args) {

        long result = 0;

        out : for(int i = 9999 ; i > 999 ; i--){
            for(int j = 9999 ; j > 999 ; j--){
                if(isSymmetry(i*j)){
                    result = Math.max(result, i*j);
//                    break out;    답이 나오긴 하는데,, 이건 오류가 발생할 수도 있겠다
                }
            }
        }

        System.out.println("result = " + ((result == -1) ? "대칭수가 없습니다.": result) );
    }

    public static boolean isSymmetry(long n){

        String str = String.valueOf(n);

        for(int i = 0 ; i < str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}
