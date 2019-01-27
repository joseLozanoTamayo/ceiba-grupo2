import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable()
export class petitionservice {
	private path = ''
	private token = '1'

	constructor(private http: HttpClient) {
		this.path = 'http://localhost:8080/springbootwildfly'
	}

	public get(url: string): Observable<any> {
		let  header = new HttpHeaders(
			{
				"authorization": this.token
			}
		);
		let opciones={
			"headers":header
    	}

		return this.http.get(this.path+"/"+url, opciones);
	}

	public delete(url: string,id:string): Observable<any> {
		let  header = new HttpHeaders(
			{
				"authorization": this.token
			}
		);
		let opciones={
			"headers":header
    	}

		return this.http.delete(this.path+"/"+url+"/"+id, opciones);
	}

	public post(url: string,body:any): Observable<any> {
		let  header = new HttpHeaders(
			{
				"authorization": this.token
			}
		);
		let opciones={
			"headers":header,
			"body":body
    	}

		return this.http.post(this.path+"/"+url, opciones);
	}

	public getId(url: string,id:string): Observable<any> {
		let  header = new HttpHeaders(
			{
				"authorization": this.token
			}
		);
		let opciones={
			"headers":header
    	}

		return this.http.get(this.path+"/"+url+"/"+id, opciones);
	}
	/**
	 * ejecutarGet
	 */
	public ejecutarGet(url: string){
		return this.get(url).toPromise().then(
			(res)=>{
				return res;
			},
			err=>{
				return err;
			}
		)
	}
	/**
	 * ejecutarDelete
	 */
	public ejecutarDelete(url:string,id:string){
		return this.delete(url,id).toPromise().then(
			(res)=>{
				return res;
			},
			(err)=>{
				return err;
			}
		);
	}
	/**
	 * ejecutarGetId
	 */
	public ejecutarGetId(url:string,id:string){
		return this.getId(url,id).toPromise().then(
			(res)=>{
				return res;
			},
			(err)=>{
				return err;
			}
		);
	}
	/**
	 * ejecutarPost
	 */
	public ejecutarPost(url,body) {
		return this.post(url,body).toPromise().then(
			res=>{
				return res;
			},
			(err)=>{
				return err;
			}
		)
	}
}