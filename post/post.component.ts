import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  posts: any[] = [];

  constructor(private service: HttpService) { }

  ngOnInit(): void {
    this.getData();
  }

  getData() {
    this.service.getPostData().subscribe((response: any) => {
      this.posts = response;
    });
  }

  onSend(name: string, location: string, email: string, age: string, contact: string) {
    const obj = {
      name,
      location,
      email,
      age,
      contact
    };

    this.service.postData(obj).subscribe((response) => {
      console.log(response);
      // Refresh the posts list after adding a new post
      this.getData();
    });
  }
}
