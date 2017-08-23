import { NgModule } from '@angular/core';
import { MaterialModule } from '@angular/material';
import { ExtraPagesRoutingModule } from './extra-pages-routing.module';

import { PageLoginComponent } from './login/login.component';
import { PageSignUpComponent } from './sign-up/sign-up.component';
import { PageForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { Page404Component } from './404/404.component';
import { Page500Component } from './500/500.component';
import { PageConfirmEmailComponent } from './confirm-email/confirm-email.component';
import { PageLockScreenComponent } from './lock-screen/lock-screen.component';
import { PageMaintenanceComponent } from './maintenance/maintenance.component';


let providers = {
    "google": {
        'clientId': "915758799202-2o1048kpv3s8qdmssbccs4gb54ge08cg.apps.googleusercontent.com"
    }
     
};


@NgModule({
    imports: [
        ExtraPagesRoutingModule,
        MaterialModule,
    ],
    declarations: [
        PageLoginComponent,
        PageSignUpComponent,
        PageForgotPasswordComponent,
        Page404Component,
        Page500Component,
        PageConfirmEmailComponent,
        PageLockScreenComponent,
        PageMaintenanceComponent,
    ]
})

export class ExtraPagesModule {}
