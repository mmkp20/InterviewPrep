package practice;

public class ReverseLinkedList<T> {
    private Node<T> head;
    private static class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data=data;
        }
    }
    public static void main (String[] args) {
        ReverseLinkedList<Integer> list = new ReverseLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);
        list.print();

        list.remove(3);
        list.print();

        System.out.println("Contains 2? "+ list.contains(2));
        System.out.println("Contains 5? "+ list.contains(5));
        System.out.println("Contains 6? "+ list.contains(6));

        list.reverse();
        list.print();
    }

    private void reverse () {
        Node<T> previous=null;
        Node<T> current = head;
        Node<T> next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
    }

    private boolean contains (T data) {
        Node<T> current = head;
        while(current!=null){
            if(current.data.equals(data)){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    // remove()
    private void remove (T data) {
        if(head==null){
            return;
        }else if(head.data.equals(data)){
            head=head.next;
        }else{
            Node<T> previous = head;
            Node<T> current = head.next;
            while(current!=null){
                if(current.data.equals(data)){
                    previous.next=current.next;
                }
                previous=current;
                current=current.next;

            }
        }
    }

    private void print () {
        Node<T> current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    private void add (T data) {
        Node<T> newNode = new Node<>(data);
        if(head==null){
            head=newNode;
        }else{
            Node<T> current = head;
            while(current.next!=null){
                current=current.next;
            } // current.next==nulll
            current.next=newNode;
        }
    }
}
