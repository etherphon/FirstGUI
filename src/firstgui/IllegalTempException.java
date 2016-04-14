/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgui;

/**
 *
 * @author etherdesign
 */
public class IllegalTempException extends IllegalArgumentException {
    
    private static final String ERROR_MSG = "Temperature is out of range or not numeric.";
    
    public IllegalTempException() {
        super(ERROR_MSG);
    }

    public IllegalTempException(String s) {
        super(ERROR_MSG);
    }

    public IllegalTempException(String message, Throwable cause) {
        super(ERROR_MSG, cause);
    }

    public IllegalTempException(Throwable cause) {
        super(cause);
    }
    
    
}
