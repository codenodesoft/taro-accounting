(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[202],{

/***/ "./src/main/webapp/app/entities/supply-zone-extended/supply-zone-extended.module.ts":
/*!******************************************************************************************!*\
  !*** ./src/main/webapp/app/entities/supply-zone-extended/supply-zone-extended.module.ts ***!
  \******************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\r\nObject.defineProperty(exports, \"__esModule\", { value: true });\r\nvar tslib_1 = __webpack_require__(/*! tslib */ \"./node_modules/tslib/tslib.es6.js\");\r\nvar core_1 = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/fesm5/core.js\");\r\nvar router_1 = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/fesm5/router.js\");\r\nvar shared_1 = __webpack_require__(/*! app/shared */ \"./src/main/webapp/app/shared/index.ts\");\r\nvar _1 = __webpack_require__(/*! ./ */ \"./src/main/webapp/app/entities/supply-zone-extended/index.ts\");\r\nvar ENTITY_STATES = _1.supplyZoneExtendedRoute.concat(_1.supplyZonePopupExtendedRoute);\r\nvar SoptorshiSupplyZoneExtendedModule = /** @class */ (function () {\r\n    function SoptorshiSupplyZoneExtendedModule() {\r\n    }\r\n    SoptorshiSupplyZoneExtendedModule = tslib_1.__decorate([\r\n        core_1.NgModule({\r\n            imports: [shared_1.SoptorshiSharedModule, router_1.RouterModule.forChild(ENTITY_STATES)],\r\n            declarations: [\r\n                _1.SupplyZoneExtendedComponent,\r\n                _1.SupplyZoneDetailExtendedComponent,\r\n                _1.SupplyZoneUpdateExtendedComponent,\r\n                _1.SupplyZoneDeleteDialogExtendedComponent,\r\n                _1.SupplyZoneDeletePopupExtendedComponent\r\n            ],\r\n            entryComponents: [\r\n                _1.SupplyZoneExtendedComponent,\r\n                _1.SupplyZoneUpdateExtendedComponent,\r\n                _1.SupplyZoneDeleteDialogExtendedComponent,\r\n                _1.SupplyZoneDeletePopupExtendedComponent\r\n            ],\r\n            schemas: [core_1.CUSTOM_ELEMENTS_SCHEMA]\r\n        })\r\n    ], SoptorshiSupplyZoneExtendedModule);\r\n    return SoptorshiSupplyZoneExtendedModule;\r\n}());\r\nexports.SoptorshiSupplyZoneExtendedModule = SoptorshiSupplyZoneExtendedModule;\r\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL3N1cHBseS16b25lLWV4dGVuZGVkL3N1cHBseS16b25lLWV4dGVuZGVkLm1vZHVsZS50cz82Mjk0Il0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiI7OztBQUFBLG9HQUFpRTtBQUNqRSw0R0FBK0M7QUFFL0MsOEZBQW1EO0FBQ25ELHVHQVFZO0FBRVosSUFBTSxhQUFhLEdBQU8sMEJBQXVCLFFBQUssK0JBQTRCLENBQUMsQ0FBQztBQW1CcEY7SUFBQTtJQUFnRCxDQUFDO0lBQXBDLGlDQUFpQztRQWpCN0MsZUFBUSxDQUFDO1lBQ04sT0FBTyxFQUFFLENBQUMsOEJBQXFCLEVBQUUscUJBQVksQ0FBQyxRQUFRLENBQUMsYUFBYSxDQUFDLENBQUM7WUFDdEUsWUFBWSxFQUFFO2dCQUNWLDhCQUEyQjtnQkFDM0Isb0NBQWlDO2dCQUNqQyxvQ0FBaUM7Z0JBQ2pDLDBDQUF1QztnQkFDdkMseUNBQXNDO2FBQ3pDO1lBQ0QsZUFBZSxFQUFFO2dCQUNiLDhCQUEyQjtnQkFDM0Isb0NBQWlDO2dCQUNqQywwQ0FBdUM7Z0JBQ3ZDLHlDQUFzQzthQUN6QztZQUNELE9BQU8sRUFBRSxDQUFDLDZCQUFzQixDQUFDO1NBQ3BDLENBQUM7T0FDVyxpQ0FBaUMsQ0FBRztJQUFELHdDQUFDO0NBQUE7QUFBcEMsOEVBQWlDIiwiZmlsZSI6Ii4vc3JjL21haW4vd2ViYXBwL2FwcC9lbnRpdGllcy9zdXBwbHktem9uZS1leHRlbmRlZC9zdXBwbHktem9uZS1leHRlbmRlZC5tb2R1bGUudHMuanMiLCJzb3VyY2VzQ29udGVudCI6WyJpbXBvcnQgeyBDVVNUT01fRUxFTUVOVFNfU0NIRU1BLCBOZ01vZHVsZSB9IGZyb20gJ0Bhbmd1bGFyL2NvcmUnO1xyXG5pbXBvcnQgeyBSb3V0ZXJNb2R1bGUgfSBmcm9tICdAYW5ndWxhci9yb3V0ZXInO1xyXG5cclxuaW1wb3J0IHsgU29wdG9yc2hpU2hhcmVkTW9kdWxlIH0gZnJvbSAnYXBwL3NoYXJlZCc7XHJcbmltcG9ydCB7XHJcbiAgICBTdXBwbHlab25lRGVsZXRlRGlhbG9nRXh0ZW5kZWRDb21wb25lbnQsXHJcbiAgICBTdXBwbHlab25lRGVsZXRlUG9wdXBFeHRlbmRlZENvbXBvbmVudCxcclxuICAgIFN1cHBseVpvbmVEZXRhaWxFeHRlbmRlZENvbXBvbmVudCxcclxuICAgIFN1cHBseVpvbmVFeHRlbmRlZENvbXBvbmVudCxcclxuICAgIHN1cHBseVpvbmVFeHRlbmRlZFJvdXRlLFxyXG4gICAgc3VwcGx5Wm9uZVBvcHVwRXh0ZW5kZWRSb3V0ZSxcclxuICAgIFN1cHBseVpvbmVVcGRhdGVFeHRlbmRlZENvbXBvbmVudFxyXG59IGZyb20gJy4vJztcclxuXHJcbmNvbnN0IEVOVElUWV9TVEFURVMgPSBbLi4uc3VwcGx5Wm9uZUV4dGVuZGVkUm91dGUsIC4uLnN1cHBseVpvbmVQb3B1cEV4dGVuZGVkUm91dGVdO1xyXG5cclxuQE5nTW9kdWxlKHtcclxuICAgIGltcG9ydHM6IFtTb3B0b3JzaGlTaGFyZWRNb2R1bGUsIFJvdXRlck1vZHVsZS5mb3JDaGlsZChFTlRJVFlfU1RBVEVTKV0sXHJcbiAgICBkZWNsYXJhdGlvbnM6IFtcclxuICAgICAgICBTdXBwbHlab25lRXh0ZW5kZWRDb21wb25lbnQsXHJcbiAgICAgICAgU3VwcGx5Wm9uZURldGFpbEV4dGVuZGVkQ29tcG9uZW50LFxyXG4gICAgICAgIFN1cHBseVpvbmVVcGRhdGVFeHRlbmRlZENvbXBvbmVudCxcclxuICAgICAgICBTdXBwbHlab25lRGVsZXRlRGlhbG9nRXh0ZW5kZWRDb21wb25lbnQsXHJcbiAgICAgICAgU3VwcGx5Wm9uZURlbGV0ZVBvcHVwRXh0ZW5kZWRDb21wb25lbnRcclxuICAgIF0sXHJcbiAgICBlbnRyeUNvbXBvbmVudHM6IFtcclxuICAgICAgICBTdXBwbHlab25lRXh0ZW5kZWRDb21wb25lbnQsXHJcbiAgICAgICAgU3VwcGx5Wm9uZVVwZGF0ZUV4dGVuZGVkQ29tcG9uZW50LFxyXG4gICAgICAgIFN1cHBseVpvbmVEZWxldGVEaWFsb2dFeHRlbmRlZENvbXBvbmVudCxcclxuICAgICAgICBTdXBwbHlab25lRGVsZXRlUG9wdXBFeHRlbmRlZENvbXBvbmVudFxyXG4gICAgXSxcclxuICAgIHNjaGVtYXM6IFtDVVNUT01fRUxFTUVOVFNfU0NIRU1BXVxyXG59KVxyXG5leHBvcnQgY2xhc3MgU29wdG9yc2hpU3VwcGx5Wm9uZUV4dGVuZGVkTW9kdWxlIHt9XHJcbiJdLCJzb3VyY2VSb290IjoiIn0=\n//# sourceURL=webpack-internal:///./src/main/webapp/app/entities/supply-zone-extended/supply-zone-extended.module.ts\n");

/***/ })

}]);