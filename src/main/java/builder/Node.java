package builder;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    private final T data;

    private final List<Node<T>> children = new ArrayList<Node<T>>();

    public Node(T data){
        this.data = data;
    }

    public void addChild(Node<T> child){
        children.add(child);
    }

    public List<Node<T>> getChildren(){
        return children;
    }

    public T getData(){
        return data;
    }
}
