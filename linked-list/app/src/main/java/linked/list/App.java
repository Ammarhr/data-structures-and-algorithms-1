/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

public class App {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();
        myList.append(1);
        myList.append(2);
        myList.append(3);
        LinkedList myList2 = new LinkedList();
        myList2.append(7);
        myList2.append(8);
        myList2.append(9);
        myList2.append(10);
        myList2.append(11);
        myList2.append(12);

        LinkedList newZippedList = new LinkedList();
        newZippedList.head = myList.zipLists(myList,myList2);
        System.out.println(newZippedList);

//        System.out.println(myList.kthFromEnd(2));
//        myList.insertAfter(4,10);
//        myList.insertBefore(1,10);
//
//        System.out.println(myList.includes(8));
//        System.out.println(myList.includes(3));
//        System.out.println(myList.includes(5));
//        System.out.println(myList.includes(10));
//
//        System.out.println(myList2.toString());
    }
}