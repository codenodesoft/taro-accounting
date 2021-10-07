/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, inject, fakeAsync, tick } from '@angular/core/testing';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Observable, of } from 'rxjs';
import { JhiEventManager } from 'ng-jhipster';

import { SoptorshiTestModule } from '../../../test.module';
import { LeaveTypeDeleteDialogComponent } from 'app/entities/leave-type/leave-type-delete-dialog.component';
import { LeaveTypeService } from 'app/entities/leave-type/leave-type.service';

describe('Component Tests', () => {
    describe('LeaveType Management Delete Component', () => {
        let comp: LeaveTypeDeleteDialogComponent;
        let fixture: ComponentFixture<LeaveTypeDeleteDialogComponent>;
        let service: LeaveTypeService;
        let mockEventManager: any;
        let mockActiveModal: any;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [SoptorshiTestModule],
                declarations: [LeaveTypeDeleteDialogComponent]
            })
                .overrideTemplate(LeaveTypeDeleteDialogComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(LeaveTypeDeleteDialogComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(LeaveTypeService);
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
