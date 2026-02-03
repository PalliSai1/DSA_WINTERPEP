
public class List {
    public class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    }
    Node head=null;
    public void insertatBeg(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        
    }
    public void insertAtPos(int data,int k){
        Node temp=head;
        for(int i=1;i<k-1;i++){
            temp=temp.next;
        }
        Node node =new Node(data);
        if(temp!=null){
            node.next=temp.next;
            temp.next=node;
        }
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static  void main(String[] args){
        List ll=new List();
        ll.insertatBeg(20);
        ll.insertAtPos(30,2);
        print(ll.head);
        

    }
}
