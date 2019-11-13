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

class Student{
    constructor(
        public name: string, 
        public age: number, 
        public marks: number,
        public degree ?: string //optional argument
        ){  
    }

    // printDetails(){
    //     console.log(`Name is ${this.name}, age is ${this.age} and marks are ${this.marks}.`)
    // }
}

let student = new Student("ABC",25,98);
console.log(student);
// student.printDetails();

let student2: Student = {
    name: "XYZ",
    age: 25,
    marks: 88.32,
    degree: "BE"
}

let students: Student[] = [
    new Student("ABC",25,98),
    {
        name: "XYZ",
        age: 25,
        marks: 88.32,
        degree: "BE"
    },
        student2,
        student
];

for(let s of students){
    console.log(s);
};
