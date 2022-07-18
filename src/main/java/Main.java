// ArrayList 만들기
// add => 추가[완료]
// addAt => 추가
// indexOf => 검색[완료]
// contains => 있는지 없는지[완료]
// get => 가져오는 거[완료]
// remove => 삭제[완료]
// toString => 내부 데이터 표시[완료]
// 제너릭

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        al.add(50, 1);

        al.remove(0);

        System.out.println(al);

        System.out.println(al.get(3));

        System.out.println(al.indexOf(50));
        System.out.println(al.contains(40));

        System.out.println(al.get(3) + al.get(3));

        ArrayList<Double> al2 = new ArrayList<Double>();
        al2.add(10.5);
        al2.add(3.14);
        System.out.println(al2);
    }
}
class ArrayList<T> {
    private Object[] datas;
    private int size;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for ( int i = 0; i < size; i++ ) {
            if ( i > 0 ){
                sb.append(", ");
            }
            sb.append("[" + i + " : " + datas[i] + "]");
        }

        sb.insert(0, "ArrayList => (");
        sb.append("), size : " + size);

        return sb.toString();
    }

    ArrayList() {
        datas = new Object[3];
        size = 0;
    }

    private void sizeUpDatasSizeIfFull() {
        if ( isFull() ) {
            sizeUpDatas();
        }
    }

    private boolean isFull() {
        return size == datas.length;
    }

    private void sizeUpDatas() {
        Object[] newDatas = new Object[datas.length * 2];

        for ( int i = 0; i < size; i++ ) {
            newDatas[i] = datas[i];
        }

        datas = newDatas;
    }

    public void add(T data) {
        sizeUpDatasSizeIfFull();

        datas[size] = data;
        size++;
    }

    public void add(T data, int index) {
        sizeUpDatasSizeIfFull();

        for ( int i = size - 1; i >= index; i-- ) {
            datas[i + 1] = datas[i];
        }

        datas[index] = data;
        size++;
    }

    public void remove(int index) {
        sizeUpDatasSizeIfFull();

        for ( int i = index; i < size; i++ ) {
            datas[i] = datas[i + 1];
        }

        size--;
    }

    public T get(int index) {
        return (T)datas[index];
    }

    public int indexOf(Object data) {
        for ( int i = 0; i < size; i++ ) {
            if ( datas[i].equals(data) ) {
                return i;
            }
        }

        return -1;
    }

    public boolean contains(Object data) {
        return indexOf(data) != -1;
    }
}

