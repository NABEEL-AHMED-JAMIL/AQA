import { Component, Input, OnInit } from '@angular/core';
import { APPCONFIG } from '../../config';

@Component({
    selector: 'my-app-customizer',
    styles: [],
    templateUrl: './customizer.component.html',
})

export class AppCustomizerComponent implements OnInit {
    public AppConfig: any;

    ngOnInit() {
        this.AppConfig = APPCONFIG;
    }
}
