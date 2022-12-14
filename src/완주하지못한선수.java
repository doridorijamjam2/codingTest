import java.util.*;

class Solution1 {
    public String solution1(String[] participant, String[] completion) {

        String answer = "";

        // 1. Hash map을 만든다. (participant)
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        // 2. Hash map을 뺸다. (completion)
        for(String player : completion){
            map.put(player, map.get(player) - 1);
        }
        // 3. value가 0이 아닌 마지막 주자를 찾는다.
        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] arg){
      String[] part = {"leo", "kiki", "eden"};
      String[] comp = {"eden", "kiki"};
      Solution1 sol = new Solution1();
      System.out.println(sol.solution1(part, comp));
    }
}
