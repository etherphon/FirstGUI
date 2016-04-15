/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempConverter;

/**
 *
 * @author etherdesign
 */
public class CelciusToFahrenheitConverter implements TempConverterStrategy {
    
    public CelciusToFahrenheitConverter() {
        
    }
   
    @Override
    public final Double convertTemp(String cTemp) throws IllegalArgumentException {
        ValidatorStrategy tempValidator = new TemperatureValidatorService();
        
        if (!tempValidator.isValid(cTemp)) {
            throw new IllegalTempException();
        } else {
            return (Double.parseDouble(cTemp) * 1.8) + 32;
        }
    }
    
}
