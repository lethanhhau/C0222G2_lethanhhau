"use strict";
function fibonacci(index) {
    if (index == 0) {
        return index;
    }
    if (index == 1) {
        return index;
    }
    return fibonacci(index - 1) + fibonacci(index - 2);
}
let sum = 0;
let n = 20;
for (let i = 0; i < n; i++) {
    sum += fibonacci(i);
    console.log(fibonacci(i))
}
console.log(sum);
