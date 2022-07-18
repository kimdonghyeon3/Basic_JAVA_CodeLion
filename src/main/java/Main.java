//code.oa.gg/java8/1131
// 문제 : 아래와 같이 출력되도록 해주세요.

class Main {
    public static void main(String[] args) {
        HashMap aMap = new HashMap();

        aMap.put(1, "안녕");
        aMap.put("A", false);
        aMap.put("A", true);

        System.out.println(aMap.get("A"));
        // 출력 : true
    }
}

class HashMap {
    private Object[] keys;
    private Object[] datas;
    int size = 0;

    HashMap() {
        keys = new Object[100];
        datas = new Object[100];
    }

    void put(Object key, Object data) {
        Object v = null;
        int index = -1;

        for ( int i = 0; i < size; i++ ) {
            if ( key.equals(keys[i]) ) {
                index = i;
                break;
            }
        }

        if ( index != -1 ) {
            datas[index] = data;
            v = datas[index];
        }else{
            keys[size] = key;
            datas[size] = data;
            size++;
        }

    }

    Object get(Object key) {
        Object v = null;
        int index = -1;

        for ( int i = 0; i < size; i++ ) {
            if ( key.equals(keys[i]) ) {
                index = i;
                break;
            }
        }

        if ( index != -1 ) {
            v = datas[index];
        }

        return v;
    }
}



