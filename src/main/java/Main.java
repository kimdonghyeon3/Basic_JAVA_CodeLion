class Main {
    public static void main(String[] args) {ArrayList ar = new ArrayList();
        ArrayList al = new ArrayList();

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 0

        al.add(100);

        System.out.println("al.get(0) : " + al.get(0));
        // 출력 => al.get(0) : 100

        al.add(200);
        al.add(300);
        // 출력 => 배열의 크기가 증가되었습니다. 2 => 4

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 3

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 200

        al.removeAt(1);

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 2

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 300

        al.add(400);
        al.add(500);
        al.add(600);
        // 출력 => 배열의 크기가 증가되었습니다. 4 => 8

        System.out.println("al.get(3) + al.get(4) : " + (al.get(3) + al.get(4)));
        // 출력 => al.get(3) + al.get(4) : 1100

        System.out.println("al.get(3).intValue() + al.get(4).intValue() : " + (al.get(3).intValue() + al.get(4).intValue()));
        // 출력 => al.get(3) + al.get(4) : 1100

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 300
		2 : 400
		3 : 500
		4 : 600
		*/

        al.add(700, 1);
        al.add(750, 1);

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 750
		2 : 700
		3 : 300
		4 : 400
		5 : 500
		6 : 600
		*/
    }
}

class ArrayList {
    int[] datas;
    int lastIndex = 0;

    ArrayList() {
        datas = new int[lastIndex]; // 이 부분은 수정할 수 없습니다.
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

                System.out.println("배열의 크기가 증가되었습니다. " + datas.length + " => " + newData.length);
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

            System.out.println("배열의 크기가 증가되었습니다. " + datas.length + " => " + newData.length);

            datas = newData;
        }

        datas[lastIndex++] = data;
    }

    Integer get(int index) {
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

    public void removeAt(int index) {
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

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for(int i = 0 ; i < datas.length ; i++){
            System.out.println( i + " : " + datas[i]);
        }
    }
}