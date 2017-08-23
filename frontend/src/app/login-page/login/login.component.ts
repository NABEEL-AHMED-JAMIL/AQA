import { Component } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';


declare const gapi: any;


@Component({
    selector: 'mypagelogin',
    styles: [],
    templateUrl: './login.component.html'
})

export class PageLoginComponent {

    model: any = {};
    loading = false;
    returnUrl: string;
    

    constructor( private route: ActivatedRoute,
                 private router: Router) {}
    
    
    public handleSignInClick(event: any) {
    
        console.log('this is function');
        console.log(event);
    }

 
}
