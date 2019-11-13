import { Component, OnInit } from '@angular/core';
import { Laptop } from '../laptop';

@Component({
  selector: 'app-laptop',
  templateUrl: './laptop.component.html',
  styleUrls: ['./laptop.component.css']
})
export class LaptopComponent implements OnInit {

  laptops: Laptop[] = [
    {
      brand: 'Apple Macbook Air',
      imgURL: 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
      price: 59999,
      specs: `2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared
       L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.
        2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 
        cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.`
    }, {
      brand: 'Lenovo',
      imgURL: 'https://cdn.pixabay.com/photo/2014/11/12/15/48/tablet-pc-528464__340.jpg',
      price: 23000,
      specs: `Lenovo Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz
       (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro.
        Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display.
         14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. 
         Graphic Storage.`
    }, {
      brand: 'Acer',
      imgURL: 'https://cdn.pixabay.com/photo/2015/05/31/10/51/acer-791027__340.jpg',
      price: 24999,
      specs: `Comes W/ Infinity Edge IPS Display. Laptops W/ Intel® Core™ Processor, 
      Buy Now! Cash off on MS Office. Get 3Yr Hardware Warranty. Get 3Yr Premium 
      Support. Amenities: Dell Pro Backpack, Dell Bluetooth Mouse, Dell Professional
       Headset, Accidental Damage Service.`
    }, {
      brand: 'Sony',
      imgURL: 'https://cdn.pixabay.com/photo/2018/09/07/05/41/surface-book-3659999__340.jpg',
      price: 46666,
      specs: `Sony Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz 
      (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro.
       Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9)
        LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.`
    }
  ]

  selectedLaptop: Laptop = this.laptops[0];

  constructor() { }

  selectLaptop(laptop: Laptop) {
    this.selectedLaptop = laptop;
  }

  ngOnInit() {
  }

}
