import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProduitService } from '../produit.service';

@Component({
  selector: 'app-listproduit',
  templateUrl: './listproduit.component.html',
  styleUrls: ['./listproduit.component.css']
})
export class ListproduitComponent implements OnInit {
produit:any=[]
numberPage=0
  constructor(private produitservice:ProduitService,private router:Router) {

   }

  ngOnInit(): void {
    this.produitservice.getAll(this.numberPage).subscribe(data=>{
      this.produit = data
    })
  }
  next(){
    this.numberPage++
    this.produitservice.getAll(this.numberPage).subscribe(data=>{
      this.produit = data
    })

  }
  showdetails(id:number){
this.router.navigate(["produit",id])
  }
}
