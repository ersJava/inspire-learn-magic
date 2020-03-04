import { Injectable } from '@angular/core';
import { FortuneBean } from '../fortune-page/fortune-page.component';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FortuneService {

  constructor(
    private http: HttpClient
  ) { }

  executeFortuneService(fortuneBean: FortuneBean) : Observable<FortuneBean> {
    return this.http.post<FortuneBean>('http://localhost:8080/magic', fortuneBean, {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    });
  }

}