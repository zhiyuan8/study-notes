# 1. Tree Traversal
# 1.1 Non-recursion (REMEMBER)
*Preorder traversal* :  
```java
public List<Integer> preorder(Node root) {
    List<Integer> res = new ArrayList<>();
    if (root == null){ // corner case!
        return res;
    }
    Stack<Node> stack = new Stack<>();
    stack.add(root);
    while (!stack.empty()){
        Node top = stack.pop();
        res.add(top.val);
        //Collections.reverse(top.children); // modified permenantly, avoid! 
        for (int i = top.children.size() - 1; i >= 0; i--) {
            stack.push(top.children.get(i));
        }
    }
    return res;
}
```


# 1.2 Recursion
