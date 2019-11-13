import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { BikeComponent } from './bike/bike.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { HeaderComponent } from './header/header.component';
import { CarComponent } from './car/car.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { MobileComponent } from './mobile/mobile.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';
import { MovieComponent } from './movie/movie.component';
import { MovieDetailsComponent } from './movie-details/movie-details.component';
import { LaptopComponent } from './laptop/laptop.component';
import { LaptopDetailsComponent } from './laptop-details/laptop-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    BikeComponent,
    BikeDetailsComponent,
    HeaderComponent,
    CarComponent,
    CarDetailsComponent,
    MobileComponent,
    MobileDetailsComponent,
    MovieComponent,
    MovieDetailsComponent,
    LaptopComponent,
    LaptopDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
