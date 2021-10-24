package Shildt.Collection.ITVDN_Coll.COLL_FUNC;

import java.util.LinkedList;

class Address{
    private String name;
    private String string;
    private String city;
    private String state;
    private String code;

    public Address(String name, String string, String city, String state, String code) {
        this.name = name;
        this.string = string;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", string='" + string + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

public class MailList_Linked {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();
//        ввести элементы в  связный  список

        ml.add(new Address("J.W. Wes","11 Oak Av","Urbana","IL","61801"));
        ml.add(new Address("Ralph  Baker","1142 Maple  Lan","Mahomet","IL","61853"));
        ml.add(new Address("Tom  Carlton","867 Elm S","Champaign","IL","61820"));

        for (Address el : ml){
            System.out.println(el+"");
        }
    }

}
