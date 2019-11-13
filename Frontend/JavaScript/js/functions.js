var a = 100;
var b = 200;
console.log("a+b: ",a+b);
console.log("a*b: ",a*b);

//Anonymous function with expression
var x = function(){
    console.log("Hellooo!!!!!");
}
//calling a anonymous funtion
x();

//Naming function
function add(a,b){
    console.log("Addition res: ",a+b);
}
//calling naming funtion
add(10,20);

//Immediate invoke function expression
(function(x,y){
    console.log("x+y: ",x+y);
})(123,456)

//understanding return keyword
function division(c,d){
    return c/d;
}

console.log("Result:",division(12345678,2));