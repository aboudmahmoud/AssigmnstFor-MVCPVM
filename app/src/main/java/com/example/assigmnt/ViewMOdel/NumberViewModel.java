package com.example.assigmnt.ViewMOdel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.assigmnt.NumberMod;

public class NumberViewModel extends ViewModel {
    public MutableLiveData<Integer> numberMins=new MutableLiveData<>();

    int mins;
    public void getNumbers(NumberMod numberMod1 )
    {
        NumberMod numberMod=numberMod1;
        mins=numberMod.getNumberOne()-numberMod.getIntNumberTwo();
        numberMins.setValue(mins);
    }
}
