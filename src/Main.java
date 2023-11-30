import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(54);
        number.add(5);
        number.add(5);
        number.add(1);
        number.add(5);
        number.add(57);
        number.add(5);
        findPairNumber(number, 10);
        quantitySameNumbers(number);
        deleteAllSame(number);
        reverseList(number);
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("184");
        strings.add("1");
        strings.add("156");
        strings.add("12");
        //oneString(strings);
        biggerThen(number,8);
//        unicalStrings(strings);
        deleteAllExeptX(strings, 2);
    }

    public static void findPairNumber(ArrayList<Integer> number, int x){
        for (int i = 0; i < number.size()-1; i++) {
            for (int j = i+1; j < number.size(); j++) {
                if (number.get(i)+number.get(j)==x){
                    System.out.println(number.get(i)+" "+number.get(j));
                }
                else {
                    continue;
                }
            }
        }
    }

    public static void quantitySameNumbers(ArrayList<Integer> number){
        for (int i = 0; i < number.size(); i++) {
            int z = 0;
            for (int j = 0; j < number.size(); j++) {
                if (number.get(i) == number.get(j)){
                    z++;
                }
            }
            System.out.println(z);;
        }

    }

    public static void deleteAllSame(ArrayList<Integer> number){
        for (int i = 0; i < number.size()-1; i++) {
            for (int j = i+1; j < number.size(); j++) {
                if (number.get(i)==number.get(j)){
                    number.remove(number.get(j));

                }
            }
        }
        System.out.println(number);
    }

    public static <T> void reverseList(List<T> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
        System.out.println(list);
    }

    public static void deleteSame(List<String> strings, String str){
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i)==str){
                strings.remove(strings.get(i));
            }
        }
        System.out.println(strings);
    }

//    public static void oneString(List<String> strings){
//        List<String> str = new ArrayList<String>();
//        for (int i = 1; i < strings.size(); i++) {
//            strings.get(0) += strings.get(i);//тоже самое, не понимаю в чем ошибка
//        }
//        System.out.println(str);
//    }

    public  static  void biggerThen(ArrayList<Integer> number, int x){
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i)>x){
                list2.add(number.get(i));
            }
        }
        System.out.println(list2);
    }

    public static void toInteger(List<String> strings){
        List<Integer> length = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            length.add(strings.get(0).length());
        }
        System.out.println(length);
    }

//    public static void unicalStrings(List<String> strings){
//        List<String> str = new ArrayList<>(strings.size());
//        for (int i = 0; i < strings.size(); i++) {
//            for (int j = 1; j < strings.size(); j++) {
//                if (strings.get(i)!=strings.get(j) || strings.get(i)!=str.get(i)){
//                    str.add(strings.get(i));
//                }
//            }
//        }
//        System.out.println(str);
//    }

    public static void deleteAllExeptX(List<String> strings, int x){
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length()<x){
                strings.remove(i);
            }
        }
        System.out.println(strings);
    }



}

