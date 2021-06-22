package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class listMethod {
    public static void main(String[] args) {
        List<String> list = getDays();
        System.out.println("list = " + list);
        System.out.println("getDays().size() = " + getDays().get(0));
        System.out.println("getDays().size() = " + getDays().size());
        list.add("java day");
        list.removeIf(day -> day.length() == 6);
        System.out.println("dayNames after removeIf = " + list);


        System.out.println(size(10));
        List<Integer> nums = size(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90);
        System.out.println("nums = " + nums);


    }

    public static List<String> getDays() {
        List<String> weekDays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));
        return weekDays;

    }

    public static List<Integer> size(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
//            int n = random.nextInt(101);
//            if (!list.contains(n))
//                list.add(n);
            list.add(random.nextInt(101));
        }
        return list;
    }

}
