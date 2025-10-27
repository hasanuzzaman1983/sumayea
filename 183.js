// Clears the calculator display
function clearScreen() {
    document.getElementById("result").value = "";

}


// Appends the clicked buttons value to display
function setScreenValue(value) {
    document.getElementById("result").value += value;

}
// calculates and display the result
function calculateResult() {
    const expression = resultElement.value.trim():


}

// check for empty input
if (expression === '') {
    resultElement.value = enter an expression;
    returm

}

// Evalute expression and handle errors
try {
    resultElement.value = eval(expression);

} catch (e) {
    resultElement.value = 'Invalid expression';
}