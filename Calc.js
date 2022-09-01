const operator = prompt('Enter an operator of +, -, /, * or % :');

var firstNumber = parseInt(prompt('Enter first number: '));
if (!Number.isInteger(firstNumber)){
  alert ("Enter a digit");
}
var secondNumber = parseInt(prompt('Enter second number: '));
if (!Number.isInteger(secondNumber)){
  alert ("Enter a digit");
}

let result;

if (operator == '+'){
  result = firstNumber + secondNumber;
}
else if (operator == '-') {
  result = firstNumber - secondNumber;
}
else if (operator == '/') {
  result = firstNumber / secondNumber;
}
else if (operator == '*') {
  result = firstNumber * secondNumber;
}
else if (operator == '%' ) {
  result = firstNumber % secondNumber;
}
else{
  alert("Invalid Operator");
}

console.log(`${firstNumber} ${operator} ${secondNumber} = ${result}`);