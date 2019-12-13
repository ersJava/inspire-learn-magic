import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FlexLayoutModule } from '@angular/flex-layout';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MaterialModule } from './material.module';
import { HomePageComponent } from './home-page/home-page.component';
import { InspirePageComponent } from './inspire-page/inspire-page.component';
import { FortunePageComponent } from './fortune-page/fortune-page.component';
import { LearnPageComponent } from './learn-page/learn-page.component';


@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    InspirePageComponent,
    FortunePageComponent,
    LearnPageComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    FlexLayoutModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
