/* tslint:disable max-line-length */
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { SoptorshiTestModule } from '../../../test.module';
import { HolidayTypeDetailComponent } from 'app/entities/holiday-type/holiday-type-detail.component';
import { HolidayType } from 'app/shared/model/holiday-type.model';

describe('Component Tests', () => {
    describe('HolidayType Management Detail Component', () => {
        let comp: HolidayTypeDetailComponent;
        let fixture: ComponentFixture<HolidayTypeDetailComponent>;
        const route = ({ data: of({ holidayType: new HolidayType(123) }) } as any) as ActivatedRoute;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [SoptorshiTestModule],
                declarations: [HolidayTypeDetailComponent],
                providers: [{ provide: ActivatedRoute, useValue: route }]
            })
                .overrideTemplate(HolidayTypeDetailComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(HolidayTypeDetailComponent);
            comp = fixture.componentInstance;
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
                // GIVEN

                // WHEN
                comp.ngOnInit();

                // THEN
                expect(comp.holidayType).toEqual(jasmine.objectContaining({ id: 123 }));
            });
        });
    });
});
