class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);

        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300
    }
}



class ArrayList {

    int[] data;
    int index;

    ArrayList() {
        data = new int[3];
        index = 0;
    }


    void add(int data) {
        this.data[index++] = data;
    }

    int get(int index){

        return data[index];
    }
}