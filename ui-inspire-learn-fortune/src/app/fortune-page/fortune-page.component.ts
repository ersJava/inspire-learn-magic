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

  responseWithQuestion: FortuneBean


  constructor(private route: ActivatedRoute,
    private service: FortuneService) { }

  ngOnInit() {
   
  }

  // getResponseFromCrystalBall() {
  //   this.service.executeFortuneService(this.responseWithQuestion.question).subscribe(     
  //     response => this.handleSuccessfulResponse(response)
  //   );
  //   console.log("is this logging")
  // }

  // handleSuccessfulResponse(response){
  //  this.responseWithQuestion= response
  // }

  getResponseFromCrystalBall() {
    this.service.executeFortuneService(this.responseWithQuestion)
    .subscribe(
      (data: FortuneBean) => {
        console.log(data)
      }
    )
  }

}
