import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FortunePageComponent } from './fortune-page.component';

describe('FortunePageComponent', () => {
  let component: FortunePageComponent;
  let fixture: ComponentFixture<FortunePageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FortunePageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FortunePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
