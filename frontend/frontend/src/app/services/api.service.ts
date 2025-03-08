import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private baseUrl = '/api'; // Utilisation du proxy

  constructor(private http: HttpClient) {}

  getComptes(): Observable<any> {
    return this.http.get(`${this.baseUrl}/comptes`);  
  }
}
