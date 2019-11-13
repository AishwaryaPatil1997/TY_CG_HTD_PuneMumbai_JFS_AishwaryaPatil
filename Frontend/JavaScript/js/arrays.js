var x = [123456, "xyz", true, {name: "Samba"}];

console.log(x[0]);

for(var i=0; i < x.length; i++){
    console.log(x[i]);
}

var colors = ["red", "white", "black", "blue"];
console.log(colors);

colors.push("violet","pink");
console.log(colors);

colors.pop();
console.log(colors);

colors.unshift("purple","grey");
console.log(colors);

colors.shift();
console.log(colors);

colors.splice(2,2);
console.log(colors);

colors.splice(2,1,"green","orange");
console.log(colors);

colors.forEach(function(value,index,array){
    console.log(value,index,array);
});

//filter function
var myArray = [102,103,104,114,116,119,101,120];

var newArray = myArray.filter(function(value,index,array){
    return value>110;
})

console.log(newArray);

var myArray1 = [1,2,3,5,8,9,7,2,3,4,5,6,8,9,7,2,5,6,3,1,4,2,2];

var newArray1 = myArray1.filter(function(value,index,array){
    return array.indexOf(value)===index;
});

console.log(newArray1);

//for-of loop for only array
for(var a of myArray){
    console.log(a);
}

//for-in loop for array
for(var index in colors){
    console.log(colors[index],index);
}

//for-in loop for object
var movie = {
    name: "PK",
    actor: "Amir Khan",
    actress: "Anushka Sharma",
};

for(var key in movie){
    console.log(movie[key]);
}

//callback concept
function test(cb){
    console.log("test function started");
    cb();
    console.log("test function ended");
}

test(function(){
    console.log("callback function being executed");
});

//setTimeout concept
setTimeout(function(){
    console.log("10 seconds done");
},10000);

//setInterval concept
// var i = 1;
// setInterval(function(){
//     console.log(i);
//     i++;
// }, 2000);

