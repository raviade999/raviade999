import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StringInterpotaionComponent } from './string-interpotaion/string-interpotaion.component';
import { EventBindingComponent } from './event-binding/event-binding.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PostComponent } from './post/post.component';


@NgModule({
  declarations: [
    AppComponent,
    StringInterpotaionComponent,
    EventBindingComponent,
    PostComponent      //----must be import componts
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,        //---import this modules
    HttpClientModule    //---import this clint modul
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
