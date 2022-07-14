class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);

        ar.remove(2);
        int value = ar.get(2);
        System.out.println(value);
        // 출력 : 400

        ar.remove(0);
        value = ar.get(0);
        System.out.println(value);
        // 출력 : 200

        ar.add(78);
        value = ar.get(2);
        System.out.println(value);
        // 출력 : 78
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

    public int size() {
        return datas.length;
    }

    public void remove(int index) {
        int[] newData = new int[datas.length - 1];

        int j = 0;
        for(int i = 0 ; i < datas.length ; i++){
            if(i != index) {
                newData[j++] = datas[i];
            }else {

            }
        }

        lastIndex--;
        datas = newData;

    }
}