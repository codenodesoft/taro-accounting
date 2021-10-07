import { AfterViewInit, Component, OnInit } from '@angular/core';
import { NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiAlertService, JhiEventManager } from 'ng-jhipster';

import { LoginModalService, AccountService, Account } from 'app/core';
import { Employee, IEmployee } from 'app/shared/model/employee.model';
import { EmployeeService } from 'app/entities/employee';
import { HttpErrorResponse, HttpResponse } from '@angular/common/http';
import { Department, IDepartment } from 'app/shared/model/department.model';
import { Designation, IDesignation } from 'app/shared/model/designation.model';
import { DepartmentService } from 'app/entities/department';
import { DesignationService } from 'app/entities/designation';
import { filter, map } from 'rxjs/operators';
import { HomeComponent } from 'app/home';
import { Router } from '@angular/router';

@Component({
    selector: 'jhi-home-extended',
    templateUrl: './home-extended.component.html',
    styleUrls: ['home-extended.css']
})
export class HomeExtendedComponent extends HomeComponent implements OnInit {
    account: Account;
    modalRef: NgbModalRef;
    employee: Employee;
    department: Department;
    designation: Designation;

    constructor(
        public accountService: AccountService,
        public loginModalService: LoginModalService,
        public eventManager: JhiEventManager,
        public employeeService: EmployeeService,
        public jhiAlertService: JhiAlertService,
        public departmentService: DepartmentService,
        public designationService: DesignationService,
        public router: Router
    ) {
        super(accountService, loginModalService, eventManager, employeeService, jhiAlertService, departmentService, designationService);
    }

    fetchLoggedEmployeeInformation() {
        this.employeeService
            .query({
                'employeeId.equals': this.account.login,
                page: 0,
                size: 1
            })
            .subscribe(
                (res: HttpResponse<IEmployee[]>) => {
                    this.employee = res.body[0];
                    this.fetchAdditionalInformation();
                },
                (res: HttpErrorResponse) => this.jhiAlertService.error('Error in fetching logged employee information')
            );
    }

    fetchAdditionalInformation() {
        this.departmentService.find(this.employee.departmentId).subscribe((res: HttpResponse<IDepartment>) => (this.department = res.body));
        this.designationService
            .find(this.employee.designationId)
            .subscribe((res: HttpResponse<IDesignation>) => (this.designation = res.body));
    }

    ngOnInit() {
        if (!this.isAuthenticated()) this.router.navigate(['/login']);
        this.accountService.identity().then((account: Account) => {
            this.account = account;
            this.fetchLoggedEmployeeInformation();
        });
        this.registerAuthenticationSuccess();
    }

    registerAuthenticationSuccess() {
        this.eventManager.subscribe('authenticationSuccess', message => {
            this.accountService.identity().then(account => {
                this.account = account;
            });
        });
    }

    isAuthenticated() {
        return this.accountService.isAuthenticated();
    }

    login() {
        this.router.navigate(['/login']);
    }
}
