//literal way of object creation
var student = {
    name: "Dinga",
    age: 24,
    degree: "BE",
    phoneNumber: 9876543210
};

console.log(student.name);
console.log(student);

student.phoneNumber = 1234567890;
console.log(student);

student.selectedCompany = "Capgemini";
console.log(student);

//using object constructor
var laptop = new Object();
laptop.brand = "DELL";
laptop.ram = "8GB";
laptop.processor = "core i5";
laptop.price = 49999;

console.log(laptop);

console.log(Object.keys(laptop).length);