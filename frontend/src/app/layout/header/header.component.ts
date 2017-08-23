import { Component, OnInit } from '@angular/core';
import { APPCONFIG } from '../../config';

@Component({
    selector: 'my-app-header',
    styles: [],
    templateUrl: './header.component.html'
})

export class AppHeaderComponent implements OnInit {
    public AppConfig: any;

    ngOnInit() {
        this.AppConfig = APPCONFIG;
    }
}
