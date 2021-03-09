import { Component, OnInit } from '@angular/core';
import { Vehicle } from '../vehicle';
import { Router } from '@angular/router';
import { VehicleService } from '../vehicle.service'

@Component({
  selector: 'app-vehicle-list',
  templateUrl: './vehicle-list.component.html',
  styleUrls: ['./vehicle-list.component.css']
})
export class VehicleListComponent implements OnInit {

  vehicles: Vehicle[];
  constructor(private vehicleService :VehicleService,
    private router:Router) { }

  ngOnInit(): void {
    this.getVehicles();
  }
  private getVehicles(){
    this.vehicleService.getVehicleList().subscribe(data =>{
      this.vehicles=data;
    });
  
  }

}
