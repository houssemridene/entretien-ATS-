import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListproduitComponent } from './listproduit/listproduit.component';
import { HttpClientModule } from '@angular/common/http';
import { ProduitService } from './produit.service';
import { ProduitbyidComponent } from './produitbyid/produitbyid.component';

@NgModule({
  declarations: [
    AppComponent,
    ListproduitComponent,
    ProduitbyidComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ProduitService],
  bootstrap: [AppComponent]
})
export class AppModule { }
