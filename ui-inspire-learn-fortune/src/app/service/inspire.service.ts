import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { InspireBean } from '../inspire-page/inspire-page.component';


@Injectable({
  providedIn: 'root'
})
export class InspireService {

  constructor(
    private http:HttpClient
  ) { }

  executeInspireService(){
    return this.http.get<InspireBean>('http://localhost:8080/quote');
}  
}
