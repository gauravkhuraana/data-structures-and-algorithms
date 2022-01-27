package linkedlist_Testing;
import linkedList.singleLinkedList.linkedListStructure;
import org.testng.annotations.Test;

public class linkedListOps {

    @Test
    public void linkedlistInsertOperationsTest()
    {

      linkedListStructure.insertNode(10);
      linkedListStructure.printLinkedlist();
      linkedListStructure.insertNode(-9);
      linkedListStructure.printLinkedlist();
      linkedListStructure.insertNode(0);
      linkedListStructure.insertNode(-159);
      linkedListStructure.insertNode(1);
      linkedListStructure.printLinkedlist();


    }

    @Test
    public void linkedlistRemoveOperationsTest()
    {

        linkedListStructure.removeElementFromLast();
        linkedListStructure.printLinkedlist();

        linkedListStructure.insertNode(10);
        linkedListStructure.removeElementFromLast();
        linkedListStructure.printLinkedlist();

        linkedListStructure.insertNode(10);
        linkedListStructure.insertNode(20);
        linkedListStructure.removeElementFromLast();
        linkedListStructure.printLinkedlist();

        linkedListStructure.insertNode(10);
        linkedListStructure.insertNode(20);
        linkedListStructure.removeElementFromLast();
        linkedListStructure.removeElementFromLast();
        linkedListStructure.printLinkedlist();

        linkedListStructure.insertNode(10);
        linkedListStructure.insertNode(20);
        linkedListStructure.insertNode(30);
        linkedListStructure.removeElementFromLast();
        linkedListStructure.removeElementFromLast();
        linkedListStructure.printLinkedlist();

    }
}
