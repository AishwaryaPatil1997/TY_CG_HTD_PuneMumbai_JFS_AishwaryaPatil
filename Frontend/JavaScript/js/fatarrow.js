//fat arrow function with two arguments
let add = (a,b) => {
    console.log("The sum is "+(a+b));
}
add(10,20);

//fat arrow function with one argument
let printAge = age => {
    console.log("Age is "+age);
}
printAge(23);

//fat arrow function only with return statement
let product = (a,b) => a*b;
console.log(product(10,20));

