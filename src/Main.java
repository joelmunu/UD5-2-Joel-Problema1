public class Main {
    public static void main(String[] args) {
        SuperList<Integer> myList = new SuperList<Integer>();
        myList.addElement(1);
        myList.addElement(2);
        myList.addElement(3);
        myList.addElement(4);
        myList.removeElement(3);
        myList.showElements();
        myList.showReversedElements();
    }
}