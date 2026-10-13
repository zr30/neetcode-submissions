
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<HashMap<Character, Integer>> outputMaps = new ArrayList<>();
        List<List<String>> output = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            HashMap<Character, Integer> currentMap = makeMap(strs[i]);
            boolean found = false;

            for (int k = 0; k < outputMaps.size(); k++) {
                if (currentMap.equals(outputMaps.get(k))) {
                    output.get(k).add(strs[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                output.add(group);
                outputMaps.add(currentMap);
            }
        }

        return output;
    }

    public HashMap<Character, Integer> makeMap(String str) {
        HashMap<Character, Integer> myMap = new HashMap<>();

        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            myMap.put(c, myMap.getOrDefault(c, 0) + 1);
        }

        return myMap;
    }
}