import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { LearnBean } from '../learn-page/learn-page.component';

@Injectable({
  providedIn: 'root'
})
export class LearnService {

  constructor(
    private http:HttpClient
  ) { }

  executeLearnService(){
    return this.http.get<LearnBean>('http://localhost:8080/word');
  }
}
