(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[189],{

/***/ "./src/main/webapp/app/entities/requisition-voucher-relation/requisition-voucher-relation.module.ts":
/*!**********************************************************************************************************!*\
  !*** ./src/main/webapp/app/entities/requisition-voucher-relation/requisition-voucher-relation.module.ts ***!
  \**********************************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\r\nObject.defineProperty(exports, \"__esModule\", { value: true });\r\nvar tslib_1 = __webpack_require__(/*! tslib */ \"./node_modules/tslib/tslib.es6.js\");\r\nvar core_1 = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/fesm5/core.js\");\r\nvar router_1 = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/fesm5/router.js\");\r\nvar shared_1 = __webpack_require__(/*! app/shared */ \"./src/main/webapp/app/shared/index.ts\");\r\nvar _1 = __webpack_require__(/*! ./ */ \"./src/main/webapp/app/entities/requisition-voucher-relation/index.ts\");\r\nvar ENTITY_STATES = _1.requisitionVoucherRelationRoute.concat(_1.requisitionVoucherRelationPopupRoute);\r\nvar SoptorshiRequisitionVoucherRelationModule = /** @class */ (function () {\r\n    function SoptorshiRequisitionVoucherRelationModule() {\r\n    }\r\n    SoptorshiRequisitionVoucherRelationModule = tslib_1.__decorate([\r\n        core_1.NgModule({\r\n            imports: [shared_1.SoptorshiSharedModule, router_1.RouterModule.forChild(ENTITY_STATES)],\r\n            /* declarations: [\r\n                RequisitionVoucherRelationComponent,\r\n                RequisitionVoucherRelationDetailComponent,\r\n                RequisitionVoucherRelationUpdateComponent,\r\n                RequisitionVoucherRelationDeleteDialogComponent,\r\n                RequisitionVoucherRelationDeletePopupComponent\r\n            ],\r\n            entryComponents: [\r\n                RequisitionVoucherRelationComponent,\r\n                RequisitionVoucherRelationUpdateComponent,\r\n                RequisitionVoucherRelationDeleteDialogComponent,\r\n                RequisitionVoucherRelationDeletePopupComponent\r\n            ],*/\r\n            schemas: [core_1.CUSTOM_ELEMENTS_SCHEMA]\r\n        })\r\n    ], SoptorshiRequisitionVoucherRelationModule);\r\n    return SoptorshiRequisitionVoucherRelationModule;\r\n}());\r\nexports.SoptorshiRequisitionVoucherRelationModule = SoptorshiRequisitionVoucherRelationModule;\r\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL3JlcXVpc2l0aW9uLXZvdWNoZXItcmVsYXRpb24vcmVxdWlzaXRpb24tdm91Y2hlci1yZWxhdGlvbi5tb2R1bGUudHM/ZmUzNiJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiOzs7QUFBQSxvR0FBaUU7QUFDakUsNEdBQStDO0FBRS9DLDhGQUFtRDtBQUNuRCwrR0FRWTtBQUVaLElBQU0sYUFBYSxHQUFPLGtDQUErQixRQUFLLHVDQUFvQyxDQUFDLENBQUM7QUFtQnBHO0lBQUE7SUFBd0QsQ0FBQztJQUE1Qyx5Q0FBeUM7UUFqQnJELGVBQVEsQ0FBQztZQUNOLE9BQU8sRUFBRSxDQUFDLDhCQUFxQixFQUFFLHFCQUFZLENBQUMsUUFBUSxDQUFDLGFBQWEsQ0FBQyxDQUFDO1lBQ3RFOzs7Ozs7Ozs7Ozs7Z0JBWUk7WUFDSixPQUFPLEVBQUUsQ0FBQyw2QkFBc0IsQ0FBQztTQUNwQyxDQUFDO09BQ1cseUNBQXlDLENBQUc7SUFBRCxnREFBQztDQUFBO0FBQTVDLDhGQUF5QyIsImZpbGUiOiIuL3NyYy9tYWluL3dlYmFwcC9hcHAvZW50aXRpZXMvcmVxdWlzaXRpb24tdm91Y2hlci1yZWxhdGlvbi9yZXF1aXNpdGlvbi12b3VjaGVyLXJlbGF0aW9uLm1vZHVsZS50cy5qcyIsInNvdXJjZXNDb250ZW50IjpbImltcG9ydCB7IE5nTW9kdWxlLCBDVVNUT01fRUxFTUVOVFNfU0NIRU1BIH0gZnJvbSAnQGFuZ3VsYXIvY29yZSc7XHJcbmltcG9ydCB7IFJvdXRlck1vZHVsZSB9IGZyb20gJ0Bhbmd1bGFyL3JvdXRlcic7XHJcblxyXG5pbXBvcnQgeyBTb3B0b3JzaGlTaGFyZWRNb2R1bGUgfSBmcm9tICdhcHAvc2hhcmVkJztcclxuaW1wb3J0IHtcclxuICAgIFJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uQ29tcG9uZW50LFxyXG4gICAgUmVxdWlzaXRpb25Wb3VjaGVyUmVsYXRpb25EZXRhaWxDb21wb25lbnQsXHJcbiAgICBSZXF1aXNpdGlvblZvdWNoZXJSZWxhdGlvblVwZGF0ZUNvbXBvbmVudCxcclxuICAgIFJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uRGVsZXRlUG9wdXBDb21wb25lbnQsXHJcbiAgICBSZXF1aXNpdGlvblZvdWNoZXJSZWxhdGlvbkRlbGV0ZURpYWxvZ0NvbXBvbmVudCxcclxuICAgIHJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uUm91dGUsXHJcbiAgICByZXF1aXNpdGlvblZvdWNoZXJSZWxhdGlvblBvcHVwUm91dGVcclxufSBmcm9tICcuLyc7XHJcblxyXG5jb25zdCBFTlRJVFlfU1RBVEVTID0gWy4uLnJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uUm91dGUsIC4uLnJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uUG9wdXBSb3V0ZV07XHJcblxyXG5ATmdNb2R1bGUoe1xyXG4gICAgaW1wb3J0czogW1NvcHRvcnNoaVNoYXJlZE1vZHVsZSwgUm91dGVyTW9kdWxlLmZvckNoaWxkKEVOVElUWV9TVEFURVMpXSxcclxuICAgIC8qIGRlY2xhcmF0aW9uczogW1xyXG4gICAgICAgIFJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uQ29tcG9uZW50LFxyXG4gICAgICAgIFJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uRGV0YWlsQ29tcG9uZW50LFxyXG4gICAgICAgIFJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uVXBkYXRlQ29tcG9uZW50LFxyXG4gICAgICAgIFJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uRGVsZXRlRGlhbG9nQ29tcG9uZW50LFxyXG4gICAgICAgIFJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uRGVsZXRlUG9wdXBDb21wb25lbnRcclxuICAgIF0sXHJcbiAgICBlbnRyeUNvbXBvbmVudHM6IFtcclxuICAgICAgICBSZXF1aXNpdGlvblZvdWNoZXJSZWxhdGlvbkNvbXBvbmVudCxcclxuICAgICAgICBSZXF1aXNpdGlvblZvdWNoZXJSZWxhdGlvblVwZGF0ZUNvbXBvbmVudCxcclxuICAgICAgICBSZXF1aXNpdGlvblZvdWNoZXJSZWxhdGlvbkRlbGV0ZURpYWxvZ0NvbXBvbmVudCxcclxuICAgICAgICBSZXF1aXNpdGlvblZvdWNoZXJSZWxhdGlvbkRlbGV0ZVBvcHVwQ29tcG9uZW50XHJcbiAgICBdLCovXHJcbiAgICBzY2hlbWFzOiBbQ1VTVE9NX0VMRU1FTlRTX1NDSEVNQV1cclxufSlcclxuZXhwb3J0IGNsYXNzIFNvcHRvcnNoaVJlcXVpc2l0aW9uVm91Y2hlclJlbGF0aW9uTW9kdWxlIHt9XHJcbiJdLCJzb3VyY2VSb290IjoiIn0=\n//# sourceURL=webpack-internal:///./src/main/webapp/app/entities/requisition-voucher-relation/requisition-voucher-relation.module.ts\n");

/***/ })

}]);