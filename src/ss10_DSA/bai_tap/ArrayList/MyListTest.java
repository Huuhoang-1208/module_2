package ss10_DSA.bai_tap.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Java");
        myList.add("C++");
        myList.add("Python");
        myList.add("JavaScript");
        myList.add(1, "Go");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element " + i + ": " + myList.get(i));
        }
        System.out.println("Removed: " + myList.remove(2));
        System.out.println("Contains 'Python'? " + myList.contains("Python"));
        System.out.println("Index of 'Go': " + myList.indexOf("Go"));

        myList.clear();
        System.out.println("Size after clear: " + myList.size());
    }
}
