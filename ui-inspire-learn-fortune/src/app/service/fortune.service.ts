import { Injectable } from '@angular/core';
import { FortuneBean } from '../fortune-page/fortune-page.component';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FortuneService {

  constructor(
    private http: HttpClient
  ) { }

  executeFortuneService(question: string) {
    return this.http.post('http://localhost:8080/magic', question);
  }

}