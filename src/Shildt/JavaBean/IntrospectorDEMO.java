package Shildt.JavaBean;

import java.beans.*;

public class IntrospectorDEMO {
    public static void main(String[] args) {

        try {

            Class<?> сlasz = Class.forName(new COLORS().getClass().getName());
            BeanInfo beanInfo = Introspector.getBeanInfo(сlasz);
            System.out.println("Cвoйcтвa: ");
            PropertyDescriptor propertyDescriptor[] = beanInfo
                    .getPropertyDescriptors();
            for (int i = 0; i < propertyDescriptor.length; i++) {
                System.out.println("\t" + propertyDescriptor[i].getName());
            }
            System.out.println("Coбытия: ");
            EventSetDescriptor eventSetDescriptor[] =
                    beanInfo.getEventSetDescriptors();
            for (int i = 0; i < eventSetDescriptor.length; i++) {
                System.out.println("\t" + eventSetDescriptor[i].getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

