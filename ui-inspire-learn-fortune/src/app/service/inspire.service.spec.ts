import { TestBed } from '@angular/core/testing';

import { InspireService } from './inspire.service';

describe('InspireService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: InspireService = TestBed.get(InspireService);
    expect(service).toBeTruthy();
  });
});
