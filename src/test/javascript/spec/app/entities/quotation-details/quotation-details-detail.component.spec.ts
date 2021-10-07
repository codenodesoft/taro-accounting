/* tslint:disable max-line-length */
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { SoptorshiTestModule } from '../../../test.module';
import { QuotationDetailsDetailComponent } from 'app/entities/quotation-details/quotation-details-detail.component';
import { QuotationDetails } from 'app/shared/model/quotation-details.model';

describe('Component Tests', () => {
    describe('QuotationDetails Management Detail Component', () => {
        let comp: QuotationDetailsDetailComponent;
        let fixture: ComponentFixture<QuotationDetailsDetailComponent>;
        const route = ({ data: of({ quotationDetails: new QuotationDetails(123) }) } as any) as ActivatedRoute;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [SoptorshiTestModule],
                declarations: [QuotationDetailsDetailComponent],
                providers: [{ provide: ActivatedRoute, useValue: route }]
            })
                .overrideTemplate(QuotationDetailsDetailComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(QuotationDetailsDetailComponent);
            comp = fixture.componentInstance;
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
                // GIVEN

                // WHEN
                comp.ngOnInit();

                // THEN
                expect(comp.quotationDetails).toEqual(jasmine.objectContaining({ id: 123 }));
            });
        });
    });
});
