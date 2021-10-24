package BB.Less15;
//https://www.youtube.com/watch?v=0Q--MYvB68M
public class Main {
    public static void main(String[] args) {
        CastomArreyList<String>strings = new CastomArreyList<>();
        for (int i = 0; i < 100; i++) {
            strings.add("Hello world "+i);
        }
        for (int i = 0; i < strings.getLength(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
