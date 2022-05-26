import java.util.ArrayList;
import java.util.Iterator;

public class SuperList<T> extends ListManager<T>{
    ArrayList<T> list = new ArrayList<T>();

    @Override
    public void addElement(T element) {
        list.add(list.size(), element);
    }

    @Override
    public T removeElement(int position) {
        list.remove(position);
        return null;
    }

    @Override
    public void showElements() {
        Iterator<T> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public void showReversedElements() {
        Iterator<T> it = list.iterator();

        for (int i = list.size() -1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
