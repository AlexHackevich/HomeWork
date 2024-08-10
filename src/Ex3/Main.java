package Ex3;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("DAS1");
        myArrayList.add("DAS2");
        myArrayList.add("DAS3");
        myArrayList.add("DAS4");
        myArrayList.add("DAS");
        myArrayList.add("DAS");
        myArrayList.add("DAS");
        myArrayList.add("DAS");
        myArrayList.add("DAS");
        myArrayList.add("DAS");

        myArrayList.remove(1);

        Object[] objects = new Object[]{"Ivan", "Sergey", "Petr"};
        myArrayList.addElements(objects);

        myArrayList.addOfIndex(1, "hexz");

        myArrayList.clear();
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i) + " " + i);
        }
    }
}