import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditConsignmentComponent } from './edit-consignment.component';

describe('EditConsignmentComponent', () => {
  let component: EditConsignmentComponent;
  let fixture: ComponentFixture<EditConsignmentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditConsignmentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditConsignmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
