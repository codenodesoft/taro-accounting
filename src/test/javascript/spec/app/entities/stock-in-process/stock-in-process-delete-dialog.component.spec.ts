/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, inject, fakeAsync, tick } from '@angular/core/testing';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Observable, of } from 'rxjs';
import { JhiEventManager } from 'ng-jhipster';

import { SoptorshiTestModule } from '../../../test.module';
import { StockInProcessDeleteDialogComponent } from 'app/entities/stock-in-process/stock-in-process-delete-dialog.component';
import { StockInProcessService } from 'app/entities/stock-in-process/stock-in-process.service';

describe('Component Tests', () => {
    describe('StockInProcess Management Delete Component', () => {
        let comp: StockInProcessDeleteDialogComponent;
        let fixture: ComponentFixture<StockInProcessDeleteDialogComponent>;
        let service: StockInProcessService;
        let mockEventManager: any;
        let mockActiveModal: any;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [SoptorshiTestModule],
                declarations: [StockInProcessDeleteDialogComponent]
            })
                .overrideTemplate(StockInProcessDeleteDialogComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(StockInProcessDeleteDialogComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(StockInProcessService);
            mockEventManager = fixture.debugElement.injector.get(JhiEventManager);
            mockActiveModal = fixture.debugElement.injector.get(NgbActiveModal);
        });

        describe('confirmDelete', () => {
            it('Should call delete service on confirmDelete', inject(
                [],
                fakeAsync(() => {
                    // GIVEN
                    spyOn(service, 'delete').and.returnValue(of({}));

                    // WHEN
                    comp.confirmDelete(123);
                    tick();

                    // THEN
                    expect(service.delete).toHaveBeenCalledWith(123);
                    expect(mockActiveModal.dismissSpy).toHaveBeenCalled();
                    expect(mockEventManager.broadcastSpy).toHaveBeenCalled();
                })
            ));
        });
    });
});