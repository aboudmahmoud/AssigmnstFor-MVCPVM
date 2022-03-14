package com.example.assigmnt.Mvp;

import com.example.assigmnt.NumberMod;

public class NumberPresnater {
    NumberInerFase inerFase;
    NumberMod numberMod;

    public NumberPresnater(NumberInerFase inerFase) {
        this.inerFase = inerFase;
    }

    public NumberMod getNumbers(int num1,int num2)
    {
        numberMod=new NumberMod(num1,num2);
        return numberMod;
    }
    public  void Numbersater( int num1,int num2)
    {
        inerFase.setNumbers(getNumbers(num1,num2).getNumberOne(),getNumbers(num1,num2).getIntNumberTwo());
    }

}
