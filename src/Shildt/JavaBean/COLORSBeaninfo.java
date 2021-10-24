package Shildt.JavaBean;


import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class COLORSBeaninfo extends SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor rectangular =
                    new PropertyDescriptor("rectangular",
                            COLORS.class);
            PropertyDescriptor pd[] = {rectangular};
            return pd;
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
