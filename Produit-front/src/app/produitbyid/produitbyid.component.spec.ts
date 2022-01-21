import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProduitbyidComponent } from './produitbyid.component';

describe('ProduitbyidComponent', () => {
  let component: ProduitbyidComponent;
  let fixture: ComponentFixture<ProduitbyidComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProduitbyidComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProduitbyidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
