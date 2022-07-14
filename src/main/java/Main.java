class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);

        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300

        value = ar.get(3);
        System.out.println(value);
        // 출력 : 400
    }
}

class ArrayList {
    int[] datas;
    int lastIndex = 0;

    ArrayList() {
        datas = new int[3]; // 이 부분은 수정할 수 없습니다.
    }

    void add(int data) {

        if(lastIndex >= datas.length){
            int[] newData = new int[datas.length + 1];

            for(int i = 0 ; i < datas.length ; i++){
                newData[i] = datas[i];
            }

            datas = newData;
        }

        datas[lastIndex++] = data;
    }

    int get(int index) {
        return datas[index];
    }
}