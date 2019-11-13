import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {

  movies: [];

  constructor(http: HttpClient) { }

  ngOnInit() {
  }

  searchMovie(movie){
    console.log(movie.value);
    // this.http.get<any>()
  }
}
