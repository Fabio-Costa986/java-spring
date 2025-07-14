package br.com.costa.math;

import br.com.costa.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {


    public  double sum(double numberOne, Double numberTwo){

        return numberOne + numberTwo;
    }

    public  double subtraction(double numberOne, Double numberTwo){

        return numberOne - numberTwo;
    }

    public  double multiplication(double numberOne, Double numberTwo){

        return numberOne * numberTwo;
    }

    public  double division(double numberOne, Double numberTwo){

        return numberOne / numberTwo;
    }

    public  double mean(double numberOne, Double numberTwo){

        return (numberOne + numberTwo) / 2;
    }

    public  double squareRoot(double number){

        return Math.sqrt(number);
    }


}
