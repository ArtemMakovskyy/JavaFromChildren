package Shildt.Classes.ResourceBundle;

import java.util.ListResourceBundle;
//p711
//редставляет комплект ресурсов по умолчанию для   поддержки английского языка
class SampleRВ extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        Object[][] resources = new Object[3][2];
        resources[0][0] = "title";
        resources[0][1] = "Му Program";

        resources[1][0] = "StopText";
        resources[1][1] = "Stop";

        resources[2][0] = "StartText";
        resources[2][1] = "Start";
        return resources;
    }
}