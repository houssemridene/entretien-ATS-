import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProduitService } from '../produit.service';

@Component({
  selector: 'app-produitbyid',
  templateUrl: './produitbyid.component.html',
  styleUrls: ['./produitbyid.component.css']
})
export class ProduitbyidComponent implements OnInit {
produit:any
  constructor(private produitservice:ProduitService,private activatedrout:ActivatedRoute) { }

  ngOnInit(): void {
    console.log(this.activatedrout.snapshot.params["id"])
    this.produitservice.getProduit(this.activatedrout.snapshot.params["id"]).subscribe(data=>{
      console.log(data)
      this.produit=data
    })
  }

}
