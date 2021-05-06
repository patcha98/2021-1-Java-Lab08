/**
* package edu.handong.csee.java.hw2.converters
*/
package edu.handong.csee.java.hw2.converters;
/**
* import all files in edu.handong.csee.java.hw2.converters
*/
import edu.handong.csee.java.hw2.converters.*;
/**
* import edu.handong.csee.java.hw2.converters.Convertibl
*/
import edu.handong.csee.java.hw2.converters.Convertible;
/**
* this is class of MILEtoKMConverter it converts Mile value to KM
*/
public class MILEtoKMConverter implements Convertible{
    /**
     * value that converted
     */
    private double ConvertedValue;
    /**
     * value that not converted
     */
    private double value;
    /**
    * this function bring the value from IntegratedConverter.java
    */
    public void setFromValue(double fromValue){
        value = fromValue;
    }
    /**
    * this function returns the converted value (Mile to KM)
    * @return ConvertedValue (value that converted Mile to KM)
    */
    public double getConvertedValue(){
        return ConvertedValue;
    }
    /**
    * this function that convert the Mile value to KM
    */
    public void convert(){
            ConvertedValue = value * 1.609344;
    }
}

