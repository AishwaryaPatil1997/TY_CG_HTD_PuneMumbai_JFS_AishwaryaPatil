import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {

  flag = false;
  person = 'Samba';

  students: Student[] = [
    {
      id: 101,
      name: 'Samba',
      age: 22,
      degree: 'BE'
    }, {
      id: 102,
      name: 'Dinga Swami',
      age: 25,
      degree: 'ME'
    }, {
      id: 103,
      name: 'Dingi',
      age: 22,
      degree: 'BSc'
    }, {
      id: 104,
      name: 'Sambi',
      age: 18,
      degree: 'BE'
    }, {
      id: 105,
      name: 'Bunga',
      age: 23,
      degree: 'MBA'
    }
  ]

  constructor() {
    setTimeout(() => {
      this.flag = true;
    }, 2000);
  }

  deleteStudent(student: Student){
    const index = this.students.indexOf(student);
    this.students.splice(index,1);
  }

  ngOnInit() {
  }

}
