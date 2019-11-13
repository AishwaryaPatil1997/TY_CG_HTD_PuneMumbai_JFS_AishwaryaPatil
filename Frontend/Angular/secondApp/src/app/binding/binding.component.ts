import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  inputData;
  flag = true;
  name = 'Samba';
  imgURl = 'https://cdn.pixabay.com/photo/2019/10/06/11/58/sunshine-4530030__340.jpg';

  constructor() {
    // setTimeout(() => {
    //   this.flag = false;
    // }, 1000);
    setInterval(() => {
      this.flag = !this.flag;
    }, 2000)
  }

  eventOccured(input) {
    console.log(input.value);
  }

  ngOnInit() {
  }

}
