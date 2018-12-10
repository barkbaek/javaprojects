import java.util.ArrayList;
import java.util.List;

public class Lotto {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            list.add(i);
        }

        for (int i = 0; i < 100; i++) {
            int index1 = (int)(Math.random() * 45);
            int index2 = (int)(Math.random() * 45);
            int tmp;

            if (index1 != index2) {
                tmp = list.get(index1);
                list.set(index1, list.get(index2));
                list.set(index2, tmp);
            }
        }
        for (int i = 0; i <=5; i++) {
            System.out.println(list.get(i));
        }
    }
}

