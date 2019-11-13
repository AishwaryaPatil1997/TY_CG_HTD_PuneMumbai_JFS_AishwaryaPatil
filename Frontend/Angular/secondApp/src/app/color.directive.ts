import { Directive, ElementRef, HostListener, HostBinding } from "@angular/core";

@Directive({
    selector: '[appColor]'
})
export class ColorDirective{
    constructor(private el: ElementRef){
        this.el.nativeElement.style.backgroundColor = 'darkorange';
        this.el.nativeElement.style.color = 'blacks';
        this.el.nativeElement.style.padding = '5px';
        this.el.nativeElement.style.fontSize = '10px';
    }

    @HostBinding('style.fontSize') fontSize;

    @HostListener('mouseenter')
    mouseEnter(){
        console.log('mouse entered');
        this.fontSize = '20px';
        this.el.nativeElement.style.background = 'white';
    }

    @HostListener('mouseleave')
    mouseLeave(){
        console.log('mouse left');
        this.fontSize = '15px';
        this.el.nativeElement.style.background = 'green';
    }
}