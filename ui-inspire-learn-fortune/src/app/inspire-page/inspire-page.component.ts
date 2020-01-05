import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { InspireService } from '../service/inspire.service';

export class InspireBean {
  constructor(
    public quote: string, 
    public author: string) {
  }
}

@Component({
  selector: 'app-inspire-page',
  templateUrl: './inspire-page.component.html',
  styleUrls: ['./inspire-page.component.css']
})
export class InspirePageComponent implements OnInit {

  quoteFromService: InspireBean[]

  constructor(private route: ActivatedRoute,
    private service: InspireService) { }

  ngOnInit() {
  }

  getInspirationalQuote() {
    this.service.executeInspireService().subscribe(
      response => this.handleSuccessfulResponse(response)
    );
  }

  handleSuccessfulResponse(response){
   this.quoteFromService = response
  }

}
