(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[205],{

/***/ "./src/main/webapp/app/entities/supply-zone/supply-zone.module.ts":
/*!************************************************************************!*\
  !*** ./src/main/webapp/app/entities/supply-zone/supply-zone.module.ts ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\r\nObject.defineProperty(exports, \"__esModule\", { value: true });\r\nvar tslib_1 = __webpack_require__(/*! tslib */ \"./node_modules/tslib/tslib.es6.js\");\r\nvar core_1 = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/fesm5/core.js\");\r\nvar router_1 = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/fesm5/router.js\");\r\nvar shared_1 = __webpack_require__(/*! app/shared */ \"./src/main/webapp/app/shared/index.ts\");\r\nvar _1 = __webpack_require__(/*! ./ */ \"./src/main/webapp/app/entities/supply-zone/index.ts\");\r\nvar ENTITY_STATES = _1.supplyZoneRoute.concat(_1.supplyZonePopupRoute);\r\nvar SoptorshiSupplyZoneModule = /** @class */ (function () {\r\n    function SoptorshiSupplyZoneModule() {\r\n    }\r\n    SoptorshiSupplyZoneModule = tslib_1.__decorate([\r\n        core_1.NgModule({\r\n            imports: [shared_1.SoptorshiSharedModule, router_1.RouterModule.forChild(ENTITY_STATES)],\r\n            declarations: [\r\n                _1.SupplyZoneComponent,\r\n                _1.SupplyZoneDetailComponent,\r\n                _1.SupplyZoneUpdateComponent,\r\n                _1.SupplyZoneDeleteDialogComponent,\r\n                _1.SupplyZoneDeletePopupComponent\r\n            ],\r\n            entryComponents: [_1.SupplyZoneComponent, _1.SupplyZoneUpdateComponent, _1.SupplyZoneDeleteDialogComponent, _1.SupplyZoneDeletePopupComponent],\r\n            schemas: [core_1.CUSTOM_ELEMENTS_SCHEMA]\r\n        })\r\n    ], SoptorshiSupplyZoneModule);\r\n    return SoptorshiSupplyZoneModule;\r\n}());\r\nexports.SoptorshiSupplyZoneModule = SoptorshiSupplyZoneModule;\r\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL3N1cHBseS16b25lL3N1cHBseS16b25lLm1vZHVsZS50cz83ZmZmIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiI7OztBQUFBLG9HQUFpRTtBQUNqRSw0R0FBK0M7QUFFL0MsOEZBQW1EO0FBQ25ELDhGQVFZO0FBRVosSUFBTSxhQUFhLEdBQU8sa0JBQWUsUUFBSyx1QkFBb0IsQ0FBQyxDQUFDO0FBY3BFO0lBQUE7SUFBd0MsQ0FBQztJQUE1Qix5QkFBeUI7UUFackMsZUFBUSxDQUFDO1lBQ04sT0FBTyxFQUFFLENBQUMsOEJBQXFCLEVBQUUscUJBQVksQ0FBQyxRQUFRLENBQUMsYUFBYSxDQUFDLENBQUM7WUFDdEUsWUFBWSxFQUFFO2dCQUNWLHNCQUFtQjtnQkFDbkIsNEJBQXlCO2dCQUN6Qiw0QkFBeUI7Z0JBQ3pCLGtDQUErQjtnQkFDL0IsaUNBQThCO2FBQ2pDO1lBQ0QsZUFBZSxFQUFFLENBQUMsc0JBQW1CLEVBQUUsNEJBQXlCLEVBQUUsa0NBQStCLEVBQUUsaUNBQThCLENBQUM7WUFDbEksT0FBTyxFQUFFLENBQUMsNkJBQXNCLENBQUM7U0FDcEMsQ0FBQztPQUNXLHlCQUF5QixDQUFHO0lBQUQsZ0NBQUM7Q0FBQTtBQUE1Qiw4REFBeUIiLCJmaWxlIjoiLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL3N1cHBseS16b25lL3N1cHBseS16b25lLm1vZHVsZS50cy5qcyIsInNvdXJjZXNDb250ZW50IjpbImltcG9ydCB7IENVU1RPTV9FTEVNRU5UU19TQ0hFTUEsIE5nTW9kdWxlIH0gZnJvbSAnQGFuZ3VsYXIvY29yZSc7XHJcbmltcG9ydCB7IFJvdXRlck1vZHVsZSB9IGZyb20gJ0Bhbmd1bGFyL3JvdXRlcic7XHJcblxyXG5pbXBvcnQgeyBTb3B0b3JzaGlTaGFyZWRNb2R1bGUgfSBmcm9tICdhcHAvc2hhcmVkJztcclxuaW1wb3J0IHtcclxuICAgIFN1cHBseVpvbmVDb21wb25lbnQsXHJcbiAgICBTdXBwbHlab25lRGVsZXRlRGlhbG9nQ29tcG9uZW50LFxyXG4gICAgU3VwcGx5Wm9uZURlbGV0ZVBvcHVwQ29tcG9uZW50LFxyXG4gICAgU3VwcGx5Wm9uZURldGFpbENvbXBvbmVudCxcclxuICAgIHN1cHBseVpvbmVQb3B1cFJvdXRlLFxyXG4gICAgc3VwcGx5Wm9uZVJvdXRlLFxyXG4gICAgU3VwcGx5Wm9uZVVwZGF0ZUNvbXBvbmVudFxyXG59IGZyb20gJy4vJztcclxuXHJcbmNvbnN0IEVOVElUWV9TVEFURVMgPSBbLi4uc3VwcGx5Wm9uZVJvdXRlLCAuLi5zdXBwbHlab25lUG9wdXBSb3V0ZV07XHJcblxyXG5ATmdNb2R1bGUoe1xyXG4gICAgaW1wb3J0czogW1NvcHRvcnNoaVNoYXJlZE1vZHVsZSwgUm91dGVyTW9kdWxlLmZvckNoaWxkKEVOVElUWV9TVEFURVMpXSxcclxuICAgIGRlY2xhcmF0aW9uczogW1xyXG4gICAgICAgIFN1cHBseVpvbmVDb21wb25lbnQsXHJcbiAgICAgICAgU3VwcGx5Wm9uZURldGFpbENvbXBvbmVudCxcclxuICAgICAgICBTdXBwbHlab25lVXBkYXRlQ29tcG9uZW50LFxyXG4gICAgICAgIFN1cHBseVpvbmVEZWxldGVEaWFsb2dDb21wb25lbnQsXHJcbiAgICAgICAgU3VwcGx5Wm9uZURlbGV0ZVBvcHVwQ29tcG9uZW50XHJcbiAgICBdLFxyXG4gICAgZW50cnlDb21wb25lbnRzOiBbU3VwcGx5Wm9uZUNvbXBvbmVudCwgU3VwcGx5Wm9uZVVwZGF0ZUNvbXBvbmVudCwgU3VwcGx5Wm9uZURlbGV0ZURpYWxvZ0NvbXBvbmVudCwgU3VwcGx5Wm9uZURlbGV0ZVBvcHVwQ29tcG9uZW50XSxcclxuICAgIHNjaGVtYXM6IFtDVVNUT01fRUxFTUVOVFNfU0NIRU1BXVxyXG59KVxyXG5leHBvcnQgY2xhc3MgU29wdG9yc2hpU3VwcGx5Wm9uZU1vZHVsZSB7fVxyXG4iXSwic291cmNlUm9vdCI6IiJ9\n//# sourceURL=webpack-internal:///./src/main/webapp/app/entities/supply-zone/supply-zone.module.ts\n");

/***/ })

}]);