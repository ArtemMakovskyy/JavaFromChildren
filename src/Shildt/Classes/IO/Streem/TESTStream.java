package Shildt.Classes.IO.Streem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NameTelMail{
    String name;
    String tel;
    String mail;

    public NameTelMail(String name, String tel, String mail) {
        this.name = name;
        this.tel = tel;
        this.mail = mail;
    }

}
class NameTel{
    String name;
    String tel;

    public NameTel(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}

class DoTESTStream {
    void t1(int cellMem) {
        ArrayList<Integer> listA = new ArrayList<>();
        int[] ar = new int[cellMem];

        for (int i = 0; i < cellMem; i++) {
            int temp = 0;
            if (i % 2 == 0) {
                temp = (int) Math.sqrt(i);
                listA.add(temp);
                ar[i] = listA.get(i);
            } else {
                temp = i;
                listA.add(temp);
                ar[i] = listA.get(i);
            }
        }

        int sumAr = 0;
        int sumArList = 0;

        long startA = System.nanoTime();
        for (int i = 0; i < ar.length; i++) {
            sumAr += ar[i];
        }
        long finA = System.nanoTime();

        long StartTl = System.nanoTime();
        sumArList = listA.stream().reduce(0, (a, b) -> (a + b));
        long StartEl = System.nanoTime();

        long StartTl2 = System.nanoTime();
        sumArList = listA.parallelStream().reduce(0, (a, b) -> (a + b));
        long StartEl2 = System.nanoTime();

        long StartTl3 = System.nanoTime();
        int sum = listA.parallelStream().reduce(0, (a, b) -> (a + b), (a, b) -> (a + b));
        long StartEl3 = System.nanoTime();

        System.out.println(sumAr + "                   arr " + (startA - finA) / 10000 * -1);
        System.out.println(sumArList + "          list stream " + (StartTl - StartEl) / 10000 * -1);
        System.out.println(sumArList + "  list Paralel stream " + (StartTl2 - StartEl2) / 10000 * -1);
        System.out.println(sumArList + " list Paralel stream2 " + (StartTl3 - StartEl3) / 10000 * -1);
    }

    void tels(){
        ArrayList<NameTelMail> ntmAList = new ArrayList<>();
        ntmAList.add(new NameTelMail(" Sasha "," 044 587 6708 "," saha@gmail.com"));
        ntmAList.add(new NameTelMail(" Masha "," 050 382 6772 "," masha@gmail.com"));
        ntmAList.add(new NameTelMail( " Ira "," 067 995 0000 "," ira@gmail.com"));
        ntmAList.stream().forEach(a -> System.out.println(a.name + a.tel + a.mail));//view;

        System.out.println();
        Stream <NameTel> ntStream = ntmAList.stream().map(a->new NameTel(a.name,a.tel));
        ntStream.forEach(a-> System.out.println(a.name+a.tel));

        System.out.println();
        ArrayList<NameTel> alNT = (ArrayList<NameTel>) ntmAList.stream()
                .map(a->new NameTel(a.name,a.tel))
                .collect(Collectors.toList());
        alNT.forEach(a-> System.out.println(a.name));




    }
}

public class TESTStream {
    public static void main(String[] args) {
        int cellMem = 1000000;


        ArrayList<Integer> listA = new ArrayList<>();
        int[] ar = new int[cellMem];

        for (int i = 0; i < cellMem; i++) {
            int temp = 0;
            if (i % 2 == 0) {
                temp = (int) Math.sqrt(i);
                listA.add(temp);
                ar[i] = listA.get(i);
            } else {
                temp = i;
                listA.add(temp);
                ar[i] = listA.get(i);
            }
        }

        Stream<Integer> sorted = listA.stream().sorted();
//        sorted.forEach(a-> System.out.println(a));

        Optional op = listA.stream().reduce((a, b) -> (a + b));
        System.out.println(op.get());

        int op2 = listA.stream().reduce((a, b) -> (a + b)).get();
        System.out.println(op2);

        System.out.println("++++++++++++++");
        DoTESTStream start = new DoTESTStream();
        start.t1(cellMem);
        System.out.println("++++++++++++++");
        start.tels();
    }
}
