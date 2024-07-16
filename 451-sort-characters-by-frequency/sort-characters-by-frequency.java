class Solution {
     public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<Character> q = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        q.addAll(map.keySet());
        StringBuilder str = new StringBuilder();
        while (!q.isEmpty()) {
            Character c = q.remove();
            for (int i = 0;i<map.get(c);i++) {
                str.append(c);
            }
        }
        return new String(str);

    }
}