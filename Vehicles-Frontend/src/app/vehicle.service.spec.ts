import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing'
import { VehicleService } from './vehicle.service';

describe('VehicleService Component:', () => {

  beforeEach(async () => {
    TestBed.configureTestingModule({
		declarations: [VehicleService],
		imports: [
			HttpClientTestingModule
		],
	});
  });

  it('should be created', () => {
    expect(VehicleService).toBeTruthy();
  });
});
