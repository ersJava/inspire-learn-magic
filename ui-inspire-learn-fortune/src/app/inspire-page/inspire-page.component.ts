import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { InspireService } from '../service/inspire.service';


@Component({
  selector: 'app-inspire-page',
  templateUrl: './inspire-page.component.html',
  styleUrls: ['./inspire-page.component.css']
})
export class InspirePageComponent implements OnInit {

  constructor(private route: ActivatedRoute) { }

  ngOnInit() {
  }

}
