import { RouterModule, Routes } from '@angular/router';

import { LayoutComponent } from './layout/layout.component';
import { DashboardComponent } from './dashboard/dashboard.component';

import { PageLoginComponent } from './login-page/login/login.component';
import { PageSignUpComponent } from './login-page/sign-up/sign-up.component';
import { PageForgotPasswordComponent } from './login-page/forgot-password/forgot-password.component';
import { PageConfirmEmailComponent } from './login-page/confirm-email/confirm-email.component';
import { LoadingComponent } from './loading/loading.component';

// Page Layouts
import { PageLayoutFullscreenComponent } from './page-layouts/fullscreen/fullscreen.component';

const AppRoutes: Routes = [

    { path: '', redirectTo: 'app', pathMatch: 'full' },
    { path: 'app', component: LayoutComponent },
    { path: 'sign-up', component: PageSignUpComponent },
    { path: 'forgot-password', component: PageForgotPasswordComponent },
    { path: 'confirm-email', component: PageConfirmEmailComponent },
    { path: 'extra', loadChildren: './extra-pages/extra-pages.module#ExtraPagesModule' },
    { path: 'fullscreen', component: PageLayoutFullscreenComponent },
    
];
// , {useHash: true}
export const AppRoutingModule = RouterModule.forRoot(AppRoutes);
