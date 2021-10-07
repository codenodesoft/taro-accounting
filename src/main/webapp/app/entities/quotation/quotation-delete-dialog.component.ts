import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { NgbActiveModal, NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IQuotation } from 'app/shared/model/quotation.model';
import { QuotationService } from './quotation.service';

@Component({
    selector: 'jhi-quotation-delete-dialog',
    templateUrl: './quotation-delete-dialog.component.html'
})
export class QuotationDeleteDialogComponent {
    quotation: IQuotation;

    constructor(
        protected quotationService: QuotationService,
        public activeModal: NgbActiveModal,
        protected eventManager: JhiEventManager
    ) {}

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.quotationService.delete(id).subscribe(response => {
            this.eventManager.broadcast({
                name: 'quotationListModification',
                content: 'Deleted an quotation'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-quotation-delete-popup',
    template: ''
})
export class QuotationDeletePopupComponent implements OnInit, OnDestroy {
    protected ngbModalRef: NgbModalRef;

    constructor(protected activatedRoute: ActivatedRoute, protected router: Router, protected modalService: NgbModal) {}

    ngOnInit() {
        this.activatedRoute.data.subscribe(({ quotation }) => {
            setTimeout(() => {
                this.ngbModalRef = this.modalService.open(QuotationDeleteDialogComponent as Component, { size: 'lg', backdrop: 'static' });
                this.ngbModalRef.componentInstance.quotation = quotation;
                this.ngbModalRef.result.then(
                    result => {
                        this.router.navigate(['/quotation', { outlets: { popup: null } }]);
                        this.ngbModalRef = null;
                    },
                    reason => {
                        this.router.navigate(['/quotation', { outlets: { popup: null } }]);
                        this.ngbModalRef = null;
                    }
                );
            }, 0);
        });
    }

    ngOnDestroy() {
        this.ngbModalRef = null;
    }
}
