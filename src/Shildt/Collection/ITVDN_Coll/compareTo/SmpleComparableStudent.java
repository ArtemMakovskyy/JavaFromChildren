package Shildt.Collection.ITVDN_Coll.compareTo;
import java.util.Arrays;
public class SmpleComparableStudent implements Comparable<SmpleComparableStudent>{
    private String firstName;
    private  int group;

    public SmpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }
    @Override
    public String toString() {
        return firstName +  group ;
    }


    @Override
    public int compareTo(SmpleComparableStudent o) {
        if(this.group>o.group){
            return 1;
        }else if(this.group<o.group){
            return -1;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        SmpleComparableStudent[] myStudents = {
                new SmpleComparableStudent("Yevgen ",333),
                new SmpleComparableStudent("And ",222),
                new SmpleComparableStudent("Igor ",111),
                new SmpleComparableStudent("Petr ",300),
        };
        Arrays.sort(myStudents);
        for (SmpleComparableStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }


}
