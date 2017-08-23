import { Directive, ElementRef, AfterViewInit } from '@angular/core';

// off-canvas sidebar for mobile, and this is the trigger
@Directive({ selector: '[myToggleOffcanvasNav]' })

export class ToggleOffcanvasNavDirective implements AfterViewInit {
    el: ElementRef;
    constructor(el: ElementRef) {
        this.el = el;
    }

    ngAfterViewInit() {

        const $navToggler = $(this.el.nativeElement);
        const $body = $('#body');

        $navToggler.on('click', (e) => {
            // _sidebar.scss, _page-container.scss
            $body.toggleClass('sidebar-mobile-open');
            e.preventDefault();
        });
    }
}
