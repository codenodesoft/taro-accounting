import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SoptorshiSharedModule } from 'app/shared';
import {
    OfficeComponent,
    OfficeDetailComponent,
    OfficeUpdateComponent,
    OfficeDeletePopupComponent,
    OfficeDeleteDialogComponent,
    officeRoute,
    officePopupRoute
} from './';

const ENTITY_STATES = [...officeRoute, ...officePopupRoute];

@NgModule({
    imports: [SoptorshiSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [OfficeComponent, OfficeDetailComponent, OfficeUpdateComponent, OfficeDeleteDialogComponent, OfficeDeletePopupComponent],
    entryComponents: [OfficeComponent, OfficeUpdateComponent, OfficeDeleteDialogComponent, OfficeDeletePopupComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SoptorshiOfficeModule {}
