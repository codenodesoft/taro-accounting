(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[168],{

/***/ "./src/main/webapp/app/entities/leave-application-extended/leave-application-extended.module.ts":
/*!******************************************************************************************************!*\
  !*** ./src/main/webapp/app/entities/leave-application-extended/leave-application-extended.module.ts ***!
  \******************************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\r\nObject.defineProperty(exports, \"__esModule\", { value: true });\r\nvar tslib_1 = __webpack_require__(/*! tslib */ \"./node_modules/tslib/tslib.es6.js\");\r\nvar core_1 = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/fesm5/core.js\");\r\nvar router_1 = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/fesm5/router.js\");\r\nvar shared_1 = __webpack_require__(/*! app/shared */ \"./src/main/webapp/app/shared/index.ts\");\r\nvar _1 = __webpack_require__(/*! ./ */ \"./src/main/webapp/app/entities/leave-application-extended/index.ts\");\r\nvar others_leave_application_component_1 = __webpack_require__(/*! app/entities/leave-application-extended/others-leave-application.component */ \"./src/main/webapp/app/entities/leave-application-extended/others-leave-application.component.ts\");\r\nvar others_leave_application_history_component_1 = __webpack_require__(/*! app/entities/leave-application-extended/others-leave-application-history.component */ \"./src/main/webapp/app/entities/leave-application-extended/others-leave-application-history.component.ts\");\r\nvar ENTITY_STATES = _1.leaveApplicationExtendedRoute.concat(_1.leaveApplicationPopupExtendedRoute);\r\nvar SoptorshiLeaveApplicationExtendedModule = /** @class */ (function () {\r\n    function SoptorshiLeaveApplicationExtendedModule() {\r\n    }\r\n    SoptorshiLeaveApplicationExtendedModule = tslib_1.__decorate([\r\n        core_1.NgModule({\r\n            imports: [shared_1.SoptorshiSharedModule, router_1.RouterModule.forChild(ENTITY_STATES)],\r\n            declarations: [\r\n                _1.LeaveApplicationExtendedComponent,\r\n                _1.LeaveApplicationDetailExtendedComponent,\r\n                _1.LeaveApplicationUpdateExtendedComponent,\r\n                _1.LeaveApplicationDeleteDialogExtendedComponent,\r\n                _1.LeaveApplicationDeletePopupExtendedComponent,\r\n                others_leave_application_component_1.OthersLeaveApplicationComponent,\r\n                others_leave_application_history_component_1.OthersLeaveApplicationHistoryComponent,\r\n                _1.ReviewLeaveApplicationComponent\r\n            ],\r\n            entryComponents: [\r\n                _1.LeaveApplicationExtendedComponent,\r\n                _1.LeaveApplicationUpdateExtendedComponent,\r\n                _1.LeaveApplicationDeleteDialogExtendedComponent,\r\n                _1.LeaveApplicationDeletePopupExtendedComponent,\r\n                others_leave_application_component_1.OthersLeaveApplicationComponent,\r\n                others_leave_application_history_component_1.OthersLeaveApplicationHistoryComponent,\r\n                _1.ReviewLeaveApplicationComponent\r\n            ],\r\n            schemas: [core_1.CUSTOM_ELEMENTS_SCHEMA]\r\n        })\r\n    ], SoptorshiLeaveApplicationExtendedModule);\r\n    return SoptorshiLeaveApplicationExtendedModule;\r\n}());\r\nexports.SoptorshiLeaveApplicationExtendedModule = SoptorshiLeaveApplicationExtendedModule;\r\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL2xlYXZlLWFwcGxpY2F0aW9uLWV4dGVuZGVkL2xlYXZlLWFwcGxpY2F0aW9uLWV4dGVuZGVkLm1vZHVsZS50cz82MzE0Il0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiI7OztBQUFBLG9HQUFpRTtBQUNqRSw0R0FBK0M7QUFFL0MsOEZBQW1EO0FBQ25ELDZHQVNZO0FBQ1osb1BBQTZIO0FBQzdILDRRQUE0STtBQUU1SSxJQUFNLGFBQWEsR0FBTyxnQ0FBNkIsUUFBSyxxQ0FBa0MsQ0FBQyxDQUFDO0FBeUJoRztJQUFBO0lBQXNELENBQUM7SUFBMUMsdUNBQXVDO1FBdkJuRCxlQUFRLENBQUM7WUFDTixPQUFPLEVBQUUsQ0FBQyw4QkFBcUIsRUFBRSxxQkFBWSxDQUFDLFFBQVEsQ0FBQyxhQUFhLENBQUMsQ0FBQztZQUN0RSxZQUFZLEVBQUU7Z0JBQ1Ysb0NBQWlDO2dCQUNqQywwQ0FBdUM7Z0JBQ3ZDLDBDQUF1QztnQkFDdkMsZ0RBQTZDO2dCQUM3QywrQ0FBNEM7Z0JBQzVDLG9FQUErQjtnQkFDL0IsbUZBQXNDO2dCQUN0QyxrQ0FBK0I7YUFDbEM7WUFDRCxlQUFlLEVBQUU7Z0JBQ2Isb0NBQWlDO2dCQUNqQywwQ0FBdUM7Z0JBQ3ZDLGdEQUE2QztnQkFDN0MsK0NBQTRDO2dCQUM1QyxvRUFBK0I7Z0JBQy9CLG1GQUFzQztnQkFDdEMsa0NBQStCO2FBQ2xDO1lBQ0QsT0FBTyxFQUFFLENBQUMsNkJBQXNCLENBQUM7U0FDcEMsQ0FBQztPQUNXLHVDQUF1QyxDQUFHO0lBQUQsOENBQUM7Q0FBQTtBQUExQywwRkFBdUMiLCJmaWxlIjoiLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2VudGl0aWVzL2xlYXZlLWFwcGxpY2F0aW9uLWV4dGVuZGVkL2xlYXZlLWFwcGxpY2F0aW9uLWV4dGVuZGVkLm1vZHVsZS50cy5qcyIsInNvdXJjZXNDb250ZW50IjpbImltcG9ydCB7IENVU1RPTV9FTEVNRU5UU19TQ0hFTUEsIE5nTW9kdWxlIH0gZnJvbSAnQGFuZ3VsYXIvY29yZSc7XHJcbmltcG9ydCB7IFJvdXRlck1vZHVsZSB9IGZyb20gJ0Bhbmd1bGFyL3JvdXRlcic7XHJcblxyXG5pbXBvcnQgeyBTb3B0b3JzaGlTaGFyZWRNb2R1bGUgfSBmcm9tICdhcHAvc2hhcmVkJztcclxuaW1wb3J0IHtcclxuICAgIExlYXZlQXBwbGljYXRpb25EZWxldGVEaWFsb2dFeHRlbmRlZENvbXBvbmVudCxcclxuICAgIExlYXZlQXBwbGljYXRpb25EZWxldGVQb3B1cEV4dGVuZGVkQ29tcG9uZW50LFxyXG4gICAgTGVhdmVBcHBsaWNhdGlvbkRldGFpbEV4dGVuZGVkQ29tcG9uZW50LFxyXG4gICAgTGVhdmVBcHBsaWNhdGlvbkV4dGVuZGVkQ29tcG9uZW50LFxyXG4gICAgbGVhdmVBcHBsaWNhdGlvbkV4dGVuZGVkUm91dGUsXHJcbiAgICBsZWF2ZUFwcGxpY2F0aW9uUG9wdXBFeHRlbmRlZFJvdXRlLFxyXG4gICAgTGVhdmVBcHBsaWNhdGlvblVwZGF0ZUV4dGVuZGVkQ29tcG9uZW50LFxyXG4gICAgUmV2aWV3TGVhdmVBcHBsaWNhdGlvbkNvbXBvbmVudFxyXG59IGZyb20gJy4vJztcclxuaW1wb3J0IHsgT3RoZXJzTGVhdmVBcHBsaWNhdGlvbkNvbXBvbmVudCB9IGZyb20gJ2FwcC9lbnRpdGllcy9sZWF2ZS1hcHBsaWNhdGlvbi1leHRlbmRlZC9vdGhlcnMtbGVhdmUtYXBwbGljYXRpb24uY29tcG9uZW50JztcclxuaW1wb3J0IHsgT3RoZXJzTGVhdmVBcHBsaWNhdGlvbkhpc3RvcnlDb21wb25lbnQgfSBmcm9tICdhcHAvZW50aXRpZXMvbGVhdmUtYXBwbGljYXRpb24tZXh0ZW5kZWQvb3RoZXJzLWxlYXZlLWFwcGxpY2F0aW9uLWhpc3RvcnkuY29tcG9uZW50JztcclxuXHJcbmNvbnN0IEVOVElUWV9TVEFURVMgPSBbLi4ubGVhdmVBcHBsaWNhdGlvbkV4dGVuZGVkUm91dGUsIC4uLmxlYXZlQXBwbGljYXRpb25Qb3B1cEV4dGVuZGVkUm91dGVdO1xyXG5cclxuQE5nTW9kdWxlKHtcclxuICAgIGltcG9ydHM6IFtTb3B0b3JzaGlTaGFyZWRNb2R1bGUsIFJvdXRlck1vZHVsZS5mb3JDaGlsZChFTlRJVFlfU1RBVEVTKV0sXHJcbiAgICBkZWNsYXJhdGlvbnM6IFtcclxuICAgICAgICBMZWF2ZUFwcGxpY2F0aW9uRXh0ZW5kZWRDb21wb25lbnQsXHJcbiAgICAgICAgTGVhdmVBcHBsaWNhdGlvbkRldGFpbEV4dGVuZGVkQ29tcG9uZW50LFxyXG4gICAgICAgIExlYXZlQXBwbGljYXRpb25VcGRhdGVFeHRlbmRlZENvbXBvbmVudCxcclxuICAgICAgICBMZWF2ZUFwcGxpY2F0aW9uRGVsZXRlRGlhbG9nRXh0ZW5kZWRDb21wb25lbnQsXHJcbiAgICAgICAgTGVhdmVBcHBsaWNhdGlvbkRlbGV0ZVBvcHVwRXh0ZW5kZWRDb21wb25lbnQsXHJcbiAgICAgICAgT3RoZXJzTGVhdmVBcHBsaWNhdGlvbkNvbXBvbmVudCxcclxuICAgICAgICBPdGhlcnNMZWF2ZUFwcGxpY2F0aW9uSGlzdG9yeUNvbXBvbmVudCxcclxuICAgICAgICBSZXZpZXdMZWF2ZUFwcGxpY2F0aW9uQ29tcG9uZW50XHJcbiAgICBdLFxyXG4gICAgZW50cnlDb21wb25lbnRzOiBbXHJcbiAgICAgICAgTGVhdmVBcHBsaWNhdGlvbkV4dGVuZGVkQ29tcG9uZW50LFxyXG4gICAgICAgIExlYXZlQXBwbGljYXRpb25VcGRhdGVFeHRlbmRlZENvbXBvbmVudCxcclxuICAgICAgICBMZWF2ZUFwcGxpY2F0aW9uRGVsZXRlRGlhbG9nRXh0ZW5kZWRDb21wb25lbnQsXHJcbiAgICAgICAgTGVhdmVBcHBsaWNhdGlvbkRlbGV0ZVBvcHVwRXh0ZW5kZWRDb21wb25lbnQsXHJcbiAgICAgICAgT3RoZXJzTGVhdmVBcHBsaWNhdGlvbkNvbXBvbmVudCxcclxuICAgICAgICBPdGhlcnNMZWF2ZUFwcGxpY2F0aW9uSGlzdG9yeUNvbXBvbmVudCxcclxuICAgICAgICBSZXZpZXdMZWF2ZUFwcGxpY2F0aW9uQ29tcG9uZW50XHJcbiAgICBdLFxyXG4gICAgc2NoZW1hczogW0NVU1RPTV9FTEVNRU5UU19TQ0hFTUFdXHJcbn0pXHJcbmV4cG9ydCBjbGFzcyBTb3B0b3JzaGlMZWF2ZUFwcGxpY2F0aW9uRXh0ZW5kZWRNb2R1bGUge31cclxuIl0sInNvdXJjZVJvb3QiOiIifQ==\n//# sourceURL=webpack-internal:///./src/main/webapp/app/entities/leave-application-extended/leave-application-extended.module.ts\n");

/***/ })

}]);