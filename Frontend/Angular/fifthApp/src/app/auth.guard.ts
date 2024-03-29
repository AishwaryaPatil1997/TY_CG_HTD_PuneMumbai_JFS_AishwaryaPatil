import { CanActivate } from '@angular/router';
import { Injectable } from '@angular/core';
import { AuthService } from './auth.service';

@Injectable({
    providedIn: 'root'
})

export class AuthGuard implements CanActivate {

    constructor(private auth: AuthService) { }

    canActivate(): boolean {
        if (this.auth.isLoggedIn()) {
            return true;
        } else {
            return false;
        }
    }
}