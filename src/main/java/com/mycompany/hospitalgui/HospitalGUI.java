
package com.mycompany.hospitalgui;

import Menu.MenuPrincipal;
import Persistencia.*;


/**
 *
 * @author Jesús Pedro Lares Velncia (00000233383) y
 */
public class HospitalGUI {

    public static void main(String[] args) {
        IPersistenciaFachada persistencia = new PersistenciaFachada();
        MenuPrincipal menu = new MenuPrincipal(persistencia);
        menu.mostrar();
    }
}
