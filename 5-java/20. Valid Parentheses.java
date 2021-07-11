class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // HashSet<Character> left = new HashSet<>(){{
        //     add('(');add('{');add('[');
        // }};
        Set<Character> left = new HashSet<>( Arrays.asList('(','[','{') );
        Map<Character,Character> right  = new HashMap<>(){{
            put(')','(');put('}','{');put(']','[');
        }};
        
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (left.contains(c)){
               stack.add(c); 
            } else if (right.containsKey(c)){
                if (stack.isEmpty()){
                    return false;
                } else {
                    char t = stack.pop();
                    if (t == right.get(c)){
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        return (stack.isEmpty()? true:false);
    }
}