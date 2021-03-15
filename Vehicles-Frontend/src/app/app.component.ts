import { Component } from '@angular/core';
import { Vehicle } from './vehicle';
import { VehicleService } from './vehicle.service';
const NOT_SELECTED = 'Not selected'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'vehicle-monitoring-app';
  allVehicles: Vehicle[];
  status: any = []
  customers: String[] = []
  CustomerSelected: String = NOT_SELECTED
  StatusSelected: string = NOT_SELECTED

  id: Number;

  filteredVehicles: Vehicle[];
  constructor(private vehicleService: VehicleService,
    ) {
  
      setInterval(() => {
        this.getVehicles()
      }, 2000)
  
    }
  
    ngOnInit(): void {
      this.getVehicles();
  
    }
    private getVehicles() {
      this.vehicleService.getVehicleList().subscribe((data: any) => {
        const res = [...data]
        console.log(res)
        this.allVehicles = res;
        this.filterSearch()
        this.status = [NOT_SELECTED, ...new Set(res.map(r => r.status))]
        this.customers = [NOT_SELECTED, ...new Set(res.map(r => r.user.customerName))]
      })
  
    }
    filterSearch() {

      this.filteredVehicles = this.allVehicles.filter((vehicle: Vehicle) => {
        let res = false
        if (this.CustomerSelected && this.StatusSelected) {
          res = ((((vehicle as any).user.customerName === this.CustomerSelected) || (this.CustomerSelected === NOT_SELECTED))
            && ((vehicle.status === this.StatusSelected) || (this.StatusSelected === NOT_SELECTED)))
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
