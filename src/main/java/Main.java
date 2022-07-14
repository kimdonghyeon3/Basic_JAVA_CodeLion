class Main {
    public static void main(String[] args) {ArrayList ar = new ArrayList();
        ar.add(100, 0);
        ar.add(200, 1);
        ar.add(300, 2);
        ar.add(400, 3);
        ar.add(500, 4);
        ar.add(600, 2); // 2번좌석으로 새치기, 기존의 2번좌석 손님부터 끝 손님까지 뒤로 한칸씩 밀린다.
        ar.add(700, 0); // 0번좌석으로 새치기, 기존의 0번좌석 손님부터 끝 손님까지 뒤로 한칸씩 밀린다.

        for ( int i = 0; i < ar.size(); i++ ) {
            int value = ar.get(i);

            System.out.println(i + " : " + value);
        }

        // 출력
        // 0 : 700
        // 1 : 100
        // 2 : 200
        // 3 : 600
        // 4 : 300
        // 5 : 400
        // 6 : 500
    }
}

class ArrayList {
    int[] datas;
    int lastIndex = 0;

    ArrayList() {
        datas = new int[3]; // 이 부분은 수정할 수 없습니다.
    }

    void add(int data, int index){

        //그냥 추가

        //그냥 추가 (크기 늘려서)

        //밀리기


        if(index >= datas.length){
            add(data);
        }else{

            if(datas[index] == 0){
                datas[index] = data;
                lastIndex++;
            }else{

                int[] newData = new int[datas.length + 1];

                int j = 0;
                for(int i = 0 ; i < newData.length ; i++){

                    if(i == index){
                        newData[i] = data;
                    }else{
                        newData[i] = datas[j++];
                    }

                }

                datas = newData;
            }
        }




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
            }
        }

        lastIndex--;
        datas = newData;

    }
}