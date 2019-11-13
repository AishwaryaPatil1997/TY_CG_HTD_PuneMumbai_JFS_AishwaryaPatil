import { Component, OnInit } from '@angular/core';
import { Products } from '../products';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products: Products[] = [
    {
      name: 'MacBook Air',
      imgURL: "https://cdn.pixabay.com/photo/2014/05/02/21/47/workstation-336369__340.jpg",
      price: 56999,
      details: 'Good Laptop'
    },{
      name: 'Smart Phone',
      imgURL: "https://cdn.pixabay.com/photo/2018/01/08/02/34/technology-3068617__340.jpg",
      price: 50000,
      details: 'Very good phone'
    },{
      name: 'Cat',
      imgURL: "https://cdn.pixabay.com/photo/2019/05/08/21/21/cat-4189697__340.jpg",
      price: 20000,
      details: 'Cute cat'
    }
  ]
  constructor() { }

  ngOnInit() {
  }

}
