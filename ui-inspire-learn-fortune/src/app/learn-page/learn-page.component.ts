import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { LearnService } from '../service/learn.service';

export class LearnBean {
  constructor(
    public word: string,
    public definition: string) {
  }
}

@Component({
  selector: 'app-learn-page',
  templateUrl: './learn-page.component.html',
  styleUrls: ['./learn-page.component.css']
})
export class LearnPageComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
