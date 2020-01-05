import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class InspireBean {
  constructor(public quote: string) {
    
  }
}

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
