import { Component, OnInit } from '@angular/core';
import { Mobile } from '../mobile';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {

  mobiles: Mobile[] = [
    {
      brand: 'Samsung Galaxy s5',
      imgURL: 'https://cdn.pixabay.com/photo/2017/01/06/13/50/smartphone-1957740__340.jpg',
      price: 35999,
      specs: `Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your
       Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty.
        Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN
         by HP 15, HP Notebook - 15.`
    }, {
      brand: 'Moto G2',
      imgURL: 'https://cdn.pixabay.com/photo/2015/11/17/21/46/navigation-1048294__340.jpg',
      price: 23000,
      specs: `Motorola Mobile 2nd Generation X407UB. Processor. Intel® Core™ i3 6006U
       Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends
        Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB 
        SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel 
        with 45% NTSC. Graphic Storage.`
    }, {
      brand: 'Asus Zenfone 5',
      imgURL: 'https://cdn.pixabay.com/photo/2016/11/10/16/18/android-1814600__340.jpg',
      price: 14999,
      specs: `ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz 
      (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. 
      Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" 
      (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.`
    }, {
      brand: 'Karbonn',
      imgURL: 'https://cdn.pixabay.com/photo/2015/05/12/09/13/social-media-763731__340.jpg',
      price: 24999,
      specs: `Comes W/ Infinity Edge IPS Display. Mobiles W/ Intel® Core™ Processor, Buy 
      Now! Cash off on MS Office. Get 3Yr Hardware Warranty. Get 3Yr Premium Support. 
      Amenities: Dell Pro Backpack, Dell Bluetooth Mouse, Dell Professional Headset, 
      Accidental Damage Service.`
    }, {
      brand: 'Intex',
      imgURL: 'https://cdn.pixabay.com/photo/2015/01/20/13/13/ipad-605439__340.jpg',
      price: 4999,
      specs: `This item 2015 Intex Satellite 15.6-inch Laptop- 5th Gen Intel Core i7-5500U
       Processor 3.0GHz, 4MB Cache, 8GB Memory, 1TB HDD, HDMI, Bluetooth, Webcam, WIFI, 
       AMD R7 M260, Windows 8.1/Windows 10.`
    }
  ]

  selectedMobile: Mobile = this.mobiles[0];

  constructor() { }

  selectMobile(mobile: Mobile) {
    this.selectedMobile = mobile;
  }

  ngOnInit() {
  }

}
