(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[175],{

/***/ "./src/main/webapp/app/entities/payment-voucher/payment-voucher.module.ts":
/*!********************************************************************************!*\
  !*** ./src/main/webapp/app/entities/payment-voucher/payment-voucher.module.ts ***!
  \********************************************************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\r\nObject.defineProperty(exports, \"__esModule\", { value: true });\r\nvar tslib_1 = __webpack_require__(/*! tslib */ \"./node_modules/tslib/tslib.es6.js\");\r\nvar core_1 = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/fesm5/core.js\");\r\nvar router_1 = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/fesm5/router.js\");\r\nvar shared_1 = __webpack_require__(/*! app/shared */ \"./src/main/webapp/app/shared/index.ts\");\r\nvar _1 = __webpack_require__(/*! ./ */ \"./src/main/webapp/app/entities/payment-voucher/index.ts\");\r\nvar ENTITY_STATES = _1.paymentVoucherRoute.concat(_1.paymentVoucherPopupRoute);\r\nvar SoptorshiPaymentVoucherModule = /** @class */ (function () {\r\n    function SoptorshiPaymentVoucherModule() {\r\n    }\r\n    SoptorshiPaymentVoucherModule = tslib_1.__decorate([\r\n        core_1.NgModule({\r\n            imports: [shared_1.SoptorshiSharedModule, router_1.RouterModule.forChild(ENTITY_STATES)],\r\n            /*declarations: [\r\n                PaymentVoucherComponent,\r\n                PaymentVoucherDetailComponent,\r\n                PaymentVoucherUpdateComponent,\r\n                PaymentVoucherDeleteDialogComponent,\r\n                PaymentVoucherDeletePopupComponent\r\n            ],\r\n            entryComponents: [\r\n                PaymentVoucherComponent,\r\n                PaymentVoucherUpdateComponent,\r\n                PaymentVoucherDeleteDialogComponent,\r\n                PaymentVoucherDeletePopupComponent\r\n            ],*/\r\n            schemas: [core_1.CUSTOM_ELEMENTS_SCHEMA]\r\n        })\r\n    ], SoptorshiPaymentVoucherModule);\r\n    return SoptorshiPaymentVoucherModule;\r\n}());\r\nexports.SoptorshiPaymentVoucherModule = SoptorshiPaymentVoucherModule;\r\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL3BheW1lbnQtdm91Y2hlci9wYXltZW50LXZvdWNoZXIubW9kdWxlLnRzP2M4MWIiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6Ijs7O0FBQUEsb0dBQWlFO0FBQ2pFLDRHQUErQztBQUUvQyw4RkFBbUQ7QUFDbkQsa0dBUVk7QUFFWixJQUFNLGFBQWEsR0FBTyxzQkFBbUIsUUFBSywyQkFBd0IsQ0FBQyxDQUFDO0FBbUI1RTtJQUFBO0lBQTRDLENBQUM7SUFBaEMsNkJBQTZCO1FBakJ6QyxlQUFRLENBQUM7WUFDTixPQUFPLEVBQUUsQ0FBQyw4QkFBcUIsRUFBRSxxQkFBWSxDQUFDLFFBQVEsQ0FBQyxhQUFhLENBQUMsQ0FBQztZQUN0RTs7Ozs7Ozs7Ozs7O2dCQVlJO1lBQ0osT0FBTyxFQUFFLENBQUMsNkJBQXNCLENBQUM7U0FDcEMsQ0FBQztPQUNXLDZCQUE2QixDQUFHO0lBQUQsb0NBQUM7Q0FBQTtBQUFoQyxzRUFBNkIiLCJmaWxlIjoiLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL3BheW1lbnQtdm91Y2hlci9wYXltZW50LXZvdWNoZXIubW9kdWxlLnRzLmpzIiwic291cmNlc0NvbnRlbnQiOlsiaW1wb3J0IHsgTmdNb2R1bGUsIENVU1RPTV9FTEVNRU5UU19TQ0hFTUEgfSBmcm9tICdAYW5ndWxhci9jb3JlJztcclxuaW1wb3J0IHsgUm91dGVyTW9kdWxlIH0gZnJvbSAnQGFuZ3VsYXIvcm91dGVyJztcclxuXHJcbmltcG9ydCB7IFNvcHRvcnNoaVNoYXJlZE1vZHVsZSB9IGZyb20gJ2FwcC9zaGFyZWQnO1xyXG5pbXBvcnQge1xyXG4gICAgUGF5bWVudFZvdWNoZXJDb21wb25lbnQsXHJcbiAgICBQYXltZW50Vm91Y2hlckRldGFpbENvbXBvbmVudCxcclxuICAgIFBheW1lbnRWb3VjaGVyVXBkYXRlQ29tcG9uZW50LFxyXG4gICAgUGF5bWVudFZvdWNoZXJEZWxldGVQb3B1cENvbXBvbmVudCxcclxuICAgIFBheW1lbnRWb3VjaGVyRGVsZXRlRGlhbG9nQ29tcG9uZW50LFxyXG4gICAgcGF5bWVudFZvdWNoZXJSb3V0ZSxcclxuICAgIHBheW1lbnRWb3VjaGVyUG9wdXBSb3V0ZVxyXG59IGZyb20gJy4vJztcclxuXHJcbmNvbnN0IEVOVElUWV9TVEFURVMgPSBbLi4ucGF5bWVudFZvdWNoZXJSb3V0ZSwgLi4ucGF5bWVudFZvdWNoZXJQb3B1cFJvdXRlXTtcclxuXHJcbkBOZ01vZHVsZSh7XHJcbiAgICBpbXBvcnRzOiBbU29wdG9yc2hpU2hhcmVkTW9kdWxlLCBSb3V0ZXJNb2R1bGUuZm9yQ2hpbGQoRU5USVRZX1NUQVRFUyldLFxyXG4gICAgLypkZWNsYXJhdGlvbnM6IFtcclxuICAgICAgICBQYXltZW50Vm91Y2hlckNvbXBvbmVudCxcclxuICAgICAgICBQYXltZW50Vm91Y2hlckRldGFpbENvbXBvbmVudCxcclxuICAgICAgICBQYXltZW50Vm91Y2hlclVwZGF0ZUNvbXBvbmVudCxcclxuICAgICAgICBQYXltZW50Vm91Y2hlckRlbGV0ZURpYWxvZ0NvbXBvbmVudCxcclxuICAgICAgICBQYXltZW50Vm91Y2hlckRlbGV0ZVBvcHVwQ29tcG9uZW50XHJcbiAgICBdLFxyXG4gICAgZW50cnlDb21wb25lbnRzOiBbXHJcbiAgICAgICAgUGF5bWVudFZvdWNoZXJDb21wb25lbnQsXHJcbiAgICAgICAgUGF5bWVudFZvdWNoZXJVcGRhdGVDb21wb25lbnQsXHJcbiAgICAgICAgUGF5bWVudFZvdWNoZXJEZWxldGVEaWFsb2dDb21wb25lbnQsXHJcbiAgICAgICAgUGF5bWVudFZvdWNoZXJEZWxldGVQb3B1cENvbXBvbmVudFxyXG4gICAgXSwqL1xyXG4gICAgc2NoZW1hczogW0NVU1RPTV9FTEVNRU5UU19TQ0hFTUFdXHJcbn0pXHJcbmV4cG9ydCBjbGFzcyBTb3B0b3JzaGlQYXltZW50Vm91Y2hlck1vZHVsZSB7fVxyXG4iXSwic291cmNlUm9vdCI6IiJ9\n//# sourceURL=webpack-internal:///./src/main/webapp/app/entities/payment-voucher/payment-voucher.module.ts\n");

/***/ })

}]);