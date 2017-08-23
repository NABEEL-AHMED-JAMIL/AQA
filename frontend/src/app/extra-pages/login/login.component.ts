import { Component , OnInit } from '@angular/core';

@Component({
    selector: 'my-page-login',
    styles: [],
    templateUrl: './login.component.html'
})

export class PageLoginComponent implements OnInit {
    
    private googlefullImagePath: string;
    public user:Object;
    sub: any;

   ngOnInit() {
   
    }

    constructor(){
       this.googlefullImagePath = 'assets/images/Red-signin_Google_base_44dp.png'; 
    }

    
    

}
