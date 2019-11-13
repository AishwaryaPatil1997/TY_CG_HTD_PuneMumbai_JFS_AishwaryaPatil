import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
 
  users = [];

  constructor(http: HttpClient) {
      http.get<any>('../../assets/users.json').subscribe(data => {
        console.log(data);
        this.users = data;
      },err => {
        console.log(err);
      });
   }

  ngOnInit() {
  }

}
