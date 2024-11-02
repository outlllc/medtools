package com.duckgo.medtools.datecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentDateCalculator3Binding

class DateCalculator_3 : BaseFragmentDataBinding<FragmentDateCalculator3Binding>(), View.OnClickListener {

    override fun getFragmentViewBinding(): FragmentDateCalculator3Binding {
        return FragmentDateCalculator3Binding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button0.setOnClickListener(this)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
        binding.button5.setOnClickListener(this)
        binding.button6.setOnClickListener(this)
        binding.button7.setOnClickListener(this)
        binding.button8.setOnClickListener(this)
        binding.button9.setOnClickListener(this)
        binding.localDate.setOnClickListener(this)
        binding.buttonAdd.setOnClickListener(this)
        binding.buttonSubtract.setOnClickListener(this)
        binding.buttonClear.setOnClickListener(this)
        binding.buttonDivide.setOnClickListener(this)
        binding.buttonMultiply.setOnClickListener(this)
        binding.buttonEqual.setOnClickListener(this)
        binding.buttonDot.setOnClickListener(this)
        binding.buttonPN.setOnClickListener(this)
        binding.buttonDelete.setOnClickListener(this)
        binding.buttonSplitDate.setOnClickListener(this)

    }

    private var firstNumber = ""
    private var secondNumber = ""
    private var operator = ""
    private var result = ""
//    private var isOperatorClicked = false
    private var isSecondNumber = false
    private var isDotClicked = false
    private var isNegative = false
    private var isSplitDate = false
    private var isDate = false
    private var showText = ""
    override fun onClick(v: View?) {
        var inpuntText = (v as TextView).text.toString()
        when(v?.id){
            R.id.buttonAdd -> {
                // TODO: 2023-03-27
                operator = inpuntText
                showInputText(showText + operator)

            }
            R.id.buttonSubtract -> {

            }
            R.id.buttonDivide -> {

            }
            R.id.buttonMultiply -> {

            }
            R.id.buttonEqual -> {
                var new_result = calculate()
                refreshOperator(new_result)
                showResult(new_result)
            }
//            R.id.buttonDot -> {
//
//            }
            R.id.buttonPN -> {

            }
            R.id.buttonClear -> {
                showInputText("0")
                refreshOperator("")
                clear()
            }
            R.id.buttonDelete -> {

            }
            R.id.buttonSplitDate -> {

            }
            R.id.localDate -> {

            }
            else -> {
                if (result.length > 0 && operator == ""){
                    clear()
                }

                if (operator == ""){
                    firstNumber += inpuntText
                }else{
                    secondNumber += inpuntText
                }

                if (showText == "0" && inpuntText != "."){
                    showInputText(inpuntText)
                }else{
                    showInputText(showText + inpuntText)
                }

            }
        }
    }

    private fun clear() {
        refreshOperator("")
        showInputText("0")
        showResult("")
    }

    private fun refreshOperator(new_result: String) {
        result = new_result
        firstNumber = new_result
        operator = ""
        secondNumber = ""

    }

    private fun calculate() : String{
        var in_result = ""
        when(operator){
            "+" -> {
                in_result = (firstNumber.toDouble() + secondNumber.toDouble()).toString()
                return in_result
            }
            "-" -> {
                in_result = (firstNumber.toDouble() - secondNumber.toDouble()).toString()
            }
            "/" -> {
                in_result = (firstNumber.toDouble() / secondNumber.toDouble()).toString()
            }
            "*" -> {
                in_result = (firstNumber.toDouble() * secondNumber.toDouble()).toString()
            }
        }
        return in_result
    }

    private fun showInputText(input: String) {
        showText = input
        binding.tvInput.text = input
    }
    private fun showResult(result: String) {
        binding.tvResult.text = result
    }
}