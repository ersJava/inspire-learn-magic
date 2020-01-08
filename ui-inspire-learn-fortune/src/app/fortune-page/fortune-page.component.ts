import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FortuneService } from '../service/fortune.service';

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

  question: string

  responseWithQuestion: FortuneBean[]

  constructor(private route: ActivatedRoute,
    private service: FortuneService) { }

  ngOnInit() {

    this.question = this.route.snapshot.params['question'];
  }

  getResponseFromCrystalBall() {
    this.service.executeFortuneService(this.question).subscribe(     
      response => this.handleSuccessfulResponse(response)
    );
  }

  handleSuccessfulResponse(response){
   this.responseWithQuestion= response
  }

}
