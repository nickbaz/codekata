package com.nbazinet.stringcalculator;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator {
    
    public int add(String numbers) {
        
        if( StringUtils.isBlank(numbers) ) {
            return 0;
        }
        
        if( numbers.contains(",\n")) {
            throw new RuntimeException("Format of the input numbers is not valid. Should not contains '\\n' after a coma.");
        }
        
        String[] numberArray = numbers.split(",|\n");
        
        int sum = 0;
        for(String numberStr : numberArray) {
            sum += Integer.parseInt(numberStr);
        }
        return sum;
        
    }
    
}
