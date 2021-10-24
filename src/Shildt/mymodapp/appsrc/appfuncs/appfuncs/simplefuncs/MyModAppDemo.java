package Shildt.mymodapp.appsrc.appfuncs.appfuncs.simplefuncs;

public class MyModAppDemo {
    public static void main(String[] args) {
        if(SimpleMathFuncs.isFactor(2,10)) System.out.println("2 -множитель 10");
        System.out.println("Haимeньший общий множитель " + "35 и 105 -" + SimpleMathFuncs.lcf (35, 105));
        System.out.println("Haибoльший общий множитель " + "35 и 105 -" + SimpleMathFuncs.gcf (35, 105));
    }
}
