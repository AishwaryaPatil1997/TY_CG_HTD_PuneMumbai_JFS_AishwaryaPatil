import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-git-user',
  templateUrl: './git-user.component.html',
  styleUrls: ['./git-user.component.css']
})
export class GitUserComponent implements OnInit {

  gitUsers = [];

  constructor(http: HttpClient) { 
    http.get<any>('https://api.github.com/users').subscribe(data => {
      this.gitUsers = data;
      console.log(this.gitUsers);
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
