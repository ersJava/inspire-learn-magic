import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { FortunePageComponent } from './fortune-page/fortune-page.component';
import { InspirePageComponent } from './inspire-page/inspire-page.component';
import { LearnPageComponent } from './learn-page/learn-page.component';


const routes: Routes = [
  { path: '', component: HomePageComponent},
  { path: 'fortune', component: FortunePageComponent},
  { path: 'learn', component: LearnPageComponent},
  { path: 'inspire', component: InspirePageComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
