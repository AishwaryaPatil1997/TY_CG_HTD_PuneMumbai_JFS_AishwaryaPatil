import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { BikeComponent } from './bike/bike.component';
import { CarComponent } from './car/car.component';
import { LaptopComponent } from './laptop/laptop.component';
import { MobileComponent } from './mobile/mobile.component';
import { MovieComponent } from './movie/movie.component';


const routes: Routes = [
  { path: '', component: HomeComponent},
  { path: 'bike', component: BikeComponent},
  { path: 'car', component: CarComponent},
  { path: 'laptop', component: LaptopComponent},
  { path: 'mobile', component: MobileComponent},
  { path: 'movie', component: MovieComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
