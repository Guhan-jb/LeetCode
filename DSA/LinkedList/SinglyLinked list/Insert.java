//Singly linked list
public class Main {
    class Node{
        int data;// data
        Node next;// stores the next node
        Node(int data)
        {
            this.data=data;
            next=null;
        }
        Node(int data, Node node)
        {
            node.next.data=data;
        }
    }
    Node head;
    Node tail;
    void insert(int data)
    {
        Node newnode=new Node(data);
     if(head==null)
     {
         head=newnode;
         tail=newnode;
        
     }
    else
    {
        tail.next=newnode;
        tail=newnode;
    }
    }
    void display()
    {
        tail=head;
        while(tail.next!=null)
        {
            System.out.println(tail.data);
            tail=tail.next;
        }
        System.out.println(tail.data);
    }
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        Main m=new Main();
        while(true)
        {
            int n=S.nextInt();
            if(n==-1)
                break;
            m.insert(n);
        }
        m.display();
        
    }
}