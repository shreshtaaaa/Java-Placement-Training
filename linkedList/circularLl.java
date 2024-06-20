//circular linked list containing even no of elements.. divided into 2 equal size linked lists.
public class circularLl {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();


        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        ll.finddiagonal(20);


    }
}

class LinkedList{
    int data;
    LinkedList link;

    LinkedList head;
    void insert(int data)
    {
        if(head==null)
        {
            head=new LinkedList();
            head.data=data;
            head.link=head;
        }
        else
        {
        LinkedList node=new LinkedList();
        node=head;
        while(node.link!=head)
        {
            node=node.link;
        }
        node.link=new LinkedList();
        node.link.data=data;
        node.link.link=head;
    }
    }

    void display()
    {
        LinkedList node =head.link;
        System.out.println(head.data);
        while(node!=head)
        {
            System.out.println(node.data);
            node=node.link;
        }
    }


    void finddiagonal(int data)
    {
        int count=1;
        if(head==null)
        {
            System.out.println("Not possible to determine the diagonally opposite element");
            System.exit(0);
        }
        LinkedList node =head;
        while(node.data!=data)
        {
            node=node.link;
            if(node==head)
            {
            System.out.println("there is no node with that value");
            System.exit(0);
            }
        }

        LinkedList cursor=head.link;
        while(cursor!=head)
        {
            cursor=cursor.link;
            count++;
        }
        System.out.println(count +" nodes are present in the linked list");
        if(count%2!=0)
        {
            System.out.println("Not possible to determine the diagonally opposite element");
            System.exit(0);
        }
        else{
            count/=2;
            while(count!=0)
            {
                node=node.link;
                count--;
            }
            System.out.println(node.data+" is the diagonally opposite element");
        }

    }
    
}