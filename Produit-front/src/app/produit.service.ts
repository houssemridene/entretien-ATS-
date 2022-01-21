import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {

  constructor(private http:HttpClient) { }
  getAll(pagenumber:number){
    return this.http.get("http://localhost:8080/api/products/"+pagenumber)
    
  }
  getProduit(id:number){
    return this.http.get("http://localhost:8080/api/product/"+id)
  }
}
