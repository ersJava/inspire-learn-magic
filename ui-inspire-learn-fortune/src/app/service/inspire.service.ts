import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

// export class InspireBean {
//   constructor(public message:string) {

//   }
// }

@Injectable({
  providedIn: 'root'
})
export class InspireService {

  constructor(
    private http:HttpClient
  ) { }

  executeInspireService(){
    return this.http.get('http://localhost:8080/quote');
    console.log("execute inspire service")
}  
  
}
