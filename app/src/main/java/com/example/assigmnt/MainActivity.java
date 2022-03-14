package com.example.assigmnt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.assigmnt.Mvp.NumberInerFase;
import com.example.assigmnt.Mvp.NumberPresnater;
import com.example.assigmnt.ViewMOdel.NumberViewModel;
import com.example.assigmnt.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    NumberMod numberMod;
    NumberPresnater presnater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NumberViewModel numberViewModel= new ViewModelProvider(this).get(NumberViewModel.class);
        numberViewModel.numberMins.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.minsreslut.setText(String.valueOf(integer));
            }
        });
        presnater=new NumberPresnater(new NumberInerFase() {
            @Override
            public void setNumbers(int num1, int num2) {
                double div=num1/num2;
binding.divresult.setText(String.valueOf(div));
            }
        });
        binding.blus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int num1 =Integer.parseInt(binding.number1.getText().toString());
                int num2 =Integer.parseInt(binding.number2.getText().toString());
                numberMod= new NumberMod(num1,num2);
                double ans=numberMod.getNumberOne()+numberMod.getIntNumberTwo();
                binding.plsueres.setText(""+ans);
            }
        });
        binding.deivd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(binding.number1.getText().toString());
                int num2 =Integer.parseInt(binding.number2.getText().toString());
                presnater.Numbersater(num1,num2);
            }
        });
        binding.mins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(binding.number1.getText().toString());
                int num2 =Integer.parseInt(binding.number2.getText().toString());
                numberMod= new NumberMod(num1,num2);
                numberViewModel.getNumbers(numberMod);
            }
        });


    }
}