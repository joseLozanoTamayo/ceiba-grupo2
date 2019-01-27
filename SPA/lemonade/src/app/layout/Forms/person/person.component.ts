import { Component, OnInit } from '@angular/core';
import { petitionservice } from 'src/app/shared/services/petitions';

export interface Persona {
    id: string;
    nombre: string;
    cedula: string;
    celular: string;
    sexo: string;
    pais: string;
    config: object;
}
@Component({
    selector: 'app-person',
    templateUrl: './person.component.html',
    styleUrls: ['./person.component.scss']
})
export class PersonComponent implements OnInit {

    public datos: Persona;
    public selectMode = false;

    constructor(public api: petitionservice) {
        this.datos = {
            id: '',
            nombre: '',
            cedula: '',
            sexo: 'masculino',
            pais: 'colombia',
            celular: null,
            config: {
                titulo: 'USUARIOS', path: 'pais', data: [
                    {
                        nombre: 'codigo',
                        dato: 'id'
                    },
                    {
                        nombre: 'nombre',
                        dato: 'nombre'
                    },
                    {
                        nombre: 'eliminar',
                        dato: 'id'
                    }
                ]
            }
        };
    }
    ngOnInit() {
    }

    rowSelect(item) {
        this.api.ejecutarGetId(this.datos.config['path'], item['codigo']).then(
            res => {
                console.log('res ', res);
            }
        );

    }

    crear() {
        this.selectMode = true;
    }
}
