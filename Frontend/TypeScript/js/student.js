// class Student{
//     name: String;
//     age: number;
//     marks: number;
//     constructor(name: String, age: number, marks: number){
//         this.name = name;
//         this.age = age;
//         this.marks = marks;
//     }
// }
var Student = /** @class */ (function () {
    function Student(name, age, marks, degree //optional argument
    ) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
    }
    Student.prototype.printDetails = function () {
        console.log("Name is " + this.name + ", age is " + this.age + " and marks are " + this.marks + ".");
    };
    return Student;
}());
var student1 = new Student("ABC", 25, 98);
console.log(student1);
student1.printDetails();
