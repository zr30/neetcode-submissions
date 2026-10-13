
class Solution {

    public boolean isValid(String s) {

        HashSet<Character> closingBrackets =
            new HashSet<>(Arrays.asList('}', ']', ')'));

        HashSet<Character> openingBrackets =
            new HashSet<>(Arrays.asList('{', '[', '('));

        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put('[', ']');
        pairs.put('{', '}');
        pairs.put('(', ')');

        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            char curr = s.charAt(i);

            if (openingBrackets.contains(curr)) {

                stack.add(curr);

            } else if (closingBrackets.contains(curr)) {

                if (stack.isEmpty()) {
                    return false;
                }

                char pop = stack.remove(stack.size() - 1);

                if (pairs.get(pop) != curr) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}