import { Component, OnInit } from '@angular/core';

export class FortuneBean {
  constructor (
    public question: string,
    public answer: string) {

    }
}

@Component({
  selector: 'app-fortune-page',
  templateUrl: './fortune-page.component.html',
  styleUrls: ['./fortune-page.component.css']
})
export class FortunePageComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
