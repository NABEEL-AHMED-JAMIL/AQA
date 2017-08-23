import { Component } from '@angular/core';
import { MdDialogRef } from '@angular/material';

// openDialogWithAResult
@Component({
    selector: 'dialog-result-example-dialog',
    template: `<h1 md-dialog-title>Dialog</h1>
        <div md-dialog-content style="padding-bottom: 20px;">What would you like to do?</div>
        <div md-dialog-actions>
            <button md-button (click)="dialogRef.close('Option 1')">Option 1</button>
            <button md-button (click)="dialogRef.close('Option 2')">Option 2</button>
        </div>`,
})
export class DialogResultExampleDialogComponent {
    constructor(public dialogRef: MdDialogRef<DialogResultExampleDialogComponent>) {}
}