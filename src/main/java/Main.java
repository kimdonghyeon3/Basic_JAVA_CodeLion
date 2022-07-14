class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();

        for ( int i = 0; i < 100; i++ ) {
            ar.add((i + 1) * 10);
        }

        int ar_size = ar.size(); // ar_size의 값은 100 이어야 합니다.

        for ( int i = 0; i < ar_size; i++ ) {
            int value = ar.get(i);
            System.out.println(value);
        }
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
}