let person = {
    name: "Samba",
    age: 20
};

let student = {
    ...person,
    vid: 1234,
    percentage: 85.32
};

console.log(student);

let{name,age,...abc}=student;
console.log(name);
console.log(age);
console.log(abc);


let mpCRs = ["Samba","Sambi"];
let nCRs = ["Dinga","Dingi"];
let bCRs = ["Bunga","Bungi"];
let bangCRs = ["Munga","Mungi"];

let crs = [
    ...mpCRs,
    ...nCRs,
    ...bCRs,
    ...bangCRs
];

console.log(crs);

let[name1,name2,...restValues] = crs;
console.log(name1);
console.log(name2);
console.log(restValues);

