(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[96],{

/***/ "./src/main/webapp/app/entities/requisition/requisition.module.ts":
/*!************************************************************************!*\
  !*** ./src/main/webapp/app/entities/requisition/requisition.module.ts ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\r\nObject.defineProperty(exports, \"__esModule\", { value: true });\r\nvar tslib_1 = __webpack_require__(/*! tslib */ \"./node_modules/tslib/tslib.es6.js\");\r\nvar core_1 = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/fesm5/core.js\");\r\nvar router_1 = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/fesm5/router.js\");\r\nvar shared_1 = __webpack_require__(/*! app/shared */ \"./src/main/webapp/app/shared/index.ts\");\r\nvar _1 = __webpack_require__(/*! ./ */ \"./src/main/webapp/app/entities/requisition/index.ts\");\r\nvar ENTITY_STATES = _1.requisitionRoute.concat(_1.requisitionPopupRoute);\r\nvar SoptorshiRequisitionModule = /** @class */ (function () {\r\n    function SoptorshiRequisitionModule() {\r\n    }\r\n    SoptorshiRequisitionModule = tslib_1.__decorate([\r\n        core_1.NgModule({\r\n            imports: [shared_1.SoptorshiSharedModule, router_1.RouterModule.forChild(ENTITY_STATES)],\r\n            /*    declarations: [\r\n                RequisitionComponent,\r\n                RequisitionDetailComponent,\r\n                RequisitionUpdateComponent,\r\n                RequisitionDeleteDialogComponent,\r\n                RequisitionDeletePopupComponent\r\n            ],\r\n            entryComponents: [RequisitionComponent, RequisitionUpdateComponent, RequisitionDeleteDialogComponent, RequisitionDeletePopupComponent],*/\r\n            schemas: [core_1.CUSTOM_ELEMENTS_SCHEMA]\r\n        })\r\n    ], SoptorshiRequisitionModule);\r\n    return SoptorshiRequisitionModule;\r\n}());\r\nexports.SoptorshiRequisitionModule = SoptorshiRequisitionModule;\r\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL3JlcXVpc2l0aW9uL3JlcXVpc2l0aW9uLm1vZHVsZS50cz8yMzgyIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiI7OztBQUFBLG9HQUFpRTtBQUNqRSw0R0FBK0M7QUFFL0MsOEZBQW1EO0FBQ25ELDhGQVFZO0FBRVosSUFBTSxhQUFhLEdBQU8sbUJBQWdCLFFBQUssd0JBQXFCLENBQUMsQ0FBQztBQWN0RTtJQUFBO0lBQXlDLENBQUM7SUFBN0IsMEJBQTBCO1FBWnRDLGVBQVEsQ0FBQztZQUNOLE9BQU8sRUFBRSxDQUFDLDhCQUFxQixFQUFFLHFCQUFZLENBQUMsUUFBUSxDQUFDLGFBQWEsQ0FBQyxDQUFDO1lBQ3RFOzs7Ozs7O3FKQU95STtZQUN6SSxPQUFPLEVBQUUsQ0FBQyw2QkFBc0IsQ0FBQztTQUNwQyxDQUFDO09BQ1csMEJBQTBCLENBQUc7SUFBRCxpQ0FBQztDQUFBO0FBQTdCLGdFQUEwQiIsImZpbGUiOiIuL3NyYy9tYWluL3dlYmFwcC9hcHAvZW50aXRpZXMvcmVxdWlzaXRpb24vcmVxdWlzaXRpb24ubW9kdWxlLnRzLmpzIiwic291cmNlc0NvbnRlbnQiOlsiaW1wb3J0IHsgTmdNb2R1bGUsIENVU1RPTV9FTEVNRU5UU19TQ0hFTUEgfSBmcm9tICdAYW5ndWxhci9jb3JlJztcclxuaW1wb3J0IHsgUm91dGVyTW9kdWxlIH0gZnJvbSAnQGFuZ3VsYXIvcm91dGVyJztcclxuXHJcbmltcG9ydCB7IFNvcHRvcnNoaVNoYXJlZE1vZHVsZSB9IGZyb20gJ2FwcC9zaGFyZWQnO1xyXG5pbXBvcnQge1xyXG4gICAgUmVxdWlzaXRpb25Db21wb25lbnQsXHJcbiAgICBSZXF1aXNpdGlvbkRldGFpbENvbXBvbmVudCxcclxuICAgIFJlcXVpc2l0aW9uVXBkYXRlQ29tcG9uZW50LFxyXG4gICAgUmVxdWlzaXRpb25EZWxldGVQb3B1cENvbXBvbmVudCxcclxuICAgIFJlcXVpc2l0aW9uRGVsZXRlRGlhbG9nQ29tcG9uZW50LFxyXG4gICAgcmVxdWlzaXRpb25Sb3V0ZSxcclxuICAgIHJlcXVpc2l0aW9uUG9wdXBSb3V0ZVxyXG59IGZyb20gJy4vJztcclxuXHJcbmNvbnN0IEVOVElUWV9TVEFURVMgPSBbLi4ucmVxdWlzaXRpb25Sb3V0ZSwgLi4ucmVxdWlzaXRpb25Qb3B1cFJvdXRlXTtcclxuXHJcbkBOZ01vZHVsZSh7XHJcbiAgICBpbXBvcnRzOiBbU29wdG9yc2hpU2hhcmVkTW9kdWxlLCBSb3V0ZXJNb2R1bGUuZm9yQ2hpbGQoRU5USVRZX1NUQVRFUyldLFxyXG4gICAgLyogICAgZGVjbGFyYXRpb25zOiBbXHJcbiAgICAgICAgUmVxdWlzaXRpb25Db21wb25lbnQsXHJcbiAgICAgICAgUmVxdWlzaXRpb25EZXRhaWxDb21wb25lbnQsXHJcbiAgICAgICAgUmVxdWlzaXRpb25VcGRhdGVDb21wb25lbnQsXHJcbiAgICAgICAgUmVxdWlzaXRpb25EZWxldGVEaWFsb2dDb21wb25lbnQsXHJcbiAgICAgICAgUmVxdWlzaXRpb25EZWxldGVQb3B1cENvbXBvbmVudFxyXG4gICAgXSxcclxuICAgIGVudHJ5Q29tcG9uZW50czogW1JlcXVpc2l0aW9uQ29tcG9uZW50LCBSZXF1aXNpdGlvblVwZGF0ZUNvbXBvbmVudCwgUmVxdWlzaXRpb25EZWxldGVEaWFsb2dDb21wb25lbnQsIFJlcXVpc2l0aW9uRGVsZXRlUG9wdXBDb21wb25lbnRdLCovXHJcbiAgICBzY2hlbWFzOiBbQ1VTVE9NX0VMRU1FTlRTX1NDSEVNQV1cclxufSlcclxuZXhwb3J0IGNsYXNzIFNvcHRvcnNoaVJlcXVpc2l0aW9uTW9kdWxlIHt9XHJcbiJdLCJzb3VyY2VSb290IjoiIn0=\n//# sourceURL=webpack-internal:///./src/main/webapp/app/entities/requisition/requisition.module.ts\n");

/***/ })

}]);