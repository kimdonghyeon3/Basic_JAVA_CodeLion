class Main {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}

class 사람{
    팔 a왼팔;
    사람(){
        a왼팔 = new 팔();
        a왼팔.a손.a엄지손가락.길이 = 5;
    }
}
class 팔{
    static 손 a손;
//    팔(){
//        a손 = new 손();
//    }
}
class 손{
    static 손가락 a엄지손가락;
//    손(){
//        a엄지손가락 = new 손가락();
//        a엄지손가락.길이=10;
//    }
}
class 손가락{
    static int 길이;
//    손가락(){
//        길이 = 5;
//    }
}
