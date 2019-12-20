import { TestBed } from '@angular/core/testing';

import { InspireServiceService } from './inspire-service.service';

describe('InspireServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: InspireServiceService = TestBed.get(InspireServiceService);
    expect(service).toBeTruthy();
  });
});
