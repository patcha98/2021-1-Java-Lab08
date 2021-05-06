/**
* package edu.handong.csee.java.hw2.converters
*/
package edu.handong.csee.java.hw2.converters;




/**
* this is class of TON to All and KM to ALL Converter
*/
public class AllConverter{
    /**
     * original measure 
     */
    private String originalMeasure;
    /**
     * value that converted
     */
    private double ConvertedValue;
    /**
     * value that not converted
     */
    private double fromValue;
    /**
     * out put measual
     */
    private String ConvertedMeasual;


    /**
    * this function bring the value from IntegratedConverter.java
    * @return fromValue (value what just got)
    */
    public AllConverter setFromValue(double fromValue){
        this.fromValue = fromValue;
        return this;
    }
    
    /**
    * this function bring the string value from IntegratedConverter.java
    * @return  originalMeasure (string value about original measure)
    * @param String original measure could be TON or KM
    */
    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMeasure = originalMeasure;
        return this;
    }
    /**
    * this function convert the original value to (KG and G) or (KM and M)
    */  
    public void convertAndPrintOut(){


        if(originalMeasure.equals("TON")){
            ConvertedValue = fromValue * 1000.0;
            ConvertedMeasual = "KG";
            System.out.println(fromValue + " " + originalMeasure + " to " + ConvertedValue + " " + ConvertedMeasual);
            ConvertedValue = fromValue * 1000000.0;
            ConvertedMeasual = "G";
            System.out.println(fromValue + " " + originalMeasure + " to " + ConvertedValue + " " + ConvertedMeasual);
        }

        else if(originalMeasure.equals("KM")){
            ConvertedValue = fromValue * 1000.0;
            ConvertedMeasual = "M";
            System.out.println(fromValue + " " + originalMeasure + " to " + ConvertedValue + " " + ConvertedMeasual);
            ConvertedValue = (fromValue) * (0.625);
            double answer = ConvertedValue;
            ConvertedValue = Double.parseDouble(String.format("%.5f",answer));

            System.out.println(ConvertedValue);
            ConvertedMeasual = "MILE";
            System.out.println(fromValue + " " + originalMeasure + " to " + ConvertedValue + " " + ConvertedMeasual);
        }

        else{
            System.out.println("AllConverter cannot support the measure!");
        }

    }
}