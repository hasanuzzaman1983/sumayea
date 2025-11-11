function getHistory(){
    return document.getElementById("history-value").innerText;
}

function printHistory(){
    document.getElementById("history-value").innerText=num;
}

function getOutput(){
    return document.getElementById("output-value").innerText;
}

function printOut(num){
    if(mun==""){
        document.getElementById("output-value").innerText=num;
    }
}

else{
    document.getElementById("Output-value").innerText=getFormattedNumber(num);
}

function getFormattedNumber(num){
    if(num=="-"){
        return "";
    }
    var n = number(num);
    var value = n.tolocaleString("en");
    return value;
}

function reverseNumberFormat(num){
    return Number(num.replace(/,/g, ''));
}

var operator = document.getElementByClass("operator");
for(var i=0;i<operator.length;i++){
    operator[i].addEventListener('click,function'){
        if(this.id=="clear"){
            printHistory(" ");
                printOutput("");

            }

            else if(this.id=="backspace"){
                var  output=getOutput();
                var history=getHistory();
                if(output==""&&history[history.length-1])
                history=history.substr(0,history.length-1);
            }

        }

        if(output!="" || history!=""){
            output= output==""?output:reverseNumberFormat(output);
            history= history+output;
            if(this.id=="="){
                var result=eval(history);
                printOutput(result);
                printHistory("");
            }
        }
    }

    var number = document.getElementByClassName("number");
    for(var i =0;i<number.length;i++){
        number[i].addEventListener('click',function()){
            var output=reverseNumberFormat(getOutput());
            if(output!=NaN){// if output is a number
            output=output+this.id;
            printOutput(output);

        }
    }

    
    }

