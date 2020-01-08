import { NgModule } from '@angular/core';
import { 
    MatButtonModule, 
    MatIconModule,
    MatToolbarModule,
    MatInputModule,
    MatFormFieldModule 
} from '@angular/material';

@NgModule({
    imports: [
        MatButtonModule, 
        MatIconModule,
        MatToolbarModule,
        MatInputModule,
        MatFormFieldModule 
    ],
    exports: [
        MatButtonModule, 
        MatIconModule,
        MatToolbarModule,
        MatInputModule,
        MatFormFieldModule 
    ]

})
export class MaterialModule {}