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
* this is class of TONToKGConverter it converts TON value to KG
*/
public class TONToKGConverter implements Convertible{
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
    * this function returns the converted value (TON to KG)
    * @return ConvertedValue (value that converted TON to KG)
    */
    public double getConvertedValue(){
        return ConvertedValue;
    }
    /**
    * this function that convert the TON value to KG
    */
    public void convert(){
            ConvertedValue = value * 1000;
    }
}

