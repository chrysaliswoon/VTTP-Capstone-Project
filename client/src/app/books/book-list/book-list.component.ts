import { Component, ElementRef, Input, OnInit, ViewChild } from '@angular/core';
import { NgModel } from '@angular/forms';
import { Router } from '@angular/router';
import { AppTopbarComponent } from 'src/app/layout/app.topbar.component';
import {  Book } from 'src/app/models/book';
import { Shelf } from 'src/app/models/shelf';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.scss']
})
export class BookListComponent implements OnInit{

  books!: Book[];
  bookName: String = '';
  shelf!: Shelf

  constructor(private router: Router, private bookSvc: BookService) { }


  ngOnInit(): void {
    this.getBooks
  }

  getBooks(bookName: String) {
    this.bookSvc.getBooks(bookName).subscribe(data => {
       this.books = data
       console.log(this.books.forEach);
  });
  }

searchBooks() {
    this.getBooks(this.bookName)
    this.router.navigate(
        ['dashboard/search'],
        {queryParams: {book: this.bookName}}
    );
}

addBook(id: string, title: string, url: string) {

  const email = localStorage.getItem("email");

  this.bookSvc.saveBooks(email, id, title, url).subscribe(data => {

    console.log(data)
  })

  

}


}
