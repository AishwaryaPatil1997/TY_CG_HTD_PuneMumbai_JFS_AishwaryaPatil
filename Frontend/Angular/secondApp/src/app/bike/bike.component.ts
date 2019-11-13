import { Component, OnInit } from '@angular/core';
import { Bike } from '../bike';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {

  bikes: Bike[] = [
    {
      brand: 'Royal Enfield',
      imgURL: 'https://cdn.pixabay.com/photo/2017/11/23/04/08/royal-enfield-2972007__340.jpg',
      model: 'Classic 350',
      price: 160000,
      specs: `The Royal Enfield Classic 350 is powered by a 346 cc air-cooled 
              engine which produces of power. It has a fuel tank of 13.5 L and
              a claimed mileage of 40.8 kmpl.The Royal Enfield Classic 350 starts
              at Rs 1.45 Lakh and goes up to Rs 1.64 Lakh (ex-showroom, Delhi).
              It is available in five variants.`
    }, {
      brand: 'Yamaha',
      imgURL: 'https://cdn.pixabay.com/photo/2019/10/12/08/33/yamaha-4543414__340.jpg',
      model: 'v_star 1100',
      price: 100000,
      specs: `The 2009 Yamaha V-Star 1100 Classic features a 65-cubic-inch engine. 
              This air-cooled, 75-degree, V-twin engine produces 62 horsepower at 
              5,750 rpm and 63 foot-pounds of torque at only 2,500 rpm. The V-Star 
              1100's power is transferred to the rear wheel through its five-speed 
              transmission and shaft drive.`
    }
  ]

  selectedBike: Bike = this.bikes[0];

  constructor() { }

  selectBike(bike: Bike) {
    this.selectedBike = bike;
  }

  ngOnInit() {
  }

}
