import { ComponentFixture, TestBed } from '@angular/core/testing';
import { DoctorService } from '../doctor.service';

import { DoctorListComponent } from './doctor-list.component';

describe('DoctorListComponent', () => {
  let component: DoctorListComponent;
  let fixture: ComponentFixture<DoctorListComponent>;
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DoctorListComponent],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctorListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });
});
