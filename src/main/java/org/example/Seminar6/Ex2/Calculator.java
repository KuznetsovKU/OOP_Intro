package org.example.Seminar6.Ex2;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation){
        if (operation == null){
            throw new InvalidParameterException("Can not perform operation");
        }
        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResut(subtraction.getLeft() - subtraction.getRight());
        }
    }

    public void calculateNew(CalculatorOperation operation){
        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResut(subtraction.getLeft() - subtraction.getRight());
        } else {
            throw new InvalidParameterException("Can not perform operation");
        }
    }

    public void calculateSwitch(CalculatorOperation operation){
        switch (operation.getClass().getSimpleName()){
            case "Addition":
                Addition addition = (Addition) operation;
                addition.setResult(addition.getLeft() + addition.getRight());
                break;
            case "Subtraction":
                Subtraction subtraction = (Subtraction) operation;
                subtraction.setResut(subtraction.getLeft() - subtraction.getRight());
                break;
            default:
                throw new InvalidParameterException("Can not perform operation");
        }
    }
}
