(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[56],{

/***/ "./src/main/webapp/app/entities/supply-area-manager/supply-area-manager.module.ts":
/*!****************************************************************************************!*\
  !*** ./src/main/webapp/app/entities/supply-area-manager/supply-area-manager.module.ts ***!
  \****************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\r\nObject.defineProperty(exports, \"__esModule\", { value: true });\r\nvar tslib_1 = __webpack_require__(/*! tslib */ \"./node_modules/tslib/tslib.es6.js\");\r\nvar core_1 = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/fesm5/core.js\");\r\nvar router_1 = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/fesm5/router.js\");\r\nvar shared_1 = __webpack_require__(/*! app/shared */ \"./src/main/webapp/app/shared/index.ts\");\r\nvar _1 = __webpack_require__(/*! ./ */ \"./src/main/webapp/app/entities/supply-area-manager/index.ts\");\r\nvar ENTITY_STATES = _1.supplyAreaManagerRoute.concat(_1.supplyAreaManagerPopupRoute);\r\nvar SoptorshiSupplyAreaManagerModule = /** @class */ (function () {\r\n    function SoptorshiSupplyAreaManagerModule() {\r\n    }\r\n    SoptorshiSupplyAreaManagerModule = tslib_1.__decorate([\r\n        core_1.NgModule({\r\n            imports: [shared_1.SoptorshiSharedModule, router_1.RouterModule.forChild(ENTITY_STATES)],\r\n            declarations: [\r\n                _1.SupplyAreaManagerComponent,\r\n                _1.SupplyAreaManagerDetailComponent,\r\n                _1.SupplyAreaManagerUpdateComponent,\r\n                _1.SupplyAreaManagerDeleteDialogComponent,\r\n                _1.SupplyAreaManagerDeletePopupComponent\r\n            ],\r\n            entryComponents: [\r\n                _1.SupplyAreaManagerComponent,\r\n                _1.SupplyAreaManagerUpdateComponent,\r\n                _1.SupplyAreaManagerDeleteDialogComponent,\r\n                _1.SupplyAreaManagerDeletePopupComponent\r\n            ],\r\n            schemas: [core_1.CUSTOM_ELEMENTS_SCHEMA]\r\n        })\r\n    ], SoptorshiSupplyAreaManagerModule);\r\n    return SoptorshiSupplyAreaManagerModule;\r\n}());\r\nexports.SoptorshiSupplyAreaManagerModule = SoptorshiSupplyAreaManagerModule;\r\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL3N1cHBseS1hcmVhLW1hbmFnZXIvc3VwcGx5LWFyZWEtbWFuYWdlci5tb2R1bGUudHM/ZTQyNyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiOzs7QUFBQSxvR0FBaUU7QUFDakUsNEdBQStDO0FBRS9DLDhGQUFtRDtBQUNuRCxzR0FRWTtBQUVaLElBQU0sYUFBYSxHQUFPLHlCQUFzQixRQUFLLDhCQUEyQixDQUFDLENBQUM7QUFtQmxGO0lBQUE7SUFBK0MsQ0FBQztJQUFuQyxnQ0FBZ0M7UUFqQjVDLGVBQVEsQ0FBQztZQUNOLE9BQU8sRUFBRSxDQUFDLDhCQUFxQixFQUFFLHFCQUFZLENBQUMsUUFBUSxDQUFDLGFBQWEsQ0FBQyxDQUFDO1lBQ3RFLFlBQVksRUFBRTtnQkFDViw2QkFBMEI7Z0JBQzFCLG1DQUFnQztnQkFDaEMsbUNBQWdDO2dCQUNoQyx5Q0FBc0M7Z0JBQ3RDLHdDQUFxQzthQUN4QztZQUNELGVBQWUsRUFBRTtnQkFDYiw2QkFBMEI7Z0JBQzFCLG1DQUFnQztnQkFDaEMseUNBQXNDO2dCQUN0Qyx3Q0FBcUM7YUFDeEM7WUFDRCxPQUFPLEVBQUUsQ0FBQyw2QkFBc0IsQ0FBQztTQUNwQyxDQUFDO09BQ1csZ0NBQWdDLENBQUc7SUFBRCx1Q0FBQztDQUFBO0FBQW5DLDRFQUFnQyIsImZpbGUiOiIuL3NyYy9tYWluL3dlYmFwcC9hcHAvZW50aXRpZXMvc3VwcGx5LWFyZWEtbWFuYWdlci9zdXBwbHktYXJlYS1tYW5hZ2VyLm1vZHVsZS50cy5qcyIsInNvdXJjZXNDb250ZW50IjpbImltcG9ydCB7IENVU1RPTV9FTEVNRU5UU19TQ0hFTUEsIE5nTW9kdWxlIH0gZnJvbSAnQGFuZ3VsYXIvY29yZSc7XHJcbmltcG9ydCB7IFJvdXRlck1vZHVsZSB9IGZyb20gJ0Bhbmd1bGFyL3JvdXRlcic7XHJcblxyXG5pbXBvcnQgeyBTb3B0b3JzaGlTaGFyZWRNb2R1bGUgfSBmcm9tICdhcHAvc2hhcmVkJztcclxuaW1wb3J0IHtcclxuICAgIFN1cHBseUFyZWFNYW5hZ2VyQ29tcG9uZW50LFxyXG4gICAgU3VwcGx5QXJlYU1hbmFnZXJEZWxldGVEaWFsb2dDb21wb25lbnQsXHJcbiAgICBTdXBwbHlBcmVhTWFuYWdlckRlbGV0ZVBvcHVwQ29tcG9uZW50LFxyXG4gICAgU3VwcGx5QXJlYU1hbmFnZXJEZXRhaWxDb21wb25lbnQsXHJcbiAgICBzdXBwbHlBcmVhTWFuYWdlclBvcHVwUm91dGUsXHJcbiAgICBzdXBwbHlBcmVhTWFuYWdlclJvdXRlLFxyXG4gICAgU3VwcGx5QXJlYU1hbmFnZXJVcGRhdGVDb21wb25lbnRcclxufSBmcm9tICcuLyc7XHJcblxyXG5jb25zdCBFTlRJVFlfU1RBVEVTID0gWy4uLnN1cHBseUFyZWFNYW5hZ2VyUm91dGUsIC4uLnN1cHBseUFyZWFNYW5hZ2VyUG9wdXBSb3V0ZV07XHJcblxyXG5ATmdNb2R1bGUoe1xyXG4gICAgaW1wb3J0czogW1NvcHRvcnNoaVNoYXJlZE1vZHVsZSwgUm91dGVyTW9kdWxlLmZvckNoaWxkKEVOVElUWV9TVEFURVMpXSxcclxuICAgIGRlY2xhcmF0aW9uczogW1xyXG4gICAgICAgIFN1cHBseUFyZWFNYW5hZ2VyQ29tcG9uZW50LFxyXG4gICAgICAgIFN1cHBseUFyZWFNYW5hZ2VyRGV0YWlsQ29tcG9uZW50LFxyXG4gICAgICAgIFN1cHBseUFyZWFNYW5hZ2VyVXBkYXRlQ29tcG9uZW50LFxyXG4gICAgICAgIFN1cHBseUFyZWFNYW5hZ2VyRGVsZXRlRGlhbG9nQ29tcG9uZW50LFxyXG4gICAgICAgIFN1cHBseUFyZWFNYW5hZ2VyRGVsZXRlUG9wdXBDb21wb25lbnRcclxuICAgIF0sXHJcbiAgICBlbnRyeUNvbXBvbmVudHM6IFtcclxuICAgICAgICBTdXBwbHlBcmVhTWFuYWdlckNvbXBvbmVudCxcclxuICAgICAgICBTdXBwbHlBcmVhTWFuYWdlclVwZGF0ZUNvbXBvbmVudCxcclxuICAgICAgICBTdXBwbHlBcmVhTWFuYWdlckRlbGV0ZURpYWxvZ0NvbXBvbmVudCxcclxuICAgICAgICBTdXBwbHlBcmVhTWFuYWdlckRlbGV0ZVBvcHVwQ29tcG9uZW50XHJcbiAgICBdLFxyXG4gICAgc2NoZW1hczogW0NVU1RPTV9FTEVNRU5UU19TQ0hFTUFdXHJcbn0pXHJcbmV4cG9ydCBjbGFzcyBTb3B0b3JzaGlTdXBwbHlBcmVhTWFuYWdlck1vZHVsZSB7fVxyXG4iXSwic291cmNlUm9vdCI6IiJ9\n//# sourceURL=webpack-internal:///./src/main/webapp/app/entities/supply-area-manager/supply-area-manager.module.ts\n");

/***/ })

}]);