import { Component, OnInit } from '@angular/core';
import { Vehicle } from '../vehicle';
//import { Router } from '@angular/router';
import { VehicleService } from '../vehicle.service';
//import { ActivatedRoute } from '@angular/router';

const NOT_SELECTED = 'Not selected'
@Component({
  selector: 'app-vehicle-list',
  templateUrl: './vehicle-list.component.html',
  styleUrls: ['./vehicle-list.component.css']
})
export class VehicleListComponent implements OnInit {

  allVehicles: Vehicle[];
  status: any = []
  customers: String[] = []

  filteredVehicles: Vehicle[];
  constructor(private vehicleService :VehicleService,
    ) { }
    CustomerSelected :String = NOT_SELECTED
    StatusSelected :string = NOT_SELECTED

    id :Number;
  ngOnInit(): void {
    this.getVehicles();
    //this.filterSearch();
    
  }
  private getVehicles(){
    this.vehicleService.getVehicleList().subscribe((data :any) =>{
      const res = [...data]
      console.log(res)
      this.allVehicles=res;
      this.filteredVehicles=res;
        this.status = [NOT_SELECTED, ...new Set(res.map(r => r.status))]
      this.customers = [NOT_SELECTED, ...new Set(res.map(r => r.customerName))]
  })}
  


  filterSearch () {
   
    this.filteredVehicles = this.allVehicles.filter((vehicle: Vehicle) => {
      let res = false
      if (this.CustomerSelected && this.StatusSelected) {
        res = (((vehicle.customerName === this.CustomerSelected) || (this.CustomerSelected === NOT_SELECTED)) 
        && ((vehicle.status === this.StatusSelected) || (this.StatusSelected === NOT_SELECTED)))
      } 
      else {
        res = ((vehicle.customerName === this.CustomerSelected) || (vehicle.status === this.StatusSelected))
      }
      return res
    })
  }
  
  onCustomerChange(event) {
    this.CustomerSelected = event.target.value
    this.filterSearch()
  }

  onStatusChange(event) {
    this.StatusSelected = event.target.value
    this.filterSearch()
  }

}
