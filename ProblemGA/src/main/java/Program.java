/*
 * Copyright (C) 2024 aluno
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Willian Junior <willianjunior.c.f@gmail.com>
 * 
 */
public class Program {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int x1, x2, x3, y1, y2, y3;
        
        System.out.println("Informe o X e Y do primeiro ponto:");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        
        System.out.println("Informe o X e Y do segundo ponto:");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        
        System.out.println("Informe o X e Y do terceiro ponto:");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        
        int det = (x1 * y2 * 1) +
                    (y1 * 1 * x3) +
                      (1 * x2 * y3) -
                       (1 * y2 * x3) -
                        (x1 * 1 * y3) -
                         (y1 * x2 * 1);
        
        if(det == 0){
            System.out.println("Os pontos são colineares.");
            
            double dis = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        
            System.out.printf("A distancia entre o primeiro ponto e o segundo ponto e %.4f.", dis);
        
        } else System.out.println("Os pontos não são colineares.");
        
    }
}
