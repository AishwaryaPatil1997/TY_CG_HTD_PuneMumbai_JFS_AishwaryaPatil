import { Component, OnInit } from '@angular/core';
import { Car } from '../car';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  cars: Car[] = [
    {
      brand: 'Suzuki',
      imgURL: 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
      model: '1885',
      specs: `The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel
       engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant
        and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 
        seater Hatchback and has a length of 3840mm.`
    }, {
      brand: 'BMW',
      imgURL: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      model: '2010',
      specs: `BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and
       goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new 
       car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT
        (Rs. 47.70 lakh) are among the popular cars from BMW.`
    }, {
      brand: 'Lamborghini',
      imgURL: 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
      model: '2010',
      specs: `The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine 
      on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. 
      Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 
      kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.`
    }, {
      brand: 'Audi A3',
      imgURL: 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
      model: '2015',
      specs: `Audi A3 Variants & Price: The Audi A3 is available in two variants: 
      Premium Plus and Technology, priced from Rs 28.99 lakh to 31.99 lakh (ex-showroom pan-India). 
      Audi A3 Engines: The A3 comes with a 1.4-litre TFSI turbocharged petrol engine that
       makes 150PS of power and 250Nm.`
    }
  ]

  selectedCar: Car = this.cars[0];

  constructor() { }

  selectCar(car: Car) {
    this.selectedCar = car;
  }

  ngOnInit() {
  }

}
