let b : String = "Samba"; //Explicitly datatype is declared

let company1; // Implicitly datatype is declared as any
company1 = 1234;
company1 = "ty";
company1 = true;

let age1 : String | number;//union
age1 = 24;
age1 = "Twenty Four";
//age = true; ERROR

let details1: [String,number,number] = ["abc",1234,56789]; //tuple

let mobiles1: String[] = ["abc","def","ghi","jklm","nop","qrst","uvw","xyz"]; //array

//function
function addition(a:number,b:number):number{
    return a+b;
}