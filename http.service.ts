import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  url: string = "http://localhost:8081/student/update";
  url1:string = "http://localhost:8081/student/student"

  constructor(private http: HttpClient) { }

  getPostData() {
    return this.http.get(this.url);
  }

  postData(obj: any) {
    return this.http.post(this.url1, obj);
  }
}
