(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[174],{

/***/ "./src/main/webapp/app/entities/over-time/over-time.module.ts":
/*!********************************************************************!*\
  !*** ./src/main/webapp/app/entities/over-time/over-time.module.ts ***!
  \********************************************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\r\nObject.defineProperty(exports, \"__esModule\", { value: true });\r\nvar tslib_1 = __webpack_require__(/*! tslib */ \"./node_modules/tslib/tslib.es6.js\");\r\nvar core_1 = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/fesm5/core.js\");\r\nvar router_1 = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/fesm5/router.js\");\r\nvar shared_1 = __webpack_require__(/*! app/shared */ \"./src/main/webapp/app/shared/index.ts\");\r\nvar _1 = __webpack_require__(/*! ./ */ \"./src/main/webapp/app/entities/over-time/index.ts\");\r\nvar ENTITY_STATES = _1.overTimeRoute.concat(_1.overTimePopupRoute);\r\nvar SoptorshiOverTimeModule = /** @class */ (function () {\r\n    function SoptorshiOverTimeModule() {\r\n    }\r\n    SoptorshiOverTimeModule = tslib_1.__decorate([\r\n        core_1.NgModule({\r\n            imports: [shared_1.SoptorshiSharedModule, router_1.RouterModule.forChild(ENTITY_STATES)],\r\n            declarations: [\r\n                _1.OverTimeComponent,\r\n                _1.OverTimeDetailComponent,\r\n                _1.OverTimeUpdateComponent,\r\n                _1.OverTimeDeleteDialogComponent,\r\n                _1.OverTimeDeletePopupComponent\r\n            ],\r\n            entryComponents: [_1.OverTimeComponent, _1.OverTimeUpdateComponent, _1.OverTimeDeleteDialogComponent, _1.OverTimeDeletePopupComponent],\r\n            schemas: [core_1.CUSTOM_ELEMENTS_SCHEMA]\r\n        })\r\n    ], SoptorshiOverTimeModule);\r\n    return SoptorshiOverTimeModule;\r\n}());\r\nexports.SoptorshiOverTimeModule = SoptorshiOverTimeModule;\r\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL292ZXItdGltZS9vdmVyLXRpbWUubW9kdWxlLnRzPzE1ZWQiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6Ijs7O0FBQUEsb0dBQWlFO0FBQ2pFLDRHQUErQztBQUUvQyw4RkFBbUQ7QUFDbkQsNEZBUVk7QUFFWixJQUFNLGFBQWEsR0FBTyxnQkFBYSxRQUFLLHFCQUFrQixDQUFDLENBQUM7QUFjaEU7SUFBQTtJQUFzQyxDQUFDO0lBQTFCLHVCQUF1QjtRQVpuQyxlQUFRLENBQUM7WUFDTixPQUFPLEVBQUUsQ0FBQyw4QkFBcUIsRUFBRSxxQkFBWSxDQUFDLFFBQVEsQ0FBQyxhQUFhLENBQUMsQ0FBQztZQUN0RSxZQUFZLEVBQUU7Z0JBQ1Ysb0JBQWlCO2dCQUNqQiwwQkFBdUI7Z0JBQ3ZCLDBCQUF1QjtnQkFDdkIsZ0NBQTZCO2dCQUM3QiwrQkFBNEI7YUFDL0I7WUFDRCxlQUFlLEVBQUUsQ0FBQyxvQkFBaUIsRUFBRSwwQkFBdUIsRUFBRSxnQ0FBNkIsRUFBRSwrQkFBNEIsQ0FBQztZQUMxSCxPQUFPLEVBQUUsQ0FBQyw2QkFBc0IsQ0FBQztTQUNwQyxDQUFDO09BQ1csdUJBQXVCLENBQUc7SUFBRCw4QkFBQztDQUFBO0FBQTFCLDBEQUF1QiIsImZpbGUiOiIuL3NyYy9tYWluL3dlYmFwcC9hcHAvZW50aXRpZXMvb3Zlci10aW1lL292ZXItdGltZS5tb2R1bGUudHMuanMiLCJzb3VyY2VzQ29udGVudCI6WyJpbXBvcnQgeyBDVVNUT01fRUxFTUVOVFNfU0NIRU1BLCBOZ01vZHVsZSB9IGZyb20gJ0Bhbmd1bGFyL2NvcmUnO1xyXG5pbXBvcnQgeyBSb3V0ZXJNb2R1bGUgfSBmcm9tICdAYW5ndWxhci9yb3V0ZXInO1xyXG5cclxuaW1wb3J0IHsgU29wdG9yc2hpU2hhcmVkTW9kdWxlIH0gZnJvbSAnYXBwL3NoYXJlZCc7XHJcbmltcG9ydCB7XHJcbiAgICBPdmVyVGltZUNvbXBvbmVudCxcclxuICAgIE92ZXJUaW1lRGVsZXRlRGlhbG9nQ29tcG9uZW50LFxyXG4gICAgT3ZlclRpbWVEZWxldGVQb3B1cENvbXBvbmVudCxcclxuICAgIE92ZXJUaW1lRGV0YWlsQ29tcG9uZW50LFxyXG4gICAgb3ZlclRpbWVQb3B1cFJvdXRlLFxyXG4gICAgb3ZlclRpbWVSb3V0ZSxcclxuICAgIE92ZXJUaW1lVXBkYXRlQ29tcG9uZW50XHJcbn0gZnJvbSAnLi8nO1xyXG5cclxuY29uc3QgRU5USVRZX1NUQVRFUyA9IFsuLi5vdmVyVGltZVJvdXRlLCAuLi5vdmVyVGltZVBvcHVwUm91dGVdO1xyXG5cclxuQE5nTW9kdWxlKHtcclxuICAgIGltcG9ydHM6IFtTb3B0b3JzaGlTaGFyZWRNb2R1bGUsIFJvdXRlck1vZHVsZS5mb3JDaGlsZChFTlRJVFlfU1RBVEVTKV0sXHJcbiAgICBkZWNsYXJhdGlvbnM6IFtcclxuICAgICAgICBPdmVyVGltZUNvbXBvbmVudCxcclxuICAgICAgICBPdmVyVGltZURldGFpbENvbXBvbmVudCxcclxuICAgICAgICBPdmVyVGltZVVwZGF0ZUNvbXBvbmVudCxcclxuICAgICAgICBPdmVyVGltZURlbGV0ZURpYWxvZ0NvbXBvbmVudCxcclxuICAgICAgICBPdmVyVGltZURlbGV0ZVBvcHVwQ29tcG9uZW50XHJcbiAgICBdLFxyXG4gICAgZW50cnlDb21wb25lbnRzOiBbT3ZlclRpbWVDb21wb25lbnQsIE92ZXJUaW1lVXBkYXRlQ29tcG9uZW50LCBPdmVyVGltZURlbGV0ZURpYWxvZ0NvbXBvbmVudCwgT3ZlclRpbWVEZWxldGVQb3B1cENvbXBvbmVudF0sXHJcbiAgICBzY2hlbWFzOiBbQ1VTVE9NX0VMRU1FTlRTX1NDSEVNQV1cclxufSlcclxuZXhwb3J0IGNsYXNzIFNvcHRvcnNoaU92ZXJUaW1lTW9kdWxlIHt9XHJcbiJdLCJzb3VyY2VSb290IjoiIn0=\n//# sourceURL=webpack-internal:///./src/main/webapp/app/entities/over-time/over-time.module.ts\n");

/***/ })

}]);