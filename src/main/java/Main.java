import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        String line = "Test 15 lqlq 35 bad 99999 guess 34";
        // s["Test" "15" "lqlq" "35" "bad" "99999" "guess" "34"]
        // s["15" "35" "99999" "34"]
        // s[15 35 99999 34]
        // 100083

//        int sum = Arrays
//                .stream(line.split(" "))
//                .filter((s) -> s.matches("\\d+"))
//                .mapToInt(Integer::parseInt)
//                .sum();

        int sum = 0;
        String[] str = line.split(" ");
        for(int i = 0 ; i < str.length ; i++){
            if(str[i].matches("\\d+")){
                sum += Integer.parseInt(str[i]);
            }
        }


        System.out.println(sum);
    }
}