import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListproduitComponent } from './listproduit/listproduit.component';
import { ProduitbyidComponent } from './produitbyid/produitbyid.component';

const routes: Routes = [
  {path:'produit',component:ListproduitComponent},
  {path:'produit/:id',component:ProduitbyidComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
