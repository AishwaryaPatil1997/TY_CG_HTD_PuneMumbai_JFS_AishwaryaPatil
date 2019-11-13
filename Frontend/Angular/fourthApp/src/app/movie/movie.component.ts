import { Component, OnInit } from '@angular/core';
import { Movie } from '../movie';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {

  movies: Movie[] = [
    {
      name: 'Avengers',
      imgURL: 'https://cdn.pixabay.com/photo/2018/05/08/11/36/avenger-3382834__340.jpg',
      rating: '9/10',
      specs: `Adrift in space with no food or water, Tony Stark sends a message to
       Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining 
       Avengers -- Thor, Black Widow, Captain America and Bruce Banner -- must figure 
       out a way to bring back their vanquished allies for an epic showdown with`
    }, {
      name: 'Ironman',
      imgURL: 'https://cdn.pixabay.com/photo/2019/05/25/12/30/iron-man-4228269__340.jpg',
      rating: '9/10',
      specs: `When an industrialist is captured, he constructs a high-tech armoured suit
       to escape. Once he manages to escape, he decides to use his suit to fight against
        evil forces and save the world.`
    }, {
      name: 'Charlie Chaplin',
      imgURL: 'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      rating: '6/10',
      specs: `Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, 
      and composer who rose to fame in the era of silent film. He became a worldwide 
      icon through his screen persona, "The Tramp", and is considered one of the most
       important figures in the history of the film industry.`
    }, {
      name: 'Captain America',
      imgURL: 'https://cdn.pixabay.com/photo/2019/08/25/06/43/captain-america-4428842__340.jpg',
      rating: '10/10',
      specs: `After Steve Rogers decides to volunteer as a guinea pig in an experiment, 
      his weak body is fully enhanced. A secret Nazi organisation tries to exploit the 
      technology and he must stand against them.`
    }, {
      name: 'Avatar',
      imgURL: 'https://image.shutterstock.com/image-photo/avatar-woman-magical-forest-260nw-308973533.jpg',
      rating: '10/10',
      specs: `Jake, a paraplegic marine, replaces his brother on the Navi inhabited 
      Pandora for a corporate mission. He is accepted by the natives as one of their 
      own but he must decide where his loyalties lie.`
    }
  ]

  selectedMovie: Movie = this.movies[0];

  constructor() { }

  selectMovie(movie: Movie) {
    this.selectedMovie = movie;
  }

  ngOnInit() {
  }

}
