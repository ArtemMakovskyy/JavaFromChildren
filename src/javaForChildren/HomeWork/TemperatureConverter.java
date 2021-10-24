package javaForChildren.HomeWork;

public class TemperatureConverter {
    int temperature;
    char convertTo;

    public String convertTemp (int temperature,char convertTo){
        this.temperature = temperature;
        this.convertTo = convertTo;
        if(this.convertTo == 'C'| this.convertTo == 'c'){
            return temperature+", "+convertTo;
        }else if (this.convertTo == 'F'| this.convertTo == 'f'){

        }        return ((temperature-32)/1.8)+", "+" по цельсию";



    }

}
