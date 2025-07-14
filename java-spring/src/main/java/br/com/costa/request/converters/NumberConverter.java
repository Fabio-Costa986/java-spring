package br.com.costa.request.converters;

import br.com.costa.exception.ResourceNotFoundException;

public class NumberConverter {

    public static double convertToDouble(String strNumber) throws IllegalArgumentException {

        if(strNumber == null || strNumber.isEmpty()) throw new ResourceNotFoundException("Please set a numeric value!");
        String number = strNumber.replace(",",".");
        return Double.parseDouble(number);

    }

    public static boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
