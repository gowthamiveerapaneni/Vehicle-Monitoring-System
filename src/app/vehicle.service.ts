import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Vehicle } from './vehicle';
@Injectable({
  providedIn: 'root'
})
export class VehicleService {
  private baseURL = "http://localhost:8080/api/v1/vehicles";
  constructor(private httpClient: HttpClient) { }

  getVehicleList(): Observable<Vehicle[]> {
    return this.httpClient.get<Vehicle[]>(`${this.baseURL}`);
  }
}
